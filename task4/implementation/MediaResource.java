package task4.implementation;

import task4.interfaces.News;
import task4.interfaces.NewsPoster;
import task4.interfaces.Subscriber;

import java.util.ArrayList;
import java.util.List;

//пример того, как можно было бы реализовать NewsPoster
public class MediaResource implements NewsPoster {

    private String mediaResourceName;
    private List<Subscriber> subscribers = new ArrayList<>();
    private List<News> allPostedNews = new ArrayList<>();

    public MediaResource(String mediaResourceName, Subscriber... subscribers) {
        if (mediaResourceName != null)
            this.mediaResourceName = mediaResourceName;

        for (Subscriber subscriber : subscribers)
            registerSubscriber(subscriber);
    }

    public String getMediaResourceName() {
        return mediaResourceName;
    }

    @Override
    public void registerSubscriber(Subscriber subscriber) {
        //в зависимости от бизнес-логики, тут может быть
        //другой принцип добавления. Это лишь демонстрация
        if (subscriber != null)
            subscribers.add(subscriber);
    }

    @Override
    public void postNews(String header, String content) {
        if (header == null || content == null)
            throw new IllegalArgumentException("Header and content should be filled!");

        News news = new NewsInner(header, content);
        allPostedNews.add(news);

        for (Subscriber subscriber : subscribers)
            subscriber.onPublish(news);
    }

    @Override
    public String toString() {
        return "MediaResource{" +
                "mediaResourceName='" + mediaResourceName + '\'' +
                '}';
    }

    //сам объект новости - "проприетарная" сущность для того, кто её создаёт
    //изменить новость извне - не получится
    private class NewsInner implements News {
        private String header, content;

        public NewsInner(String header, String content) {
            this.header = header;
            this.content = content;
        }

        @Override
        public String getHeader() {
            return header;
        }

        @Override
        public String getContent() {
            return content;
        }
    }
}
