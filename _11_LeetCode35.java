public class _11_LeetCode35 {

     static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start<end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                start = mid+1;
            }else{
                end = mid;
            }
        }

        if(nums[start]<target){
            return start+1;
        }else{
            return start;
        }
    }
    public static void main(String[] args) {


    }
}
