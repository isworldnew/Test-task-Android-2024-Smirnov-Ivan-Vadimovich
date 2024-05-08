package task4;

import task4.implementation.MediaResource;
import task4.implementation.NewsAnalyzer;
import task4.interfaces.NewsPoster;
import task4.interfaces.Subscriber;

public class Solution {
    public static void main(String[] args) {
        NewsPoster mediaResource = new MediaResource("Сделано в СГТУ");

        Subscriber analyzer = new NewsAnalyzer("NewsDetector", header -> header.contains("Android"));

        mediaResource.registerSubscriber(analyzer);

        mediaResource.postNews("ТОП языков программирования для Android-разработки", "*какой-то текст*");
        mediaResource.postNews("Лучшие бесплатные IDE", "*ещё какой-то текст*");
    }
}

