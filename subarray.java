public class subarray {
    public static void print_Subarry(int num[]){
        int tp=0;
        for(int i=0;i<num.length;i++){
            int start=i;
            for( int j=i;j<num.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(num[k]+" ");
                }
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The total number of subarray:" +tp);
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        print_Subarry(num);

        
    }
    
}
