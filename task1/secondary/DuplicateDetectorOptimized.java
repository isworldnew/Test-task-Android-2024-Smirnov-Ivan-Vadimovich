package task1.secondary;

import java.util.Optional;
import java.util.function.Predicate;

public class DuplicateDetectorOptimized {
    //константы, полученные опытным путём
    private static final int sumOfEvenElements = 2550; //чётные
    private static final int sumOfOddElements = 2500; //нечётные

    public static Optional<Integer> find(int[] arr) {
        validation(arr);

        int currentSumOfEvenElements = sumOfElementsByCondition(arr, OddOrEven.EVEN);
        int currentSumOfOddElements = sumOfElementsByCondition(arr, OddOrEven.ODD);

        //это либо ситуация, когда нет дубля вообще - либо, когда дубль произошёл в одной группе элементов
        boolean oddSumEquality = (currentSumOfOddElements == sumOfOddElements);
        boolean evenSumEquality = (currentSumOfEvenElements == sumOfEvenElements);
        if (oddSumEquality || evenSumEquality) {

            if (oddSumEquality && evenSumEquality)
                return Optional.empty();

            if (oddSumEquality && !evenSumEquality)
                return partialCountingSort(arr, OddOrEven.EVEN);


            if (!oddSumEquality && evenSumEquality)
                return partialCountingSort(arr, OddOrEven.ODD);
        }

        else {
            if (currentSumOfOddElements < sumOfOddElements)
                return Optional.of(currentSumOfEvenElements - sumOfEvenElements);

            else
                return Optional.of(currentSumOfOddElements - sumOfOddElements);

        }

        return Optional.empty();
    }

    private static void validation(int[] arr) {

        if (arr.length != 100)
            throw new IllegalArgumentException("Array's length should be 100 / Длина массива должна быть 100");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 1 || arr[i] > 100)
                throw new IllegalArgumentException("All array's elements should be in [1, 100] / Все элементы массива должны быть из отрезка [1, 100]");
        }

    }
    private static int sumOfElementsByCondition(int[] arr, OddOrEven oddOrEven) {
        int sum = 0;

        for (int x : arr)
            if (oddOrEven.test(x)) sum += x;

        return sum;
    }
    private static Optional<Integer> partialCountingSort(int[] arr, OddOrEven oddOrEven) {

        //очевидно, что 50 элементов

        int[] amountOfElementByIndex = new int[50];

        for (int i = 0; i < amountOfElementByIndex.length; i++)
            amountOfElementByIndex[i] = 0;

        for (int i = 0; i < arr.length; i++)
            if (oddOrEven.test(arr[i]))
                amountOfElementByIndex[oddOrEven.indexDependency(arr[i])] += 1;


        for (int i = 0; i < amountOfElementByIndex.length; i++)
            if (amountOfElementByIndex[i] > 1) return Optional.of(oddOrEven.valueDependency(i));

        return Optional.empty();
    }
    private enum OddOrEven implements Predicate<Integer> {
        ODD {
            @Override
            public boolean test(Integer value) {
                return value % 2 == 1;
            }
            @Override
            public int indexDependency(int value) {
                return value / 2;
            }
            @Override
            public int valueDependency(int index) {
                return index * 2 + 1;
            }
        },

        EVEN{
            @Override
            public boolean test(Integer value) {
                return value % 2 == 0;
            }
            @Override
            public int indexDependency(int value) {
                return value / 2 - 1;
            }
            @Override
            public int valueDependency(int index) {
                return (index + 1) * 2;
            }
        };


        //вычисление того, как связан индекс и значение
        public abstract int indexDependency(int value);
        public abstract int valueDependency(int index);
    }
}

