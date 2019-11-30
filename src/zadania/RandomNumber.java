package zadania;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public String rundomNumber(){

        int number = random.nextInt(100);

        for(int i = 7; i > 0; i--){
            System.out.println("podaj numer masz " + i + " prób");
            int a = scanner.nextInt();
            if(a < number){
                System.out.println("Szukana liczba jest większa");
            }else if (a > number) {
                System.out.println("Szukana liczba jest mniejsza");

            }else if (number == a){
                return "JUHUUUU";



            }
        }return "LOOSER Muahahahahah " + number;
    }

}
