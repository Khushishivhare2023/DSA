public class practicefunc4 {
    public static int sumofdigit(int num){
        int sum=0;
        while(num>0){
            int lastdig = num % 10;
            sum=sum+lastdig;
            num=num/10;
        }
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
        sumofdigit(124);
        
    }
    
}
