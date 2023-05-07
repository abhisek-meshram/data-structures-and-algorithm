package Recursion;

public class GCDofTwoNumberRecursion {
    public static void main(String[] args) {
        GCDofTwoNumberRecursion gcd = new GCDofTwoNumberRecursion();
        System.out.println(gcd.findGcd(8,4));
    }
    public int findGcd(int a, int b) {
        if(a<0 || b< 0){
            return -1;
        }
        if(b == 0) {
            return a;
        }
        return findGcd(b,a%b);
    }
}
