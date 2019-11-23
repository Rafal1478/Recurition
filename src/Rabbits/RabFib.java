package Rabbits;

public class RabFib {
    public static void main(String[] args) {
        Fib fb = new Fib();
        int n = 7;
        System.out.println("iter: " + fb.fibIt(n));
        System.out.println("recur: " + fb.fibRec(n));
    }
}
