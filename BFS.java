import java.util.*;
public class BFS {
//Edge class
    static class Edge{
        int source;
        int destination;
        int weight;
        Edge(int s,int d, int w)
        {
            this.source = s;
            this.destination = d;
            this.weight = w;
        }
    }
    //creation of graph
    public void creation(ArrayList<Edge> main[])
    {
        //create edges in arraylist
        for(int i=0;i<main.length;i++)
        {
            main[i] = new ArrayList<>();    //creation of arraylist on perticular cell for perticular vertices on main arraylist
        }

        //input the graph data for "0" edge
        main[0].add(new Edge(0,1,1));

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
    }

    //Breadth first search method
    public void BFS(ArrayList<Edge> main[])
    {
        Queue<Integer> q = new LinkedList<>();  //It's store the currently visited edges data 
        boolean vis[] = new boolean[main.length];   //It's for checking the visited edges

        q.add(0);   //started the BFS from edge "0"
        while(!q.isEmpty()) //loop will continou till our queue is not empty
        {
            int curr = q.remove();  //store the q current value in curr variable and remove the current queue data

            if(!vis[curr])  //checking is it already visited edge 
            {
                System.out.println(curr);   //print the visit edge data
                vis[curr] = true;   //make the value "true" in vis array so we will identify the visited edges
                for(int i=0;i<main[curr].size();i++)    //Geeting neabour edge data for current edge 
                {
                    Edge e = main[curr].get(i); //It's get the data of current edge and store it in variable "e"
                    q.add(e.destination);   //store the linked edges data with our current edge 
                }
            }
        }
    }
   public static void main(String args[])
   {
        BFS obj = new BFS();    //create object of class
        int v =5;   //total number of vertices
        ArrayList<Edge> [] main = new ArrayList[v];//creation of arraylist with datatype of edge and the size of "v (means total vertices)"
        obj.creation(main); //calling tree creation method
        obj.BFS(main);  //calling Breadth first search method
   }
    
}

/*
OUTPUT :
0
1
2
3
4
 */