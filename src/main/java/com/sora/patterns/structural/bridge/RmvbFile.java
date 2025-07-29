package com.sora.patterns.structural.bridge;

public class RmvbFile implements VideoFile{
    @Override
    public void decode(String filename) {
        System.out.println("RmvbFile.decode");
    }
}
