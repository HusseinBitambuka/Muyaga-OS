package com.muyaga.Hardware;

import java.time.LocalDateTime;

public class Hardware {
    private int id;
    private String name;
    private LocalDateTime time;
    private Boolean debug = true;

    // Constructor
    public Hardware(int id, String name) {
        this.id = id;
        this.name = name;
        this.time = LocalDateTime.now(); // Set the time to the current time when created
        this.log("created");
    }

    // Getter for ID
    public int getId() {
        return this.id;
    }

    // Getter for Name
    public String getName() {
        return this.name;
    }

    // Getter for Time
    public LocalDateTime getTime() {
        return this.time;
    }

    // Getter for Debug
    public Boolean getDebug() {
        return this.debug;
    }

    // Setter for Debug (optional, if you want to enable/disable debugging)
    public void setDebug(Boolean debug) {
        this.debug = debug;
    }

    // Log method
    public void log(String message) {
        if (this.getDebug()) {
            System.out.println(
                    "[ HW - " + this.getName() + ": " + this.getId() + " : " + this.getTime() + " ]: " + message);
        }
    }
}
