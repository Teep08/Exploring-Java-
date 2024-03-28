import java.util.*;
public class TwoDArraylist {
    public static void main(String args[])
    {
        //mainlist which store the sub arraylist
    ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>(); 

    //creating a sub arraylist
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();

    //add values in sub arraylist 1
    list1.add(1);
    list1.add(2);
    list1.add(3);

    //add values in sub arraylist 2
    list2.add(4);
    list2.add(5);
    list2.add(6);

    //add the subarray's into our main arraylist
    mainlist.add(list1);
    mainlist.add(list2);

    //print main arraylist
    System.out.println(mainlist);
    }
}

// OUTPUT : [[1, 2, 3], [4, 5, 6]]
