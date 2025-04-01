public class dectobin {
    public static int decitobin(int n){
        int mynum=n;
        int pow=0;
        int binum=0;
        while(n>0){
            int rem=n%2;
            binum=binum+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("The binary of decimal number "+ mynum + " is : "+ binum);
        return binum;

    }
    public static void main(String[] args) {
        decitobin(7);
        
    }
    
}
