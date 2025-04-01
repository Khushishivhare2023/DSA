public class paractice2darr {
    public static int count7(int matrix[][]){
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==7){
                    count++;
                }
            }
        }
        return count;
    }
    public static int row2sum(int matrix[][]){
        int sum=0;
        for(int j=0;j<matrix[0].length;j++){
            sum+=matrix[1][j];
        }
        return sum;
    }
    public static void transpose(int matrix[][]){
        int row=matrix.length;
        int col=matrix[0].length;

        int transpose[][]=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
    }
    public static void print(int transpose[][]){
        int row=3;
        int col=3;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(transpose[j][i]+" ");
            }
            System.out.println();
        }
    
    }
    public static void main(String[] args) {
        int matrix[][]={{4,7,8},{8,0,7},{1,2,3}};
        // System.out.println(count7(matrix));
        // System.out.println(row2sum(matrix));
        transpose(matrix);
        print(matrix);
    }
    
}
