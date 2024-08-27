import java.util.*;
public class Hashset {
    public static void main(String args[])
    {
        //declear Hashset and the name is hm
        HashSet<Integer> hs = new HashSet<>();
        //add keys in Hashset
        hs.add(2);
        hs.add(7);
        hs.add(8);
        hs.add(0);
        hs.add(8);  //key 8 is alread exists in hashset so it will not add
        hs.add(null);   //we can store null as a key in hashset

        //print hashset keys
        System.out.println(hs);

        //Iteration on hash set
        Iterator it = hs.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+",");
        }
        System.out.println();

        //for each loop
        for(Integer in : hs)
        {
            System.out.print(in+",");
        }
    }
}

/*
OUTPUT : 
[0, null, 2, 7, 8]
0,null,2,7,8,
0,null,2,7,8,
 */
