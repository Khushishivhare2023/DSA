import java.util.*;

public class iteration_on_hashset {
    public static void main(String[] args) {
        HashSet<String>set=new HashSet<>();
        set.add("Mumbai");
        set.add("Delhi");
        set.add("Chennai");
        set.add("Pune");
         
        //using iterator
        Iterator it= set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // using enhanced for loop
        for(String city:set){
            System.out.println(city);
        }

    }
    
}
