import java.io.*;

import java.util.*;

public class spreadofinfection {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //it is also the example of BFS 
        // need to use same rmwa principle
        // have a pair of vertices and time
        // here no work of printing
        int vtces = Integer.parseInt(br.readLine());
        ArrayList[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
        graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
        String[] parts = br.readLine().split(" ");
        int v1 = Integer.parseInt(parts[0]);
        int v2 = Integer.parseInt(parts[1]);
        graph[v1].add(new Edge(v1, v2));
        graph[v2].add(new Edge(v2, v1));
        }

        int src = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());
        
        ArrayDeque<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(src,1));

        int[] visited = new int[vtces];      // to store the if it is visited
        int count=0;                              //to update the infected persons

       while(queue.size()>0){
            Pair rem = queue.removeFirst();           //remove

            if(visited[rem.v]>0){                // means it is already infected
                continue;                         //marked
            }
            visited[rem.v]=rem.time;              // to store the time of infection
            if(rem.time>t){                       
                break;
            }
            count++;

            for(Edge e: graph[rem.v]){            //add*
                if(visited[e.nbr]==0){
                    queue.add(new Pair(e.nbr, rem.time+1));
                }
            }
       }
       System.out.println(count);             //printing the no. of infected persons withing given time
    }

    static class Pair {
        int v;
        int time;

        Pair(int v, int time) {
        this.v = v;
        this.time = time;
        }
    }
    static class Edge {
        int src;
        int nbr;

        Edge(int src, int nbr) {
        this.src = src;
        this.nbr = nbr;
        }
    }
}
