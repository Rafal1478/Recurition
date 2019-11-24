package limplists;

import java.util.List;
import java.util.Random;

public class ListMAin {
    public static void main(String[] args) {
        IList<Integer> list = new ArrayList1<>();
        Random rand = new Random();
        int numberCount = 10;
        for(int i = 0; i < numberCount; i++)
            list.add(rand.nextInt(101));
        ListUtilities.display(list);
        list.add(11,2);
        ListUtilities.display(list);
        list.remove(9);
        ListUtilities.display(list);
    }
}
