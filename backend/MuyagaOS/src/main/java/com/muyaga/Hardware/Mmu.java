package com.muyaga.Hardware;

public class Mmu extends Hardware {
    private Memory ram;
    private short mar;
    private byte mdr;

    public Mmu() {
        super(0, "Mmu");
        this.ram = new Memory(0, "Ram");
        this.mar = 0x0000;
        this.mdr = 0x00;
    }

    void setMar(short newMar) {
        this.mar = newMar;
    }

    void setMdr(byte newMdr) {
        this.mdr = newMdr;
    }

    short getMar() {
        return this.mar;
    }

    byte getMdr() {
        return this.mdr;
    }

    void readMemoryAddress() {
        this.mdr = this.ram.getDataAtAddrressLocation(this.mar);
    }

    void writeMemoryAddress() {
        this.ram.setMemoryAddress(this.mar, this.mdr);
    }

    void resetMemory() {
        for (short address = 0; address < this.ram.getMemory().length; address++) {
            this.ram.setMemoryAddress(address, (byte) 0x00); // for some reason, Java treat hexadecimals as integer by
                                                             // default.
        }
    }

}
