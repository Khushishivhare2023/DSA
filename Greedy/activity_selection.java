import java.util.*;
public class activity_selection {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        
        ArrayList<Integer>ans=new ArrayList<>();
        int maxcnt=0;
        ans.add(0);

        maxcnt=1;
        int lastend=end[0];
        for(int i=1;i<end.length;i++){
            while(start[i]>=lastend){
                maxcnt++;
                ans.add(i);
                lastend=end[i];
            }
        }
        System.out.println("Max activities: "+ maxcnt);
        

    }
    
}
