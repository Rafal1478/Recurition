package zadania;

import java.util.Scanner;

public class LiczbyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        LiczbyPierwsze lp = new LiczbyPierwsze();
        System.out.println(lp.checkNumber(c));
        lp.distplayFirstNumberInRange(c);
    }
}
