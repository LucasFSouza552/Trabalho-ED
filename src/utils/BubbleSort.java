package utils;

public class BubbleSort {

    public static int[] sort(int[] arr) {
        int[] bubbleSort = arr.clone();
        int n = bubbleSort.length;
        boolean parar;

        for (int i = 0; i < n - 1; i++) {
            parar = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (bubbleSort[j] > bubbleSort[j + 1]) {
                    int temp = bubbleSort[j];
                    bubbleSort[j] = bubbleSort[j + 1];
                    bubbleSort[j + 1] = temp;
                    parar = true;
                }
            }

            if (!parar) {
                break;
            }
        }
        return bubbleSort;
    }

    public static long sortTime(int[] arr) {
        int[] bubbleSort = arr.clone();
        int n = bubbleSort.length;
        boolean parar;

        long StartTime = getTime();
        for (int i = 0; i < n - 1; i++) {
            parar = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (bubbleSort[j] > bubbleSort[j + 1]) {
                    int temp = bubbleSort[j];
                    bubbleSort[j] = bubbleSort[j + 1];
                    bubbleSort[j + 1] = temp;
                    parar = true;
                }
            }

            if (!parar) {
                break;
            }
        }
        return getTime() - StartTime;
    }

    private static long getTime() {
        return System.nanoTime();
    }

}
