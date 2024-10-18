import java.util.Scanner;
public class _5_Array {

    static void changeElement(int index,int num,int[]arr){
        arr[index] = num;
    }
    static int[][] create2D( int row,int col){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[row][col];

        for(int i=0;i<arr.length;i++){
            for( int j=0;j<arr[i].length;j++){
                System.out.printf("enter number for %d row and %d col",i,j);
                int num = sc.nextInt();
                arr[i][j] = num;
            }
        }
        return arr;
    }
    static void printArr(int[][]arr2D){
        for(int i=0;i<arr2D.length;i++){
            System.out.println();
            for(int j=0;j<arr2D[i].length;j++){
                System.out.print(arr2D[i][j]);
            }
        }
    }

    public static void main(String[] args) {

//        int[] arr = new int[5];
//
//        arr[0]=1;
//        arr[1]=2;
//        arr[2]=3;
//        arr[3]=4;
//        arr[4]=5;
//
//        changeElement(3,15,arr);
//        System.out.println(Arrays.toString(arr));

//        int[][]arr2D = new int[3][];

        int[][] arr2D = create2D(3,3);

        printArr(arr2D);



    }
}
