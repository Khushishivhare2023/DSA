import java.util.*;
public class multidimensionalArr {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer>List1=new ArrayList<>();
        List1.add(1);
        List1.add(2);
        mainList.add(List1);

        ArrayList<Integer>List2=new ArrayList<>();
        List2.add(3);
        List2.add(4);
        mainList.add(List2);

        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer>currList= mainList.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainList);    
    }
    
}
