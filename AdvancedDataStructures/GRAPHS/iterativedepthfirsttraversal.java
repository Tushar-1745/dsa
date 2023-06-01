import java.io.*;
import java.util.*;
public class iterativedepthfirsttraversal {
    public static void main(String[] args) throws Exception {

        //iterative depth first traversal DFS code
        //if we replace queue by stack in bfs it becomes iterative dfs
        // because of replacement, euler path runs reverse.
        //in dfs, after removal of vtces it will go to children not to sibling
        //
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
        graph[v1].add(new Edge(v1, v2));
        graph[v2].add(new Edge(v2, v1));
        }

        int src = Integer.parseInt(br.readLine());
        
        boolean[] visited = new boolean[vtces];
        Stack<Pair> st = new Stack<>();

        st.push(new Pair(src, src+" "));

        //use RMWA principle

        while(st.size()>0){
            Pair rem = st.pop();    //here , r = removed from stack

            if(visited[rem.v]==true){
                continue;
            }

            visited[rem.v]=true;       // marked as visited;

            System.out.println(rem.v);   //work done = printing

            for(Edge e: graph[rem.v]){      // a = adding chilren of vertices
                if(visited[e.nbr]==false){
                    st.push(new Pair(e.nbr, rem.psf+e.nbr));
                }
            }
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

    static class Pair {
        int v;
        String psf;

        Pair(int v, String psf) {
        this.v = v;
        this.psf = psf;
        }
    }
}
