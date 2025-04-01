import java.util.ArrayList;

public class arrylist {
    public static void swap(ArrayList<Integer>list, int idx1, int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(20);
        list.add(8);
        list.add(10);
        list.add(14);
        System.out.println(list);
        /*int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
        }
        System.out.println("Max Element:"+max);
        */
        int idx1=1, idx2=4;
        swap(list, idx1, idx2);
        System.out.println(list);

    }
    
}
