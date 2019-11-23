package zadania;

public class LiczbyPierwsze {

    public boolean checkNumber(int b) {
        for (int i = 2; i < b; i++) {
            if (b % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void distplayFirstNumberInRange(int upperRange) {
        for (int i = 2; i <= upperRange; i++) {
            if (checkNumber(i)) {
                System.out.print(i + " ");
            }
        }


    }
}