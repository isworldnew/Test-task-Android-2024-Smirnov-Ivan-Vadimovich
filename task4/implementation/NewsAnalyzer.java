package task4.implementation;

import task4.interfaces.News;
import task4.interfaces.Subscriber;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//пример того, как можно было бы реализовать Subscriber
public class NewsAnalyzer implements Subscriber {
    private String subscriberName;
    private List<News> filteredNews = new ArrayList<>();
    private Predicate<String> filter;

    public NewsAnalyzer(String subscriberName, Predicate<String> filter) {
        this.subscriberName = subscriberName;
        this.filter = filter;
    }

    public void setFilter(Predicate<String> filter) {
        if (filter != null) this.filter = filter;
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    @Override
    public void onPublish(News news) {
        if (filter.test(news.getHeader())) {
            filteredNews.add(news);
            System.out.println("По вашим фильтрам найдена новость: " + news.getHeader() + "...");
        }
    }
}

