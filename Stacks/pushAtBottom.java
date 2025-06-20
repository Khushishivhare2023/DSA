import java.util.*;
public class pushAtBottom {
    public static void pushtobottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushtobottom(s, data);
        s.push(top);

    }
    public static String reverse(String str){
        Stack<Character> s= new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder res =new StringBuilder("");
        while(!s.isEmpty()){
            char cur =s.pop();
            res.append(cur);
        }
        return res.toString();
    }
    public static void main(String[] args) {
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // pushtobottom(s,4);
        // while(!s.isEmpty()){
        //     System.out.println(s.pop());
        String str="abc";
        String res=reverse(str);
        System.out.println(res);

    }
    
}
