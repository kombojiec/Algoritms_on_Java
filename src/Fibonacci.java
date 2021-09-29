import java.util.Scanner;

public class Fibonacci {

    static int fibboLinear(int n) {
        int res = 0, tmp, x = 1, y = 1;
        for (int i = 2; i <= n; i++) {
            res = x + y;
            tmp = res;
            x = y;
            y = tmp;
        }
        return res;
    }

    static int fibboRecursive(int n){
        if(n <= 1) return 1;
        else return fibboRecursive(n - 1) + fibboRecursive(n - 2);
    }

}
