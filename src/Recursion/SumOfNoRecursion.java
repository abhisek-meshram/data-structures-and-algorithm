package Recursion;

public class SumOfNoRecursion {
    public int sumOfN(int sum,int n) {
        if(n == 0) {
            return sum;
        }
        return sumOfN(sum + n, n-1);

    }
    public static void main(String[] args) {
        SumOfNoRecursion sm = new SumOfNoRecursion();
        int sum = 0;
        int n = 100;
        System.out.println("sum of "+n+" number is "+sm.sumOfN(sum,n));
    }
}
