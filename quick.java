public class quick {
    static int partition(int[] arr, int low, int high) {
        int i = low - 1,pivot=arr[high];
        for(int j=low;j<high;j++){
            if(arr[j]<=pivot)
            {
            i++;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    static void quicksort(int[] arr,int low,int high){
        if(low<high){
            int pi=partition(arr,low,high);
            quicksort(arr,low,pi-1);
            quicksort(arr,pi+1,high);
        }
    }
    public static void main(String[] args){
        int[] arr={5,2,4,7,9,2};
        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        quicksort(arr,0, arr.length-1);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }


    }
}
