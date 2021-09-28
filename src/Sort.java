public class Sort {



    /*Сортировка методом вставки*/
    public static void insertionSort(int[] arr){
        int tmp;
        int position = 1;

        for (int i = 0; i < arr.length -1; i++) {
            for (int j = position; j > 0  ; j--) {
                tmp = arr[j];
                if(arr[j] < arr[j-1]){
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }else{
                    break;
                }
            }
            ++position;
        }
    }

}
