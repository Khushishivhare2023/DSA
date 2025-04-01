import java.util.*;
public class linersearch {
    public static int linearsearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args){
        int numbers[]={10,8,9,6,20,50,79,24};
        int key=24;
        int index=linearsearch(numbers, key);
        if(index==-1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("The number is at index:"+index);
        }

        
    }
    
}
