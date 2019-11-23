package watch;

public class StopWatch {

    private long startTime;

    public void start( ){
        startTime = System.nanoTime();
    }
    public long stop(){
        return System.nanoTime() - startTime;
    }
}
