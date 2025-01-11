package com.muyaga.Hardware;

import java.util.ArrayList;
import java.util.List;

import com.muyaga.Hardware.imp.ClockListener;

public class Clock extends Hardware {
    private List<ClockListener> listeners = new ArrayList<>();
    private boolean running = false;

    public Clock(int id, String name) {
        super(id, name);
    }

    // Register a listener
    public void addListener(ClockListener listener) {
        listeners.add(listener);
    }

    // Remove a listener
    public void removeListener(ClockListener listener) {
        listeners.remove(listener);
    }

    // Simulate clock ticks
    public void startClock(int intervalMillis) {
        running = true;

        new Thread(() -> {
            while (running) {
                try {
                    Thread.sleep(intervalMillis); // Wait for the interval
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }

                // Notify all listeners
                for (ClockListener listener : listeners) {
                    listener.pulse();
                    ;
                }
            }
        }).start();
    }

    public void stopClock() {
        running = false;
    }
}
