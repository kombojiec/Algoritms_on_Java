package Interfaces;

public class Sort {


    /*Пузырьковая сортировка / Bubble sort*/
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int tmp;
            for (int j = arr.length - 1; j > i; j--) {
                if(arr[j] < arr[j - 1]){
                    tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j -1] = tmp;
                }
            }
        }
    }


    /*Сортировка методом вставки / Selection sort*/
    public static void selectionSort(int[] arr){
        int min, tmp;
        for (int i = 0; i < arr.length-1; i++) {
            min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }

    }


    /*Сортировка методом вставки / Insertion sort*/
    public static void insertionSort(int[] arr){
//        int tmp;
//        int position = 1;
//
//        for (int i = 0; i < arr.length -1; i++) {
//            for (int j = position; j > 0  ; j--) {
//                tmp = arr[j];
//                if(arr[j] < arr[j-1]){
//                    arr[j] = arr[j-1];
//                    arr[j-1] = tmp;
//                }else{
//                    break;
//                }
//            }
//            ++position;
//        }

        int tmp, position;
        for (int i = 1; i < arr.length; i++) {
            tmp = arr[i];
            position = i;
            while(position > 0 && tmp < arr[position-1]) {
                arr[position] = arr[position-1];
                --position;
            }
            arr[position] = tmp;
        }
    }

}
