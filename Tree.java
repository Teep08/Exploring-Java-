import java.util.*;
public class Tree {

    //creation of node
    static class Node
    {
        int data;
        Node leftnode; 
        Node rightnode;
        Node(int data)
        {
            this.data = data;
            this.leftnode = null;
            this.leftnode = null;
        }
    }

    static class Treepreorder
    {
        static int idx = -1;    //index
        //function for creation of tree
        public static Node treecreation(int arr[])
        {
            idx++;

            //if data is -1 means null
            if(arr[idx] == -1)
            {
                return null;
            }

            Node newnode = new Node(arr[idx]);  //creation of new node
            newnode.leftnode = treecreation(arr);   //new node allocated to left side of the perent node
            newnode.rightnode = treecreation(arr);  //new node allocated to right side of the perent node
            return newnode;
        }

        //print a tree node data in preorder format 
        public static void treepreorderprint(Node root)
        {
            //if tree is empty or leaf is empty
            if(root == null)
            {
                return;
            }
            
            System.out.print(root.data+" ");    //print root data
            treepreorderprint(root.leftnode);   //for moving to left node of the root
            treepreorderprint(root.rightnode);  //for movinf to right node of the root
        }
        
        //function for measure the height of the tree
    public static int heightoftree(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int lef = heightoftree(root.leftnode);   //for moving to left node of the root
        int rig = heightoftree(root.rightnode);  //for movinf to right node of the root
        int par = Math.max(lef,rig)+1;          //It's add the left side subtree and right side subtree and add with 1 for parent node location
        return par;
    }
}
    public static void main(String args[])
    {
        int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};     //-1 is NULL
        Treepreorder obj = new Treepreorder();
        Node root = obj.treecreation(arr); 
        System.out.println("The root of the tree is: "+root.data);
        obj.treepreorderprint(root);
        System.out.println();
        System.out.println("Height of the tree is: "+ obj.heightoftree(root));
    }
}
