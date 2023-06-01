import java.beans.Visibility;
import java.io.*;
import java.util.*;
public class breadthfirsttraversal {
    static class Edge {
        int src;
        int nbr;

        Edge(int src, int nbr) {                       // queue is first in first out data structure
        this.src = src;                                 //  front        rear
        this.nbr = nbr;                                //     |            |
        }                                            //      [7][2][4][6][9] 
    }                                                    //   0  1  2  3  4

    //bft is levelorder traversing
    // bft works on remove mark work add (rmwa)  r=pop m=visited w=print source and psf, a=add unmarked neighbours
    // will use queue data structure(fifo) 
    // first in queue add source and psf
    // it is called bfs because it level increases with radius
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());
        ArrayList< Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
        graph[i] = new ArrayList< >();
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
        
        // remember rm*wa*  remove mark print add children

        ArrayDeque<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(src, src+""));
        boolean[] visited = new boolean[vtces];

        while(queue.size()>0){
            Pair rem = queue.remove();           // remove pair
            if(visited[rem.v]==true){
                continue;
            }
            visited[rem.v]=true;                 // mark it as visited

            System.out.println(rem.v +"@" + rem.psf);       // work = printing psf

            for(Edge e: graph[rem.v]){                       // a* = adding its neighbours
                if(visited[e.nbr]==false){
                    queue.add(new Pair(e.nbr, rem.psf+e.nbr));
                }
            }

        }
    }

    static class Pair {
        int v;
        String psf;

        Pair(int v, String psf) {
        this.v = v;
        this.psf = psf;
        }
    }
}
