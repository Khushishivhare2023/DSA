public class pattern2 {
    public static void hollowrec(int totrows, int totcols){
        for(int i=1;i<=totrows;i++){
            for(int j=1;j<=totcols;j++){
                if(i==1||i==totrows||j==1||j==totcols){
                    System.out.print('*');
                }
                else{
                    System.out.print(" ");
                }  
            }
            System.out.println();
        }
    }
    public static void halfpyramid(int n){
        for(int i=1;i<=n;i++){
            // for spaces 
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // for stars 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }    
    }
    public static void inverted_halfpyra(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void floyds_Triangle(int n){
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void zero_one_Triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void butterfly(int n){
        // first half
        for(int i=1;i<=n;i++){
            // stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // stars 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // second half 
        for(int i=n;i>=1;i--){
            // stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // stars 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void solid_rhombus(int n){
        for(int i=1;i<=n;i++){
            // spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // stars 
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollow_rhombus(int n){
        for(int i=1;i<=n;i++){
            // spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // hollow rectangle 
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void diamond(int n){
        // first half
        for(int i=1;i<=n;i++){
            // spaces 
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // stars 
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // second half
        for(int i=n;i>=1;i--){
             // spaces 
             for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // stars 
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Number_pyramid(int n){
        for(int i=1;i<=n;i++){
            // for spaces 
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // for number
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    

    
    public static void main(String[] args) {
        // halfpyramid(5);
        // inverted_halfpyra(6);
        // floyds_Triangle(5);
        // zero_one_Triangle(5);
        // hollowrec(4, 5);
        // butterfly(4);
        // solid_rhombus(5);
        // hollow_rhombus(5);
        // diamond(4);
        // Number_pyramid(5);

    }
    
}
