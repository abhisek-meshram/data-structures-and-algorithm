package Recursion;

public class PowerOfNumberRecursion {
    public static void main(String[] args) {
        PowerOfNumberRecursion pow = new PowerOfNumberRecursion();
        System.out.println(pow.power(-2,5));
    }

    public int power(int base , int exp) {
        if(exp<0) {
            return -1;
        }
        if(exp == 0 || exp == 1) {
            return base;
        }
        return  base * power(base,exp - 1);
    }
}
