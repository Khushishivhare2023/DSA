import java.util.*;
public class linearsearch2 {
    public static int search(String menu[],String key){
        for(int i=0;i<menu.length;i++){
            if(menu[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String menu[]={"dosa","manchurian","noodles","pani puri","maggie","pav bhaji","omellete"};
        String key="pani puri";
        int index=search(menu, key);
        if(index==-1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("The order is in index:"+index);
        }
    }
}
