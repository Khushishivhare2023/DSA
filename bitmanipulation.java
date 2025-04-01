public class bitmanipulation {
    public static void oddeven(int n){
        int bitmask=1;
        if((n & bitmask)==1){
            System.out.println("Odd number");
        }
        else{
            System.out.println("Even number");
        }
    }
    public static int GetIthbit(int n,int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int SetIthbit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }
    public static int ClearIthbit(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    public static int updatebits(int n,int i,int newbit){
        n=ClearIthbit(n,i);
        int bitmask=newbit<<i;
        return n|bitmask;
    }
    public static int clearlastbits(int n,int i){
        int bitmask=(~0)<<i;
        return n & bitmask;
    }
    public static void main(String[] args){
        // oddeven(3);
        // System.out.println(GetIthbit(10, 2));
        // System.out.println(SetIthbit(10,2));
        // System.out.println(ClearIthbit(10,1));
        // System.out.println(clearlastbits(15, 2));
        // System.out.println(updatebits(10, 2, 1));
    

        
    }
    
}
