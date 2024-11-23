package utils;

public class QuickSort {

    public static int[] sort(int[] arr) {
        int[] quickSort = arr.clone();
        sort(quickSort, 0, quickSort.length - 1);
        return quickSort;
    }

    public static long sortTime(int[] arr) {
        int[] quick = arr.clone();
        long StartTime = Timer.getTime();
        sort(quick, 0, quick.length - 1);
        return Timer.getTime() - StartTime;
    }

    private static void sort(int[] arr, int inicio, int fim) {
        int pivo = arr[inicio];

        int l = inicio;
        int r = fim;
        while (l <= r) {
            while (arr[l] < pivo) {
                l++;
            }

            while (arr[r] > pivo) {
                r--;
            }

            if (l <= r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }

        if (inicio < r) {
            sort(arr, inicio, r);
        }

        if (l < fim) {
            sort(arr, l, fim);
        }
    }

    public static void main(String[] args) {
        // Testar QuickSort
        
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}