package learn.dsa.Recursion;

public class MyPow {
    public static void main(String[] args) {
        double x = 2.10000;
        int n = 3;
        double result = new MyPow().doPow(x, n);
        if(n < 0) result = 1 / result;
        System.out.println(result);
        System.out.println(x % 2);
    }

    public double doPow(double x, int n){
        if(x == 0) return 0;
        if(n == 0) return 1;
        double result = doPow(x, n/2);
        result = result * result;
        return n%2 ==0? result: x*result;
    }
}
