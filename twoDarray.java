import java.util.*;
public class TwoDarray {
    public static boolean searching(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;

    }
    public static int largest(int matrix[][]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(largest < matrix[i][j]){
                    largest=Math.max(largest,matrix[i][j]);
                }
            }
        }
        return largest;
    }
    public static int smallest(int matrix[][]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(smallest> matrix[i][j]){
                    smallest=Math.min(smallest,matrix[i][j]);
                }
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int n=matrix.length;
        int m=matrix[0].length;
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }    
        // output 
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        // searching(matrix, 8);
        System.out.println("The largest element is:"+largest(matrix));
        System.out.println("The smallest element is:"+smallest(matrix));

    }
    
}
