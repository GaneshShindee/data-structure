// bubbole sort
// comapres the 2 elements and in first time lrgest element goes to last
// 




public class bubbloesort {
    public static void main(String[] args) {
        int arr[]={5,9,4,3,6};

        // bubble sort
        for (int  i =0;i<arr.length-1;i++){
           for (int j=0;j<=arr.length-i-1;j++) {
             if(arr[j] > arr[j+1]){
                // swap
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
             }
           }

        }
    }
}


