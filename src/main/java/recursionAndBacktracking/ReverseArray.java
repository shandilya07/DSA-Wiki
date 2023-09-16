package recursionAndBacktracking;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverseOne(arr, 0, arr.length-1);
        printArr(arr);

        int[] arrOther = {6,7,8,9,10};
        reverseTwo(arrOther, 0);
        printArr(arrOther);
    }

    private static void reverseOne(int[] arr, int low, int high) {
        if(low <= high) {
            swap(arr, low, high);
            reverseOne(arr, ++low, --high);
        }
    }

    private static void reverseTwo(int[] arr, int index) {
        if(index <= arr.length/2) {
            swap(arr, index, arr.length-index-1);
            reverseTwo(arr, ++index);
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }
}