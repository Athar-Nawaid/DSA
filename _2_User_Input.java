import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class _2_User_Input {
    static void inputFunc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        String input = sc.nextLine();
        System.out.println(input);

    }

    static void swap(int a,int b){
        int temp;
        temp =a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {

//    inputFunc();

    int a = 10;
    int b = 5;

    swap(a,b);
        System.out.println(a);
        System.out.println(b);

    }
}
