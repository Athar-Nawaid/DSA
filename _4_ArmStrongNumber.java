public class _4_ArmStrongNumber {

    static void armStrong(){
        for(int i=100;i<=999;i++){
            int num = i;
            int sum = 0;
            while(num>0){
                int digit = num%10;
                sum+=digit*digit*digit;
                num=num/10;
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        armStrong();
    }
}
