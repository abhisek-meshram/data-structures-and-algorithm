package Recursion;

public class DecimalToBinary {
    public static void main(String[] args) {
        DecimalToBinary dtb = new DecimalToBinary();
        System.out.println(dtb.decimalToBinary(10));
    }
    public int decimalToBinary(int n){
        if(n == 0) {
            return 0;
        }
        return n % 2 + 10 * (decimalToBinary(n/2));
    }
}
