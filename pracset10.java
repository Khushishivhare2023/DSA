import java.util.Scanner;
public class pracset10 {
    public static void main(String[] args) {

        // 1)System.out.println("Enter the number:");
        Scanner sc= new Scanner(System.in);
        // int num= sc.nextInt();
        // if(num>=0){
            // System.out.println("Positive Number");
        // }
        // else{
            // System.out.println("Negative number");
        // }



        //  2)
        /* 
        double temp=99.2; 
        if(temp>100){
            System.out.println("You have a fever");
        }
        else{
            System.out.println("You don't have fever");
        }
*/


//      3)
/* 
    System.out.println("Enter the day number:");
    int Day = sc.nextInt();
    switch (Day) {
        case 1:
        System.out.println("Monday");
        break;
        case 2:
        System.out.println("Tuesday");
        break;
        case 3:
        System.out.println("Wednesday");
        break;
        case 4:
        System.out.println("Thursday");
        break;
        case 5:
        System.out.println("Friday");
        break;
        case 6:
        System.out.println("Saturday");
        break;
        case 7:
        System.out.println("Sunday");
        break;

        default:
        System.out.println("Invalid Input");
            break;
    }
    */

    // 5)
    System.out.println("Enter the year:");
    int year=sc.nextInt();
    if(year%4!=0){
        System.out.println("Not a leap year");
    }    
    else if(year%4==0 && year%100 !=0){
        System.out.println("Leap Year");
    }
    else if(year%4==0 && year%100==0 && year%400 !=0){
        System.out.println("Not a Leap year");
    }
    else{
        System.out.println("Leap year ");
    }
    

    }







    
}

