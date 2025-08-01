package com.sora.patterns.structural.bridge;

public abstract class OperatingSystem {
    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }
    public abstract void play(String name);
}
