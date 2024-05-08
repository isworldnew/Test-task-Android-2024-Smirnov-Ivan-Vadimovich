package task4.interfaces;

public interface NewsPoster {
    void registerSubscriber(Subscriber subscriber);
    void postNews(String header, String content);
}

