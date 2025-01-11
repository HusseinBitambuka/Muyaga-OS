package com.muyaga.Hardware;

import com.muyaga.Hardware.imp.ClockListener;

public class Memory extends Hardware implements ClockListener {
    private static final int MEMORY_SIZE = 65536; // 64KB
    private final byte[] memory;

    // Constructor: Initializes all memory addresses to 0
    public Memory(int id, String name) {
        super(id, name);
        memory = new byte[MEMORY_SIZE];
        for (int address = 0; address < MEMORY_SIZE; address++) {
            memory[address] = 0x00;
        }
    }

    // Read a byte from memory
    public byte read(int address) {
        this.validateAddress(address);
        return memory[address];
    }

    // Write a byte to memory
    public void write(int address, byte value) {
        this.validateAddress(address);
        memory[address] = value;
    }

    // Validate that the address is within the valid range
    private void validateAddress(int address) {
        if (address < 0x0000 || address > 0xFFFF) {
            throw new IllegalArgumentException("Invalid memory address: " + Integer.toHexString(address));
        }
    }

    // Debug: Print memory contents
    public void debugPrintMemory(int startAddress, int endAddress) {
        this.validateAddress(startAddress);
        this.validateAddress(endAddress);

        for (int address = startAddress; address <= endAddress; address++) {
            System.out.printf("0x%04X: 0x%02X%n", address, memory[address]);
        }
    }

    @Override
    public void pulse() {
        this.log("received clock pulse");

    }
}
