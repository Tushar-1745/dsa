import java.io.*;
import java.util.*;
public class graphs {
    // graph is consists of edges which has src nbr and wt.
    // we have to make class of edge with nbr and src and wt
    // we will need array of arraylist of edge

    public static class Edge{
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt){
            this.src=src;
            this.nbr=nbr;
            this.wt=wt;
        }
    }
    public static void main(String[] args){
        int vertices=7;
        ArrayList[] graph = new ArrayList[7];

        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2,20));

        for(int i=0;i<)
    }
}
