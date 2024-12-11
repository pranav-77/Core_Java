package com.pranav.designPattern.observer;

public class YoutubeSubscriber implements Subscriber {
    private String name;

    public YoutubeSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String videoName) {
        System.out.println("Hey " + name + ", a new video is uploaded: " + videoName);
    }

    public static void main(String[] args) {
        YoutubeSubscriber subscriber = new YoutubeSubscriber("John");
        subscriber.update("Understanding the Observer Pattern");
    }
}
