import java.util.*;
public class functions {
    /* 
    public static void swapnum(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a:"+ a);
        System.out.println("b:"+ b);
    }
    */
    // Call by value example 
    /* 
    public static void changenum(int a){
        a=10;
    }
    */
    
    // Product of a and b 
    /* 
    public static int productNum(int a, int b){
        Scanner sc= new Scanner(System.in);
         a = sc.nextInt();
         b= sc.nextInt();
        int prod = a*b;
        return prod;

    */
    // Factorial of a number 
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int binocoef(int n,int r){
        int n_fact= factorial(n);
        int r_fact= factorial(r);
        int nmr_fact=factorial(n-r);

        int bino= n_fact/(r_fact*nmr_fact);
        return bino;
    }
        
    
    public static void main(String[] args){
        /* 
        int a=10;
        int b=6;
        swapnum(a,b);
        */
        /* 
        int a=5;
        changenum( a );
        System.out.println(a);
        */
        // int product =productNum(0, 0);
        // System.out.println(product);

        System.out.println(binocoef(5, 2));
       





    }
    
    
}
