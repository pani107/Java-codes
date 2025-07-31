public class BinarySearch {


    static class MinMax {
        int min;
        int max;

        MinMax(int min, int max) {
            this.min = min;
            this.max = max;
        }
    }

    public static MinMax findMinMax(int[] arr, int low, int high) {

        if (low == high) {
            return new MinMax(arr[low], arr[high]);
        }

        if (high == low + 1) {
            if (arr[low] < arr[high]) {
                return new MinMax(arr[low], arr[high]);
            } else {
                return new MinMax(arr[high], arr[low]);
            }
        }


        int mid = (low + high) / 2;

        MinMax left = findMinMax(arr, low, mid);
        MinMax right = findMinMax(arr, mid + 1, high);

        int min = Math.min(left.min, right.min);
        int max = Math.max(left.max, right.max);

        return new MinMax(min, max);
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 1, 9, 0, 3, 15, 4};

        MinMax result = findMinMax(arr, 0, arr.length - 1);

        System.out.println("Minimum: " + result.min);
        System.out.println("Maximum: " + result.max);
    }
}
