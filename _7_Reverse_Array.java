import java.util.Arrays;

public class _7_Reverse_Array {
    static void reverse(int[]arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};

        reverse(arr);

        System.out.println(Arrays.toString(arr));
    }
}
