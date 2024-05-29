
public class mergeSort {
//
//    public static void sort(int[] arr){
//        mergeSort(arr, 0, arr.length - 1);
//    }
//    public static void mergeSort(int arr[], int p, int r){
//        if(r > 1){
//            int q = p + r / 2;
//            mergeSort(arr, p, q);
//            mergeSort(arr, q + 1, r);
//            merge(arr, p, q, r);
//        }
//    }
//
//    public static void merge(int arr[], int p, int q, int r){
//        int n1 = q - p + 1;
//        int n2 = r - q;
//
//        long[] left = new long[n1 + 1];
//        long[] right = new long[n2+ 1];
//
//        for(int i = 0; i < n1; i++){
//            left[i] = arr[p+i];
//        }
//        for(int j = 0; j < n2; j++){
//            right[j] = arr[q + 1 + j];
//        }
//
//        left[n1] = Integer.MAX_VALUE + 1L;
//        right[n2] = Integer.MAX_VALUE + 1L;
//
//        int i =0;
//        int j =0;
//
//        for(int k = p; k < r; k++){
//            if(left[i] <= right[j]){
//                arr[k] = (int)left[i];
//                i = i+1;
//            }
//            else{
//                arr[k] = (int) right[j];
//                j = j +1;
//            }
//        }
//
//
//    }


//    public static void sort(int arr[]) {
//        mergeSort(arr, 0, arr.length - 1);
//    }
//
//    public static void mergeSort(int arr[], int p, int r) {
//        if (p < r) {
//            int q = (p + r) / 2;
//            mergeSort(arr, p, q);
//            mergeSort(arr, q + 1, r);
//            merge(arr, p, q, r);
//        }
//    }
//
//    public static void merge(int arr[], int p, int q, int r) {
//        int n1 = q - p + 1;
//        int n2 = r - q;
//
//        long[] left = new long[n1 + 1];
//        long[] right = new long[n2 + 1];
//
//        for (int i = 0; i < n1; i++) {
//            left[i] = arr[i + p];
//        }
//
//        for (int j = 0; j < n2; j++) {
//            right[j] = arr[q + 1 + j];
//        }
//
//        left[n1] = Integer.MAX_VALUE + 1L;
//        right[n2] = Integer.MAX_VALUE + 1L;
//        int i = 0;
//        int j = 0;
//        for (int k = p; k <= r; k++) {
//            if (left[i] < right[j]) {
//                arr[k] = (int) left[i];
//                i = i + 1;
//            } else {
//                arr[k] = (int) right[j];
//                j = j + 1;
//            }
//        }
//
//    }


//    public static void Sort(int arr[]) {
//        mergeSort(arr, 0, arr.length - 1);
//    }
//
//    public static void mergeSort(int arr[], int p, int r) {
//        if (p < r) {
//            int q = p + r / 2;
//            mergeSort(arr, p, q);
//            mergeSort(arr, q + 1, r);
//            merge(arr, p, q, r);
//        }
//    }
//
//    public static void merge(int arr[], int p, int q, int r) {
//        int n1 = q - p + 1;
//        int n2 = r - q;
//
//        long[] left = new long[n1 + 1];
//        long[] right = new long[n2 + 1];
//
//        for (int i = 0; i < n1; i++) {
//            left[i] = arr[i + p];
//        }
//
//        for (int j = 0; j < n2; j++) {
//            right[j] = arr[q + 1 + j];
//        }
//
//        left[n1] = Integer.MAX_VALUE + 1L;
//        right[n2] = Integer.MAX_VALUE + 1L;
//
//        int i = 0;
//        int j = 0;
//
//        for (int k = p; k <= r; k++) {
//            if (left[i] <= right[j]) {
//                arr[k] = (int) left[i];
//                i = i + 1;
//            } else {
//                arr[k] = (int) right[j];
//                j = j + 1;
//            }
//        }
//
//    }

//
//    public static void sort(int arr[]) {
//        mergeSort(arr, 0, arr.length - 1);
//    }
//
//    public static void mergeSort(int arr[], int p, int r) {
//        if (p < r) {
//            int q = p + r / 2;
//            mergeSort(arr, p, q);
//            mergeSort(arr, q + 1, r);
//            merge(arr, p, q, r);
//        }
//    }
//
//    public static void merge(int arr[], int p, int q, int r) {
//        int n1 = q - p + 1;
//        int n2 = r - q;
//
//        long[] left = new long[n1 + 1];
//        long[] right = new long[n2 + 1];
//
//        for (int i = 0; i < n1; i++) {
//            left[i] = arr[i + p];
//        }
//        for (int j = 0; j < n2; j++) {
//            right[j] = arr[q + 1 + j];
//        }
//
//        left[n1] = Integer.MAX_VALUE + 1L;
//        right[n2] = Integer.MAX_VALUE + 1L;
//
//        int i = 0;
//        int j = 0;
//        for (int k = p; k <= r; k++) {
//            if (left[i] < right[j]) {
//                arr[k] = (int) left[i];
//                i = i+ 1;
//            } else {
//                arr[k] = (int) right[j];
//                j = j +1;
//            }
//        }
//    }


    public static void sort(int arr[]) {
        mergeSort(arr, 0, arr.length - 1);
    }

    public static void mergeSort(int arr[], int p, int r) {
        if (p < r) {
            int q = p + r / 2;
            mergeSort(arr, p, q);
            mergeSort(arr, q + 1, r);
            merge(arr, p, q, r);
        }
    }

    public static void merge(int arr[], int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        long[] left = new long[n1 + 1];
        long[] right = new long[n2 + 1];


        for (int i = 0; i < n1; i++) {
            left[i] = arr[i + p];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[q + 1 + j];
        }

        left[n1] = Integer.MAX_VALUE + 1L;
        right[n2] = Integer.MAX_VALUE + 1L;


        int i = 0;
        int j = 0;
        for (int k = p; k < r; k++) {
            if (left[i] <= right[j]) {
                arr[k] = (int) left[i];
                i = i + 1;
            } else {
                arr[k] = (int) right[j];
                j = j + 1;
            }
        }

    }


}