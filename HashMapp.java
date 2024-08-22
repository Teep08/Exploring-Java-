import java.util.*;
public class HashMapp {
    public static void main(String args[])
    {
        //declear Hashmap and the name is hm
        HashMap<String,Integer> hm = new HashMap<>();

        //add data in hashmap
        hm.put("abc",101);
        hm.put("def",102);
        hm.put("ghi",103);

        //print hashmap
        System.out.println(hm);

        //get the value of perticular key
        System.out.println("Value of def key is: "+hm.get("def"));

        //Check any perticular key in our Hashmap
        System.out.println("Value of def key is present: "+hm.containsKey("def"));
        System.out.println("Value of jkl key is present: "+hm.containsKey("jkl"));

        //remove any perticular key from hashmap
        System.out.println("value remove: "+ hm.remove("def"));   //it's print the value of def key and remove this data from hashmap

        //print hashmap
        System.out.println(hm);

        //size of hashmap
        System.out.println("Size of hashmap is: "+hm.size());

        //Check hashmap is empty or not 
        System.out.println("Hash map is empty: "+hm.isEmpty());

        //clear the hashmap data
        hm.clear();

        //Check hashmap is empty or not 
        System.out.println("Hash map is empty: "+hm.isEmpty());
    }
}

/*
OUTPUT :
{abc=101, def=102, ghi=103}
Value of def key is: 102
Value of def key is present: true
Value of jkl key is present: false
value remove: 102
{abc=101, ghi=103}
Size of hashmap is: 2
Hash map is empty: false
Hash map is empty: true
 */