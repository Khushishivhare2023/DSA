public class func_part2 {
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<=n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

    }
    public static int primeRange(int num){
        for(int i=2;i<=num;i++){
            if(isPrime(i)){
                System.out.println(i + " ");
            }
        }
        return num;
    }
    public static void main(String[] args) {
        System.out.println(primeRange(20));
        
    }
    
}
