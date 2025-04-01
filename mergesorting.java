public class mergesorting {
    public static void printArry(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergesort(int arr[],int si, int ei){
        // base case
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergesort(arr, si, mid); // left part
        mergesort(arr, mid+1, ei); // right part
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si, int mid, int ei ){
        int temp[]=new int [ei-si+1];
        int i=si; // idx for 1st sorted part 
        int j=mid+1; //idx for 2nd sorted part
        int k=0; //idx for temp arr

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        // for leftover elements of the 1st part 
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        // for leftover elements of the 2nd part 
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        // copy the temp arr to original arr
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }

    }

    public static void main(String[] args) {
        int arr[]={8,1,4,2,9,7,0};
        mergesort(arr,0,arr.length-1);
        printArry(arr);
        
    }
    
}
