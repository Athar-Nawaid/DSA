public class _9_Binary_Search {

    static boolean BS(int[]arr,int k){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]==k){
                return true;
            }else if(arr[mid]<k){
                end=mid;
            }else{
                start = mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[]arr = {11,52,36,82,12,35,69,1,4,96,25,32,76};
        System.out.println(BS(arr,69));
    }
}
