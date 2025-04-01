public class binarysearch {
    public static int binsearch(int num[],int key){
        int start=0, end=num.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            // comparisons
            if(num[mid]==key){
                return mid; //Found
            }
            if(num[mid]<key){
                start=mid+1; //Right
            }
            else{
                end=mid-1; // Left
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={2,4,6,10,14,18,20};
        int key=20;
        System.out.println("The index of the key:"+binsearch(num, key));
        
    }
    
}
