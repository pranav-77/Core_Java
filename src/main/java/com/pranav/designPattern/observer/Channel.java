package com.pranav.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements YouTubeChannel {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String channelName;
    private String newVideo;

    public Channel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(newVideo);
        }
    }

    public void uploadVideo(String videoName) {
        this.newVideo = videoName;
        System.out.println("Channel " + channelName + " uploaded: " + videoName);
        notifySubscribers();
    }
}
