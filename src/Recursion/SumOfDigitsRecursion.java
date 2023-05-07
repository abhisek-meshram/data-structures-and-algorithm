package Recursion;

public class SumOfDigitsRecursion {
    public static void main(String[] args) {
        SumOfDigitsRecursion s = new SumOfDigitsRecursion();
        System.out.println(s.sumOfDigit(50));
    }

    public int sumOfDigit(int n) {
        if(n == 0 || n < 0){
            return 0;
        }
        return n%10 + sumOfDigit(n/10);
    }
}
