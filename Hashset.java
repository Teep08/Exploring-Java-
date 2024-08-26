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

        //checking key:9 is exists in our hashset
        if(hs.contains(9))
        {
            System.out.println("Contains");
        }
        else
        {
            System.out.println("Not Contains");
        }
    }
}

/*
OUTPUT :
[0, null, 2, 7, 8]
Not Contains
 */
