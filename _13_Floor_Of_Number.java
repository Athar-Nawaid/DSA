public class _13_Floor_Of_Number {
    static int floor(int[]nums,int target){
        if(target<=nums[0]){
            return -1;
        }
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(nums[mid]==target){
                return nums[mid-1];
            }else if(nums[mid]<target){
                start = mid+1;
            }else{
                end = mid;
            }
        }

        return nums[end];
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(floor(arr,6));
    }
}
