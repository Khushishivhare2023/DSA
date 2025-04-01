public class practicefunc3 {
    public static boolean isPalindrome(int num){
        int palin=num;
        int rev=0;
        while(palin>0){
           int lstDigit=palin%10;
           rev=rev*10+lstDigit;
           palin=palin/10;
        }
        System.out.println("The reverse of a number is:" + rev );
        if(num==rev){
            return true;
        }
        return false;  
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(1287));
    }
    
}
