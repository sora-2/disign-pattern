package com.sora.patterns.structural.bridge;

public class Windows extends OperatingSystem{
    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String name) {
        videoFile.decode(name);
    }
}
