import java.util.*;
public class stringAnagrams {
    public static void Anagrams(String str1,String str2){
        // Convert to lowercase;
        str1.toLowerCase();
        str2.toLowerCase();

        // Check the length of the Strings
        if(str1.length()==str2.length()){
            // convert the strings to character array
            char[] ch1= str1.toCharArray();
            char[] ch2= str2.toCharArray();
            // sort the char array
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            boolean result = Arrays.equals(ch1,ch2);
            if(result){
                System.out.println("The Strings are Anagrams");
            }
            else{
                System.out.println("The Strings are not Anagrams");
            }
        }
        else{
            System.out.println("The Strings are not Anagrams");
        }

        

    }
    public static void main(String[] args) {
        String str1="care";
        String str2="race";
        Anagrams(str1, str2);
    
        
    }
    
}