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


    /* Сортировка методом Шелла */
//    public  static void shellSort(int[] arr){
//        int tmp;
//        int step = 1;
//        int length = arr.length;
//
//        while(step <= length){
//            step = step * 3 + 1;
//        }
//        while(step > 0){
//            for (int i = step; i < length; i++) {
//                tmp = arr[i];
//                int j = i;
//                while(j > step-1 && arr[j-step] >= tmp){
//                    arr[j] = arr[j-step];
//                    j -= step;
//                }
//                arr[j] = tmp;
//            }
//            step = (step-1) / 3;
//        }
//    }


    public  static void shellSort(int[] arr){
        int length = arr.length;
        int step = 1;
        int tmp;

        while(step < length)
            step = step * 3 + 1;

        while( step > 0){
            for (int i = step; i < length; i++) {
                tmp = arr[i];
                int j = i;
                while (j >= step && arr[j-step] > tmp){
                    arr[j] = arr[j-step];
                    j -= step;
                }
                arr[j] = tmp;
            }
            step = (step - 1) / 3;
        }
    }


}
