import java.util.*;
public class duplicate_Parenthesis {
    public static boolean isDuplicate(String str){
        Stack<Character> s= new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            //CLOSING
            if(ch==')'){
                int cnt=0;
                while(s.peek()!='('){
                    s.pop();
                    cnt++;
                }
                if(cnt<1){
                    return true;
                }
                else{
                    s.pop();
                }
            }
            //OPENING
            else{
                s.push(ch);
            }
        }
        return false;

    }
    public static void main(String[] args) {
        String str="((a+b))";
        System.out.println(isDuplicate(str));
    }
    
}
