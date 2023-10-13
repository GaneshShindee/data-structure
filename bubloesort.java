public class bubloesort {

// /*in the bubble sort pahile last element shevthi jato bheto he sort mot bagta ani pus send karta */
//         // bubble sort

public static void printArray(int arr[]){
    for(int i =0;i<arr.length;i++)
    System.out.print(arr[i]+" ");
}
public static void main(String[] args) {
    int arr[] ={5,9,3,7,1,8};

    for (int i = 0;i<arr.length-1;i++){
        for (int j =0;j<arr.length-2;j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;

            }
        }
    }
    printArray(arr);
}
}
