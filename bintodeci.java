public class bintodeci {
    public static int bintodec(int binum){
        int mynum=binum;
        int pow =0;
        int dec=0;
        while(binum>0){
            int lstDig= binum%10;
            dec=dec+(lstDig*(int)Math.pow(2, pow));

            pow++;
            binum=binum/10;
        }
        System.out.println("The decimal of binary num "+ mynum + " is:" + dec);
        return binum;
    }
    public static void main(String[] args) {
        bintodec(111);
        
    }
    
}
