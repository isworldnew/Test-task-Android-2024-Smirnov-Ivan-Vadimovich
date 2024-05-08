package task4.interfaces;

//конечно, в зависимости от бизнес-логики, тут может быть и получение даты, и что угодно ещё
public interface News {
    String getHeader();
    String getContent();
}
