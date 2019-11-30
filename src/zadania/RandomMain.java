package zadania;

import java.util.Scanner;

public class RandomMain {
    public static void main(String[] args) {
        RandomNumber rn = new RandomNumber();
        RandomnumberGuess rng = new RandomnumberGuess();

        Scanner scanner = new Scanner(System.in);
        System.out.println(rng.guessing());


    }
}
