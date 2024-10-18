public class _3_IsPrime {
    static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        int i=2;
        int sqrt = (int)(Math.sqrt(num));
        while(i<=sqrt){
            if(num%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
    public static void main(String[] args) {

        System.out.println(isPrime(9));
    }
}
