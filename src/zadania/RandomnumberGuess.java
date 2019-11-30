package zadania;

import java.util.Random;
import java.util.Scanner;

public class RandomnumberGuess {
    public static double getRandomDoubleBetweenRange(double min, double max){
        double x = (Math.random()*((max-min)+1))+min;
        return x;
    }


    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int number = random.nextInt(100);
    public int guessing(){
        int gues =0;
        for(int i = 0; i < 9; i++){
            System.out.println("Czy Twój numer to " + number + "?");
            String advice = scanner.nextLine();
            if(advice.equals("wiecej")){
                number = random.nextInt(100) + number;
                System.out.println(number);
                gues = number;
            }
        }return gues;
    }
}
