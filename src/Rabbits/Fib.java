package Rabbits;

public class Fib {
    public int fibIt(int n) {
        int a = 0;
        int b = 1;
        if (n == 0) {
            return a;
        } else if (n == 1) {
            return b;
        }
        for (int i = 2; i <= n; i++) {
            int c = b;
            b += a;
            a = c;
        }return b;

    }

    public int fibRec(int n){
        if(n == 0 || n ==1){
            return n;
        }
        //inny sposob zapisu:
        //        int p = fibRec(n-1);
        //        int pp = fibRec(n-2);
        //        return p + pp;

        int tmp = fibRec(n -1) + fibRec(n -2);
        return tmp;
    }
}
