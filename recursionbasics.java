import java.util.*;
public class recursionbasics {
    public static void printdescending(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.print(n+" ");
        printdescending(n-1);
    }
    public static void printIn(int n){
        if(n==1){
            System.out.print(1 + " ");
            return;
        }
        printIn(n-1);
        System.out.print(n+" ");
    }
    public static int  fact(int n ){
        if(n==0){
            return 1;
        }
        int fnm1=fact(n-1);
        int fn=n*fnm1;
        return fn;   
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int Smn1=sum(n-1);
        int Sm= n+Smn1;
        return Sm;
    }
    public static int fib(int n){
        if(n==0||n==1){
            return n;
        }
        int fnm1=fib(n-1);
        int fnm2=fib(n-2);
        int fn=fnm1+fnm2;
        return fn;
    }
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static int firstOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr,key,i+1);
    }
    public static int lastOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=lastOccurence(arr, key, i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        return x*pow(x, n-1);
    }
    public static int OptimizedPow(int x,int n){
        if(n==0){
            return 1;
        }
        int halfpow=OptimizedPow(x,n/2);
        int halfpowsq=halfpow*halfpow;

        // check for odd n
        if(n%2!=0){
            halfpowsq= x* halfpowsq;
        }
        return halfpowsq;
    }
    public static int TilingProblem(int n ){
        if(n==0||n==1){
            return 1;
        }
        // vertical
        int fnm1=TilingProblem(n-1);
        // horizontal
        int fnm2=TilingProblem(n-2);

        int fn=fnm1+fnm2;
        return fn;
    }
    public static void removeDuplicates(String str,int idx,StringBuilder newstr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
            removeDuplicates(str, idx+1, newstr, map);
        }
        else{
            map[currchar-'a']=true;
            removeDuplicates(str, idx+1, newstr.append(currchar), map);
        }
    }
    public static int friendsPairing(int n){
        if(n==1||n==2){
            return n;
        }
        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }
    public static void BinaryStrings(int n, int lastplace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        BinaryStrings(n-1,0, str+"0");
        if(lastplace==0){
            BinaryStrings(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args){
        // int n=6;
        // printdescending(n);
        // printIn(n);
        // System.out.println(fact(n)); 
        // System.out.println(sum(n));
        // System.out.println(fib(n));
        // int arr[]={8,3,9,2,5,6,0,5,3};
        // System.out.println(isSorted(arr,0));
        // System.out.println(firstOccurence(arr, 5, 0));
        // System.out.println(lastOccurence(arr, 5, 0));
        // System.out.println(pow(2, 10 ));
        // System.out.println(OptimizedPow(2,10));
        // System.out.println(TilingProblem(4));
        // String str= "appancollege";
        // removeDuplicates(str,0, new StringBuilder(" "),new boolean[26]);
        // System.out.println(friendsPairing(3));
        BinaryStrings(3, 0,"");
    }  
}
