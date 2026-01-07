package com.code;

public class ConfiPuerto {
    private static ConfiPuerto instance;
    private int port = 5000;

    public static ConfiPuerto getInstance(){
        if (instance == null) {
            instance = new ConfiPuerto();
        }
        return instance;
    }

    public int getPort() {
        return port;
    }
    
}
