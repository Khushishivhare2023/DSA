import java.util.*;
public class shortestdistance {
    public static float getshortestpath(String str){
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            char dir=str.charAt(i);
            // North
            if(dir=='N'){
                y++;
            }
            // South
            else if(dir=='S'){
                y--;
            }
            // West
            else if(dir=='W'){
                x--;
            }
            // East
            else{
                x++;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        String str="WNEENESENNN";
        System.out.println(getshortestpath(str));
    }
    
}
