// bubbole sort
// comapres the 2 elements and in first time largest element goes to last
// implementation of array
// pick largest and put to the last
// last element is the first number
// elemnts are 78312
// compares elements betn and puts to last
// note largest elemt comes to last by pairs wise
// 78312 comes 73128
// 31278
// 12378

import java.util.*;
public class bubbloesort{
public static void Printarray(int arr[]){
        for (int j =0;j<arr.length;j++){
                System.out.print(arr[j]+" ");
        }
}

        public static void main(String[] args) {
                int arr[]={7,1,6,9,8,2};

                for(int j =0;j<arr.length-1;j++){
                        for(int i=0;i<arr.length-i-1;i++){
                                if(arr[i]>arr[i+1]){
                                        int temp =arr[i];
                                        arr[i]=arr[i+1];
                                        arr[i+1] =temp;
                                }
                        }
                        

                }

        Printarray(arr);  
          
        }
}



// public class bubbloesort {
//     public static void main(String[] args) {
//         int arr[]={5,9,4,3,6};

//         // bubble sort
//         for (int  i =0;i<arr.length-1;i++){
//            for (int j=0;j<=arr.length-i-1;j++) {
//              if(arr[j] > arr[j+1]){
//                 // swap
//                 int temp = arr[j];
//                 arr[j] = arr[j+1];
//                 arr[j+1] = temp;
//              }
//            }

//         }
//     }
// }


