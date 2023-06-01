import java.io.*;
import java.util.*;
public class isgraphbipartite{

    //A graph is said to be bipartite if it is possible to divide vertice of graph into two mutually exclusive and 
    // exhaustive subsets
    // means we have to make two sets to divide vertices of graph
    //mutually exclusive means intersection of two sets must be zero
    // and exhaustive means all vertices are in either of them
    //imp all the edges must be across the sets not in the same set
    //if above all conditions are true then graph is bipartite 
    //even size cycle is bipartite but odd size cycle is not bipartite
    //every non-cyclic graph is bipartite

    //we have to use bfs 
    //instead of boolean visited array, we will have integer array to store its visited level
    // here we will add level in pair. level will tell in which level vertices is visited
    // if visited level and old level are same then it is even cycle means bipartite and
    // if levels are not same then it is odd cycle means it is not bipartite

    public static boolean checkingforbipartite(ArrayList<Edge>[] graph, int src, int[] visited){
        ArrayDeque<Pair> pq = new ArrayDeque<>();
        pq.add(new Pair(src, src+" ", 0));

        while(pq.size()>0){
            Pair rem = pq.removeFirst();

            if(visited[rem.v]!=-1){
                if(rem.level!=visited[rem.v]);{
                    return false;
                }
            }
            else{
                visited[rem.v]= rem.level;
            }

            for(Edge e: graph[rem.v]){
                if(visited[e.nbr]==-1){
                   pq.add(new Pair(e.nbr, rem.psf+e.nbr, rem.level+1));
                }
            }
        }
        return true;
    }
    
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
    
        int[] visited = new int[vtces];
        Arrays.fill(visited, -1);

        for(int v=0;v<vtces;v++){
            if(visited[v]==-1){
               boolean isgraphbipartite= checkingforbipartite(graph, v, visited);
               if(isgraphbipartite==false){
                    System.out.println(false);
                    return;
               }
            }
        }
        System.out.println(true);
    }

    static class Pair {
        int v;
        String psf;
        int level;


        Pair(int v, String psf, int level) {
        this.v= v;
        this.psf=psf;
        this.level = level;
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