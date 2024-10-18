public class _14_LeetCode744 {

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;

        while(start<end) {
            int mid = start + (end - start) / 2;

            if(letters[mid] == target && mid!=letters.length-1) {
                start = mid+1;
            }else if(letters[mid]<target){
                start = mid+1;
            }else{
                end = mid;
            }
        }

        if(letters[start]>target){
            return letters[start];
        }

        return letters[0];
    }
    public static void main(String[] args) {



    }
}
