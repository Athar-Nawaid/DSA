public class _12_Ceiling_Of_Number {

    //Ceiling refers to the smallest number in the array that is grater than the target number
    static int ceiling(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                return mid+1;
            }else if(nums[mid]<target){
                start = mid+1;
            }else{
                end = mid;
            }
        }

            return start;

    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(ceiling(arr,5));
    }
}
