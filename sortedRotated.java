public class sortedRotated {
    public static int Sorted(int arr[],int si,int tar, int ei){
        // base case
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        // Found
        if(arr[mid]==tar){
            return mid;
        }
        // on line L1
        if(arr[si]<=arr[mid]){
            // case a 
            if(arr[si]<=tar && tar<=arr[mid-1]){
                return Sorted(arr, si, tar, mid-1);
            }
            // case b
            else{
                return Sorted(arr, mid+1, tar, ei);
            }
        }
        // on line L2 
        else{
            // case a
            if(arr[mid]<=tar && tar<=arr[ei]){
                return Sorted(arr, mid+1, tar, ei);
            }
            // case b 
            else{
                return Sorted(arr, si, tar, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int tar=0;
        int tarIdx=Sorted(arr,0,tar,arr.length-1);
        System.out.println(tarIdx);
        
    }
    
}
