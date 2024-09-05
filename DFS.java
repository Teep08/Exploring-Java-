import java.util.*;
public class DFS {
    //Edge class
    static class Edge
    {
        int source;
        int destination;
        Edge(int s, int d)
        {
            this.source = s;
            this.destination = d;
        }
    }

    public static void creation(ArrayList<Edge> []graph)
    {
        //create edges in arraylist
        for(int i=0;i<graph.length;i++)
        {
            graph[i] = new ArrayList<>();   //creation of arraylist on perticular cell for perticular vertices on main arraylist
        }

        //input the graph data and constructed the tree
        graph[0].add(new Edge(0,1));
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
        graph[2].add(new Edge(2,4));
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));
        graph[4].add(new Edge(4,2));
    }

    public static void DepthFirstSearch(ArrayList<Edge> []graph,int current,boolean []vis)
    {
        //print the current edge data
        System.out.print(current+" ");

        //make current visit to true in vis array
        vis[current] = true;

        //loop to get the connected edges of current edge
        for(int i=0;i<graph[current].size();i++)
        {
            Edge e = graph[current].get(i); //It's get the data of current edge and store it in variable "e"
            //check if current edge neighbours value is true in vis array
            if(!vis[e.destination])
            {
                DepthFirstSearch(graph, e.destination, vis);    //calling the function itself for repeat the steps until it covers all the edges
            }
        }
    }

    public static void main(String args[])
    {
        ArrayList<Edge> []graph = new ArrayList[5];
        creation(graph);
        DepthFirstSearch(graph, 0, new boolean[graph.length]);
    }
}

/*
OUTPUT :
0 1 2 3 4 
 */
