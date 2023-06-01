import java.io.*;
import java.util.*;
public class isgraphcyclic{
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

    // cycle is present if one vertices is already marked means already visited.
    //cycle means complete box such as square or triangle
    // if we get two paths to reach one vertices that means cycle is present while doing bfs
    // have to use bfs to find cycle   means rm*wa*
    // have to use for loop in case if we get disconnected graph just like isConnected graph program(in main method)
    // we will get vertices already marked

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

        boolean[] visited = new boolean[vtces];
        for(int v=0;v<vtces;v++){
            if(visited[v]==false){
                boolean cycle = IsCyclic(graph, v, visited);
                if(cycle){
                    System.out.println(true);
                }
            }
        }
        System.out.println(false);
    }

    public static boolean  IsCyclic(ArrayList<Edge>[] graph, int src, boolean[] visited){
        ArrayDeque<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(src, src+""));

        while(queue.size()>0){
            Pair rem = queue.remove();      //remove

            if(visited[rem.v]==true){       // if it is already marked  it is cycle return true;
                return true;
            }
            visited[rem.v]=true;            // mark

            for(Edge e: graph[rem.v]){        // we have not work to print so direct add neighbours
                if(visited[e.nbr]==false){
                    queue.add(new Pair(e.nbr, rem.psf+e.nbr));
                }
            }
        }
        return false;
    }
    static class Pair{
        int v;
        String psf;

        Pair(int v, String psf){
            this.v = v;
            this.psf = psf;
        }
    }
}