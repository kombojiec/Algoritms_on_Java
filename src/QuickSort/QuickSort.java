package QuickSort;

public class QuickSort {
    private int[] arr;

    public QuickSort(int[] arr){
        this.arr = arr;
    }

    public void quickSort(){
        recursionQuickSort(0, arr.length -1);
    }

    public void recursionQuickSort(int min, int max){
        if(max - min <= 0)
            return;
        else {
            int med = arr[max];
            int partition = partition(min, max, med);
            recursionQuickSort(min, partition - 1);
            recursionQuickSort(partition + 1, max);
        }
    }

    int partition(int min, int max, int med){
        int tmp;

        int left = min -1, right = max +1;
        while(true){
            while(left < right && arr[++left] < med);
            while(right > left && arr[--right] > med);
            if(left >= right) break;
            else {
                tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }
        return left;
    }

    public void show(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
