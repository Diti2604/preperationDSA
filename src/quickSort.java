public class quickSort {
//    static void quickSort(int[] arr, int low, int high) {
//        if (arr == null || arr.length == 0)
//            return;
//        if (low >= high)
//            return;
//        // pick the pivot
//        int middle = low + (high - low) / 2;
//        int pivot = arr[middle];
//        // make left < pivot and right > pivot
//        int i = low, j = high;
//        while (i <= j) {
//            while (arr[i] < pivot) {
//                i++;
//            }
//            while (arr[j] > pivot) {
//                j--;
//            }
//            if (i <= j) {
//                swap(arr, i, j);
//                i++;
//                j--;
//            }
//        }
//        // recursively sort two sub parts
//        if (low < j)
//            quickSort(arr, low, j);
//        if (high > i)
//            quickSort(arr, i, high);
//    }
//
//    static void swap(int[] arr, int pos1, int pos2) {
//        int temp = arr[pos1];
//        arr[pos1] = arr[pos2];
//        arr[pos2] = temp;
//    }

    static void quickSort(int arr[], int low, int high) {
        if (arr == null || arr.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];
        int i = low;
        int j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSort(arr, low, j);
        }
        if (high > i) {
            quickSort(arr, i, high);
        }
    }

    static void swap(int[] arr, int pos1, int pos2) {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
}
