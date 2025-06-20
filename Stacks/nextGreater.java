import java.util.*;
public class nextGreater {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        int n=arr.length;
        Stack<Integer> s=new Stack<>();
        int[] nxtGreater=new int[n];

        for(int i=n-1;i>=0;i--){
            //while
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            // if else
            if(s.isEmpty()){
                nxtGreater[i]=-1;
            }
            else{
                nxtGreater[i]=arr[s.peek()];
            }
            //push element 
            s.push(i);
        }
        for(int i=0;i<nxtGreater.length;i++){
            System.out.println(nxtGreater[i]+" ");
        }
        System.out.println();

    }
    
}
