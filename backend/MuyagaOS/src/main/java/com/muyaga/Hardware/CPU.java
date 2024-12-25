package com.muyaga.Hardware;

import com.muyaga.Hardware.imp.ClockListener;

public class CPU implements ClockListener {
    private int cpuClockCount = 0;

    public void pulse() {
        System.out.println("received clock pulse - CPU Clock Count: " + cpuClockCount++);
    }
}