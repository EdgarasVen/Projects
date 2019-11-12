package org.mokykla.praktika.opp2;

public class Stopwatch {
    private long startTime ;
    private long endTime ;
    private boolean running = false;

    public Stopwatch (){
        startTime =0;
        endTime = 0;
    }

    public void start(){
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }

    public void stop(){
        this.endTime = System.currentTimeMillis();
        this.running = false;
    }

    public long getElapsedTime(){
        long elapsed;
        if (running) {
            elapsed = (System.currentTimeMillis() - startTime);
        } else {
            elapsed = (endTime - startTime);
        }
        return elapsed;
    }
}
