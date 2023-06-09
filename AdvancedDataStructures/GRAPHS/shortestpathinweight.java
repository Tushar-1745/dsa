import java.io.*;
import java.util.*;
import java.util.concurrent.CountDownLatch;
public class shortestpathinweight {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //This is dijkstra algorithm in Graphs
        //we are given weighted graph
        // in this problem we have to find the shortest path from src to dest in terms of weight
        //if it is in terms of edges simply use bfs
        // this is same as bfs (rm*wa*) but we have to use priority queue instead of queue.
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

        int src = Integer.parseInt(br.readLine());
        boolean[] visited = new boolean[vtces];

        PriorityQueue<Pair> queue = new PriorityQueue<>();
        queue.add(new Pair(src, src+"", 0));

        while(queue.size()>0){
            Pair rem = queue.remove();

            if(visited[rem.v]==true){
                continue;
            }
            visited[rem.v]=true;
            System.out.println(rem.v + "via" + rem.psf+ "@" + rem.wsf);

            for(Edge e: graph[rem.v]){
                if(visited[e.nbr]==false){
                    queue.add(new Pair(e.nbr + "via" + e.nbr+rem.psf + "@" + e.wt+rem.wsf))
                }
            }
        }
    }

    static class Pair implements Comparable< Pair> {
        int v;
        String psf;
        int wsf;

        Pair(int v, String psf, int wsf) {
        this.v = v;
        this.psf = psf;
        this.wsf = wsf;
        }

        public int compareTo(Pair o) {
        return this.wsf - o.wsf;
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
