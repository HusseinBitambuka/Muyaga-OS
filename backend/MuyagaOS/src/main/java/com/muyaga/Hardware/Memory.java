package com.muyaga.Hardware;

public class Memory {
    private String[] memory = new String[256];

    public Memory() {
        for (int i = 0; i < this.memory.length; i++) {
            this.memory[i] = Integer.toHexString(0);
        }
    }
}
