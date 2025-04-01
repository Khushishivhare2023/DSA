public class largest_arry {
    public static int largest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;
    }
    public static int smallest(int numbers[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,8,10,6,5};
        System.out.println("The largest number is:"+ largest(numbers));
        System.out.println("The smallest number is:"+ smallest(numbers));
        

    }
    
}
