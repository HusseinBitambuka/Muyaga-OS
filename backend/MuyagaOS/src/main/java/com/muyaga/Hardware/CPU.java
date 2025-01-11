package com.muyaga.Hardware;

import com.muyaga.Hardware.imp.ClockListener;

public class CPU extends Hardware implements ClockListener {
    private int cpuClockCount = 0;

    public CPU(int id, String name) {
        super(id, name);
    }

    @Override
    public void pulse() {
        this.log("received clock pulse - CPU Clock Count: " + cpuClockCount++);
    }
}