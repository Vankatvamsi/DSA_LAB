package com.week3;
import java.util.Arrays;
class MergeSort 
{
    void merge(int[] array, int low, int mid, int high) 
    {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] L = new int[n1];
        int[] M = new int[n2];
        for (int i = 0; i < n1; ++i) 
        {
            L[i] = array[low + i];
        }
        for (int j = 0; j < n2; ++j)
        {
        	M[j] = array[mid + 1 + j];
        }
        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2)
        {
            if (L[i] <= M[j])
            {
                array[k++] = L[i++];
            } 
            else 
            {
                array[k++] = M[j++];
            }
        }
        while (i < n1) 
        {
            array[k++] = L[i++];
        }
        while (j < n2) 
        {
            array[k++] = M[j++];
        }
    }
    void mergeSort(int[] array, int left, int right) 
    {
        if (left < right) 
        {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right); 
            merge(array, left, mid, right);
        }
    }

    public static void main(String[] args)
    {
        int[] data = {6, 5, 12, 10, 9, 1};
        MergeSort sorter = new MergeSort();
        sorter.mergeSort(data, 0, data.length - 1);
        System.out.println(Arrays.toString(data)); 
    }
}
