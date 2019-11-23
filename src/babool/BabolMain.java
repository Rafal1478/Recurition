package babool;

public class BabolMain {
    public static void main(String[] args) {
        int[] t = TableUtilities.createAndFillTable(10,5,20);
        BubbleSort bs = new BubbleSort();
        System.out.println("tablica przed sortowaniem");
        TableUtilities.pint(t);
        bs.sort(t);
        System.out.println("tablica po sortowaniu");
        TableUtilities.pint(t);
    }
}
