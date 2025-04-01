public class findsubsets {
    public static void FindSubsets(String str,String ans, int i){
        // base 
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;

        }
        // yes condition
        FindSubsets(str, ans+str.charAt(i), i+1);
        // no condition
        FindSubsets(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str="abc";
        FindSubsets(str, " ", 0);
    }
    
}
