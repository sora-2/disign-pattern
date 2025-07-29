package com.sora.patterns.structural.bridge;

public class AviFile implements VideoFile{
    @Override
    public void decode(String filename) {
        System.out.println("AviFile.decode");
    }
}
