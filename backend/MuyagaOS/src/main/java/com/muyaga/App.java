package com.muyaga;

import com.muyaga.Hardware.Memory;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Memory ram = new Memory();
        ram.debugPrintMemory(0, 100);
    }
}
