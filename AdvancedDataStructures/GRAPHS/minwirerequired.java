import java.io.*;
import java.util.*;
public class minwirerequired {

    //Minimum wire required to connect all PCs

        //Prim's Algorithm Minimum Spanning Tree 
        //PC are represented as graphs vertices we have to tell how much minimum wire is required to connect all PCs
        

        //MST - is subgraph. it is of type tree, connected, acyclic, it will include all vertice
        // out of all spannig tree which has minimus edges sum it is mst.

        // this also works on principle rmwa. Here we will use priority queue
        // have to make pair of vertex, p, wt;

        //the difference between prim's and dijkstra is that in dijkstra we add past vertices's  data. but in prim
        // new pair is restricted only for it


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int vtces = Integer.parseInt(br.readLine());
        ArrayList< Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
          graph[i] = new ArrayList<>();
        }
    
        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
          String[] parts = br.readLine().split(" ");
          int v1 = Integer.parseInt(parts[0]);
          int v2 = Integer.parseInt(parts[1]);
          int wt = Integer.parseInt(parts[2]);
          graph[v1].add(new Edge(v1, v2, wt));
          graph[v2].add(new Edge(v2, v1, wt));
        }

        int src=0;

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, -1, 0));

        boolean[] visited = new boolean[vtces];

        while(pq.size()>0){
            Pair rem = pq.remove();    //here we remove

            if(visited[rem.v]==true){
                continue;
            }

            visited[rem.v]=true;     // here marked as visited 

            if(rem.av!=-1){     
                System.out.println("["+rem.v+"-"+rem.av+"@"+rem.wt+"]");   // here we work means print
            }

            for(Edge e: graph[rem.v]){      // here a means adding vertices children;
                if(visited[e.nbr]==false){
                    pq.add(new Pair(e.nbr, rem.v, e.wt)); //imp in prim's unlike dijkstra 
                                                          // we have not added data of last vtces in current vtces
                }
            }
        }
        
    }

    static class Pair implements Comparable<Pair>{
        int v;
        int av;
        int wt;

        Pair(int v, int av, int wt){
            this.v=v;
            this.av=av;
            this.wt=wt;
        }

        public int compareTo(Pair o){
            return this.wt -o.wt;
        }
    }
    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
        this.src = src;
        this.nbr = nbr;
        this.wt = wt;
        }
    }
}