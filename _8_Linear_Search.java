public class _8_Linear_Search {

    //Liner search
    static boolean search(int[]arr,int k){


        for(int i:arr){
            if(i==k){
                return true;
            }
        }
        return false;
    }

    //String search

    static boolean searchStr(String str,char k){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==k){
                return true;
            }
        }
        return false;
    }

    //Liner search in 2D array
    static boolean searchTwoD(int[][]arr,int k){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==k){
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,11,12,13,14};
//        System.out.println(search(arr,23));

        String str = "Hello World!";
//        System.out.println(searchStr(str,'W'));


        int[][] arr2D={
                {55,84,12,96},
                {13,77,26,43,33},
                {69,81,16}
        };

        System.out.println(searchTwoD(arr2D,9));
    }
}
