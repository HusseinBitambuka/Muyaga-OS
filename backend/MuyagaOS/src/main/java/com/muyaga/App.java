package com.muyaga;

import com.muyaga.Hardware.CPU;
import com.muyaga.Hardware.Memory;
import com.muyaga.Hardware.Clock;

public class App {
    private CPU processor;
    private Memory ram;
    private Clock clk;
    private final int CLOCK_INTERVAL = 1000; // Interval in milliseconds

    // Constructor
    public App() {
        this.processor = new CPU(0, "CPU");
        this.ram = new Memory(1, "RAM");
        this.clk = new Clock(2, "CLK");
    }

    // Initialize and run the system
    public void startSystem() {
        // Add hardware as clock listeners
        clk.addListener(processor);
        clk.addListener(ram);

        // Start the clock
        clk.startClock(CLOCK_INTERVAL);
    }

    public static void main(String[] args) {
        // Create an instance of App and start the system
        App app = new App();
        app.startSystem();
    }
}
