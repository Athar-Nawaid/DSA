public class _15_Search_Rotated_SortedArray {
    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start<end){
            int mid = start+ (end-start)/2;

            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                if(target<nums[end]){
                    start = mid+1;
                }else{
                    end = mid;
                }
            }else{
                start = mid+1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(search(nums,0));
    }
}
