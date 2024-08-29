import java.util.*;
public class graph {
    //edge class which contain source, destination and weight of the edge
    static class Edge
    {
        int source;
        int destination;
        int weight;
        Edge(int s, int d, int w)
        {
            this.source = s;
            this.destination = d;
            this.weight = w;
        }
    }

    public static void main(String args[])
    {
        int v = 5;  //total number of vertices
        ArrayList<Edge> [] main = new ArrayList[v]; //creation of arraylist with datatype of edge and the size of "v (means total vertices)"

        for(int i=0;i<v;i++)
        {
            main[i] = new ArrayList<>();    //creation of arraylist on perticular cell for perticular vertices on main arraylist
        }

        //input the graph data for "0" edge
        main[0].add(new Edge(0,1,5));

        //input the graph data for "1" edge
        main[1].add(new Edge(1,0,5));
        main[1].add(new Edge(1,2,1));
        main[1].add(new Edge(1,3,3));

        //input the graph data for "2" edge
        main[2].add(new Edge(2,1,1));
        main[2].add(new Edge(2,3,1));
        main[2].add(new Edge(2,4,2));

        //input the graph data for "3" edge
        main[3].add(new Edge(3,1,3));
        main[3].add(new Edge(3,2,1));

        //input the graph data for "4" edge
        main[4].add(new Edge(4,2,2));

        //Geeting neabour edge data for edge "2" 
        for(int i=0;i<main[2].size();i++)
        {
            Edge e = main[2].get(i);    //It's get the data od edge 2 and store it in variable "e"
            System.out.println(e.destination);  //print destination of edge 2 because destination is the neabour of edge 2
        }

    }
}

/* 
OUTPUT :
1
3
4
 */