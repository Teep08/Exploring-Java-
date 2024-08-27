import java.util.*;
public class Set {
    public static void main(String args[])
    {
        //HashSet creation
        HashSet<Integer> hs = new HashSet<>();
        hs.add(123);
        hs.add(673);
        hs.add(927);
        hs.add(294);
        hs.add(508);
        System.out.println("HashSet : Random order");
        System.out.println(hs);

        //LinkedHashSet creation
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(123);
        lhs.add(673);
        lhs.add(927);
        lhs.add(294);
        lhs.add(508);
        System.out.println("LinkedHashSet : Insertion order");
        System.out.println(lhs);

        //HashTree creation
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(123);
        ts.add(673);
        ts.add(927);
        ts.add(294);
        ts.add(508);
        System.out.println("TreeSet : ascending order");
        System.out.println(ts);
    }
}

/*
OUTPUT :
HashSet : Random order
[673, 294, 123, 508, 927]
LinkedHashSet : Insertion order
[123, 673, 927, 294, 508]
TreeSet : ascending order
[123, 294, 508, 673, 927]
 */
