import java.util.*;
public class patterns1 {
    public static void main(String[] args) {
        // Star Pattern 
        /*
        for(int line=1; line<=5; line++){
            for(int star=1; star<=line ; star++){
                System.out.print("*");

            }
            System.out.println();
        }
        */
        
    
        // Inverted Star Pattern 
        /* 
        int n=5;
        for(int line=1;line<=n;line++){
            for(int star=1;star<=n-line+1;star++){
                System.out.print("*");
            }
            System.out.println();
        }
        */
        // Half pyramid pattern
        /*
        int n = 5;
        for(int line=1;line<=n;line++){
            for(int num=1;num<=line;num++){
                System.out.print(num);
            }
            System.out.println();
        }
        */       
        //Character pattern
        int n =5;
        char ch='A';
        for(int line=1;line<=n;line++){
            for(int chars=1;chars<=line;chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }



    }



    
}
