import java.util.Arrays;

public class _16_LeetCode34 {



    static int[] searchRange(int[] nums, int target) {

        int[]ans = {-1,-1};

        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start +(end-start)/2;

            if(nums[mid]==target){
                end = mid-1;
                ans[0]=mid;
            }else if(nums[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }


        start = 0;
        end = nums.length-1;

        while(start<=end){
            int mid = start+(end - start)/2;

            if(nums[mid]==target){

                ans[1]=mid;
                start = mid+1;
            }else if(nums[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        int[]nums ={5,7,7,8,8,10};
        int[]nums ={1};


        int[]ans = searchRange(nums,1);
        System.out.println(Arrays.toString(ans));;
    }
}