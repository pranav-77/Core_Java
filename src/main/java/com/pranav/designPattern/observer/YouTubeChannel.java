package com.pranav.designPattern.observer;

public interface YouTubeChannel {
    void subscribe(Subscriber subscriber);

    void unsubscribe(Subscriber subscriber);

    void notifySubscribers();
}
