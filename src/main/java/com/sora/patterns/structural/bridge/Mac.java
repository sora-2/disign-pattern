package com.sora.patterns.structural.bridge;

public class Mac extends OperatingSystem{
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String name) {
        videoFile.decode(name);
    }
}
