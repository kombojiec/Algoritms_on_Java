import java.util.Scanner;

public class NOD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(nod(sc.nextInt(), sc.nextInt()));
    }
    static int nod(int a, int b){
        if(a == 0) return b;
        if(b == 0) return a;
        int tmp;
        if(b > a){
            tmp = a;
            a = b;
            b = tmp;
        }
        while(b != 0){
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
