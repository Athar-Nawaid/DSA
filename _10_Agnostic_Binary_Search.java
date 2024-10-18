public class _10_Agnostic_Binary_Search {
    static boolean BS(int[]arr,int k){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start]<arr[end];

        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]==k){
                return true;
            }

            if(isAsc){
                if(arr[mid]<k){
                    start=mid+1;
                }else if(arr[mid]>k){
                    end = mid;
                }
            }else{

                if(arr[mid]>k){
                    start=mid+1;
                }else if(arr[mid]<k){
                    end = mid;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[]arr = {11,52,36,82,12,35,69,1,4,96,25,32,76};
        System.out.println(BS(arr,35));
    }
}
