import java.io.*;
import java.util.*;

public class orderofcompilation {
    // TOPOLICAL SORT ALGORITHM WITH DFS

    //used for directed graph and acyclic == in directed 0 --> 1 not 1 --> 0 but in indirected 1 --> 0 and also 0 --> 1
    // Topological Sort -> A permutation of vertices for a directed acyclic graph is called totpological sort 
    // and if directed edges uv, u appears before v in the graph.
    //used in word dependencies means suppose file1 is dependent on file2, file2 is dependent on file3
    // so first file3 must be compiled, then file2 must be compiled and then file1 is compiled
    //we make stack. we run loop for each vertice
    //mark it visit, add its neighbours and again go on unvisited vertices (just traveling)
    //in post order of euler path, put vertice in stack
    //order of work is opposite of topological sort

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
        graph[v1].add(new Edge(v1, v2));
        }

        boolean[] visited = new boolean[vtces];   //creating visited loop for only once visit
        Stack<Integer> st = new Stack<>();        // to store the element as it is lifo
        for(int i=0;i<vtces;i++){             // loop for vtces 
            if(visited[i]==false){            // we will call loop only if it is not visited
                totpologicalsort(graph, i, visited, st);
            }
        }

        while(st.size()!=0){
            System.out.println(st.pop());
        }
    
    }

    public static void totpologicalsort(ArrayList<Edge>[] graph, int src, boolean[] visited, Stack<Integer> st){
        visited[src] = true;         //here vtces is marked as visited
        for(Edge e: graph[src]){     //loop for its child
            if(visited[e.nbr]==false){        // work only if its not visited
                totpologicalsort(graph, e.nbr, visited, st);
            }
        }
        st.push(src);   //adding vtces in stack
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
