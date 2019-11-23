package watch;

import babool.TableUtilities;

public class WatchMain {
    public static void main(String[] args) {
        int repetitions = 1000;
        int[] tab = TableUtilities.createAndFillTable(100000,0,100);
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for(int i = 0; i < repetitions; i++){
            addValue(tab);
        }
        System.out.println(stopWatch.stop()/repetitions);

    }
    private static void addValue(int[] t){
        for(int i = 0; i < t.length; i++){
            t[i] *= 2;
        }
    }
}
