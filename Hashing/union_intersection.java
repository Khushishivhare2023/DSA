import java.util.ArrayList;
import java.util.HashSet;

public class union_intersection {
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        HashSet<Integer>set=new HashSet<>();
        ArrayList<Integer>list=new ArrayList<>();

        //union
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        System.out.println("UNION: "+set.size());
        for(int s:set){
            list.add(s);
        }
        System.out.println(list);
        set.clear();
        list.clear();
        //Intersection
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        int cnt=0;
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                cnt++;
                list.add(arr2[i]);
                set.remove(arr2[i]);
            }
        }
        System.out.println("INTERSECTION: "+cnt);
        System.out.println(list);
        
    }
    
}
