import java.util.*;
public class Map {
    public static void main(String args[])
    {
        //declear Hashmap and the name is hm (keys are in unshorted order)
        HashMap<String,Integer> hm = new HashMap<>();
        //add data in hashmap
        hm.put("bgc",11);
        hm.put("akl",12);
        hm.put("ghy",13);

        //declear linkedhashmap and the name is hm (Keys are insertion order)
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        //add data in linkedhashmap
        lhm.put("bgc",11);
        lhm.put("akl",12);
        lhm.put("ghy",13);

        //declear treemap and the name is hm (Keys are in sorted order)
        TreeMap<String,Integer> tm = new TreeMap<>();
        //add data in treemap
        tm.put("bgc",11);
        tm.put("akl",12);
        tm.put("ghy",13);

        //Print
        System.out.println(hm);
        System.out.println(lhm);
        System.out.println(tm);
    }   
}
