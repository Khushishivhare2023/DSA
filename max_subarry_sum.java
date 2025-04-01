public class max_subarry_sum {
    public static void maxsum(int num[]){
        int currsum=0,maxsum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                currsum=0;
                for(int k=start;k<=end;k++){
                    currsum+=num[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("The maximum sum of subarray:"+maxsum);
    }
    public static void main(String[] args) {
        int num[]={1,-2,6,-1,3};
        maxsum(num);
    }
    
}
