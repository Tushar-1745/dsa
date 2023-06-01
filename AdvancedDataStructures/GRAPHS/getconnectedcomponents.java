import java.io.*;
import java.util.*;

public class getconnectedcomponents {
  // in graph it is not necessary for components to be connected sometimes we
  // might get unconnected edges
  // here we have to find connected components
  // perform loop for every vertices
  // same as printallpaths program
  // we would need arraylist of arraylist to store the value answer
  // we need to make tree of every vertices so need to make a function to draw
  // tree
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

  public static void printAllPaths(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited, String psf) {
    if (src == dest) {
      System.out.println(psf);
      return;
    }

    visited[src] = true;
    for (Edge e : graph[src]) {
      if (!visited[e.nbr]) {
        printAllPaths(graph, e.nbr, dest, visited, psf + e.nbr);
      }
    }
    visited[src] = false;
  }

  }

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
        int wt = Integer.parseInt(parts[2]);
        graph[v1].add(new Edge(v1, v2, wt));
        graph[v2].add(new Edge(v2, v1, wt));

        ArrayList<ArrayList<Integer>>[] comps = new ArrayList<>();      // to store the connected components
        boolean[] visited = new boolean[vtces];                      // it helps to traverse only one time 

        for(int i=0;i<vtces;i++){                          
          if(visited[i]==false){
            ArrayList<Integer> comp = new ArrayList<>();
            dfs(graph, i, visited, comp);
            comps.add(comp);
          }
        }
        System.out.println(comps);
      }

  // now need to make tree of the nbr of the vtcs
  // here comp is first arraylist
  // this is for the nbr of the vtces
  public static void dfs(ArrayList<Edge>[] graph, int src, boolean[] visited, ArrayList<Integer> comp) {
    visited[src] = true;
    comp.add(src);

    for (Edge e : graph[src]) {
      if (visited[e.nbr] == false) {
        dfs(graph, e.nbr, visited, comp);
      }
    }
  }}}

  ArrayList<ArrayList<Integer> comps = new ArrayList<>();visited[]boolean=new boolean[vtces];

  for(
  int i = 0;i<vtces;i++){if(visited[i]==false)
  {
    ArrayList<Integer> comp = new ArrayList<>();
    dfs(graph, i, visited, comp);
    comps.add(comp);
  }
}

public static void dfs(ArrayList<Edge>[] graph, int src, boolean[] visited, ArrayList<Integer> comp){
  visited[src]=true;
  comp.add(src);

  for(Edge e: graph[src]){
    if(visited[e.nbr]==false){
      dfs(graph, e.nbr, src, comp);
    }
  }
}
