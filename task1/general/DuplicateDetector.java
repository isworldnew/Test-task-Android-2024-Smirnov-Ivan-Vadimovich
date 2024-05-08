package task1.general;

import java.util.Optional;

public class DuplicateDetector {

    //Возвращение объекта Optional помогает пользователю самому
    //определить нужное значение в том случае, если дубликата нет
    //Данный подход сильно лучше, чем если бы мы возвращали своё
    //фиксированное значение. И он более объектно-ориентированный
    public static Optional<Integer> find(int[] arr) {
        validate(arr);

        //так как мы точно знаем, что элементы массива лежат на отрезке [1, 100],
        //для Cортировки Подсчётом (Counting Sort) достаточно такого массива
        int[] counter = new int[100];

        for (int i : arr) {
            counter[i-1] += 1;
            //по условию задачи - у нас только один дубль,
            //поэтому можно сразу прерывать поиск в случае,
            //когда элемент встретился более одного раза
            if (counter[i-1] > 1) return Optional.of(i);
        }

        return Optional.empty();
    }

    private static void validate(int[] arr) {

        for (int i : arr)
            if (i < 1 || i > 100)
                throw new IllegalArgumentException("All array's elements should be in [1, 100] / Все элементы массива должны быть из отрезка [1, 100]");

    }

}
