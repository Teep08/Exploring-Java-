import java.util.*;
public class BST {
    public static void main(String args[])
    {
        int arr[] = {5,1,3,4,2,7};
        Node root = null;   //defined root Node variable
        for(int num : arr)  //Loop for sending the array values to our Binarysearchtree method
        {
            root = Binarysearchtree(num,root);
        }
        print(root);    //calling print function
        search(root,9); //calling search function
    }

    //Node class
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    } 

    //Function for creation of BST, It's return a root value
    static Node Binarysearchtree(int data, Node root)
    {
        //when root is null means tree is empty
        if (root == null) {
            root = new Node(data);
            return root;
        }
        //If data is smaller then root data then it's goes to left sife of the Binary search tree
        if (data < root.data) {
            root.left = Binarysearchtree(data,root.left);
        }
        //Else if data is greater then root data then it's goes to right sife of the Binary search tree 
        else {
            root.right = Binarysearchtree(data,root.right);
        }
        return root;
    }

    //print function, In BST we print the tree data in IN-Order 
    static void print(Node root)
    {
        if(root==null)
        {
            return;
        }
        print(root.left);
        System.out.print(root.data+" ");
        print(root.right);
    }

    //Method for search the data in BST
    static void search(Node root,int data)
    { 
         //if data is not available in our tree
         if(root == null)
         {
             System.out.println("Not found");
             return;
         }
         //if data available in our tree
         if(root.data == data)
         {
             System.out.println("Data found");
             return;
         }
         //if data is smaller then root then data search in left side of the tree
         if(root.data > data)
         {
             search(root.left, data);
         }
         //if data is bigger then root then data search in right side of the tree
         else
         {
             search(root.right, data);
         }      
    }
}

/*
OUTPUT : 1 2 3 4 5 7 Not found
 */