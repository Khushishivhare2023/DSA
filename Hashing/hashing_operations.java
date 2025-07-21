import java.util.*;
public class hashing_operations {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();

        //Insert - O(1)
        map.put("India",1000);
        map.put("China",2000);
        map.put("USA",3000);
        System.out.println(map);

        //get -O(1)
        System.out.println(map.get("China"));
        System.out.println(map.get("Indonesia"));

        //containsKey - O(1)
        System.out.println(map.containsKey("India"));
        System.out.println(map.containsKey("Russia"));

        //remove - O(1)
        System.out.println(map.remove("China"));
        System.out.println(map);

        //Iterate
        Set<String>keys=map.keySet();
        for (String k : keys) {
            System.out.println("Key="+ k + ", value="+ map.get(k));
            
        }


        
    }
    
}
