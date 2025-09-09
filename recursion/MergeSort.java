import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {  // mein method
        int[] arr = {5, 4, 7, 8, 3, 9, 10};
        mergesort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    public static void mergesort(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }
        int mid = (s + e) / 2;
        mergesort(arr, s, mid);
        mergesort(arr, mid, e);
        merge(arr, s, mid, e);
    }

    public static void merge(int[] arr, int s, int mid, int e) {
        int[] mix = new int[e - s];
        int i = s;
        int j = mid;
        int k = 0;

        while (i < mid && j < e) {
            if (arr[i] < arr[j]) {
                mix[k++] = arr[i++];
            } else {
                mix[k++] = arr[j++];
            }
        }
        while (i < mid) {
            mix[k++] = arr[i++];
        }
        while (j < e) {
            mix[k++] = arr[j++];
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];

        }
    }
}
