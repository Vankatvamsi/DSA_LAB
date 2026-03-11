package com.week4;
public class MergeAndQuickCompare {

    static void merge(int arr[], int l, int m, int r) {

        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i = 0; i < n1; i++)
            L[i] = arr[l + i];

        for(int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;

        while(i < n1 && j < n2) {
            if(L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }

        while(i < n1) arr[k++] = L[i++];
        while(j < n2) arr[k++] = R[j++];
    }

    static void mergeSort(int arr[], int l, int r) {
        if(l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }

    static int partition(int arr[], int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for(int j = low; j < high; j++) {
            if(arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void quickSort(int arr[], int low, int high) {
        if(low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static void printArray(int arr[]) {
        for(int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int arr1[] = {8, 3, 5, 2, 9, 1};
        int arr2[] = arr1.clone();

        System.out.println("Original Array:");
        printArray(arr1);

        // Merge Sort timing
        long startMerge = System.nanoTime();
        mergeSort(arr1, 0, arr1.length - 1);
        long endMerge = System.nanoTime();

        System.out.println("\nAfter Merge Sort:");
        printArray(arr1);
        System.out.println("Merge Sort Time: " + (endMerge - startMerge) + " ns");

        // Quick Sort timing
        long startQuick = System.nanoTime();
        quickSort(arr2, 0, arr2.length - 1);
        long endQuick = System.nanoTime();

        System.out.println("\nAfter Quick Sort:");
        printArray(arr2);
        System.out.println("Quick Sort Time: " + (endQuick - startQuick) + " ns");
    }
}
