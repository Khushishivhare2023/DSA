import java.util.*;
public class loops {
    public static void main(String[] args) {
        /* 
        System.out.println("Printing nummbers from 1 to 10 ");
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
        */
        /* 
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
        */
        /*
        // Sum of n natural numbers 
        System.out.println("Enter n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
        */
        // printing square pattern
        /* 
        for(int i=1;i<=4;i++){
            System.out.println("****");
        }
        */
        // printing the reverse of a number 
        /*
        int n=109882;
        while(n>0){
            int lastDigit=n%10;
            System.out.println(lastDigit);
            n=n/10;
        }
        System.out.println("");
        */
        // reverse the given number 
        /* 
        int n=109283;
        int rev=0;
        while(n>0){
            int lastDigit=n%10;
            rev=(rev*10)+lastDigit;
            n=n/10;
        }
        System.out.println(rev);
        */

        // Break Statement 
        // keep entering numbers till user enters the multiple of 10 
        /* 
        System.out.print("Enter your number:");
        Scanner sc = new Scanner(System.in);
        do{
            int num=sc.nextInt();
            if(num%10==0){
                break;
            }
            System.out.println(num);
        }while(true);
        */

        // Continue Statement 
        /*
        for(int i=1;i<=6;i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
        */

        // display all numbers entered by user except multiples of 10 
        /*
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter your number: ");
            int num= sc.nextInt();
            if(num%10==0){
                continue;
            }
            System.out.println(num);
        }while(true);
        */

/* 
        // Prime number 
        Scanner sc= new Scanner (System.in);
        int n = sc.nextInt();
        boolean isPrime=true;
        if(n==2){
            System.out.println("Prime");
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isPrime=false;
                }
            }
            if(isPrime=true){
                System.out.println(n +"is Prime");
            }
            else{
                System.out.println(n +"is not Prime");
            }
        }
        
*/
/* 

// Factorial of a number 
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number:");
int n = sc.nextInt();
int fact = 1;
for(int i=n;i>=1;i--){
    fact=fact*i;
}
System.out.println("The factorial of a number is :" + fact);
*/

/* 

// Multiplication table
Scanner sc= new Scanner(System.in);
int n= sc.nextInt();
for(int i=1;i<=10;i++){
    System.out.println(n + "x" + i + "=" + n*i);
}
*/

// reads the set of integers and then print the sum of even and odd integers
Scanner sc = new Scanner(System.in);
int number;
int choice;
int evenSum = 0;
int oddSum = 0;
do {
System.out.print("Enter the number ");
number = sc.nextInt();
if( number % 2 == 0) {
evenSum += number;
} 
else {
oddSum += number;
}
System.out.println("Do you want to continue? Press 1 for yes or 0 for no");
choice = sc.nextInt();
} while(choice==1);
System.out.println("Sum of even numbers: " + evenSum);
System.out.println("Sum of odd numbers: " + oddSum);





    }
}
