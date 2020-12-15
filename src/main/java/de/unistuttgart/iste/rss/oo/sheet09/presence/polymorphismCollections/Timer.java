package de.unistuttgart.iste.rss.oo.sheet09.presence.polymorphismCollections;

import static java.lang.Math.pow;

enum State {
    READY,
    RUNNING,
    STOPPED
}

/**
 * A class implementing a timer or a stop watch
 * @author Steffen Becker
  */
public class Timer {

    private long nanosecondsAtStart;
    private long nanosecondsAtStop;
    private State timerState = State.READY;
    
    /**
     * When the timer is ready, start measuring the time. 
     */
    public void start() {
        if (timerState != State.READY) {
            throw new IllegalStateException("Timer not ready");
        }
        timerState = State.RUNNING;
        nanosecondsAtStart = System.nanoTime();
    }
    
    /**
     * When the timer is running, stop the measurement. 
     */
    public void stop() {
        if (timerState != State.RUNNING) {
            throw new IllegalStateException("Timer not running");
        }
        nanosecondsAtStop = System.nanoTime();
        timerState = State.STOPPED;
    }
    

    /**
     * Reset a stopped timer. 
     */
    public void reset() {
        if (timerState != State.STOPPED) {
            throw new IllegalStateException("Timer not stopped");
        }
        nanosecondsAtStart = 0;
        nanosecondsAtStop = 0;
        timerState = State.READY;
        
    }
    
    /**
     * @return Returns the measurement taken in case the timer has been stopped.
     */
    public long getResultInNanoseconds() {
        if (timerState != State.STOPPED) {
            throw new IllegalStateException("Timer not stopped");
        }
        return nanosecondsAtStop - nanosecondsAtStart;
    }

    /**
     * Print the measured time to the console in Microseconds 
     */
    public void printResult() {
        System.out.format("The timer recorded %dµs (%.4fms)\n", Math.round(getResultInNanoseconds() / pow(10, 3)), getResultInNanoseconds() / pow(10, 6));
    }
}