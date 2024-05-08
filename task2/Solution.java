package task2;

public class Solution {

    public static void main(String[] args) {

        //В рандомайзере сгенерировал тестовый массив
        //Очень плохая практика - хранить такой большой массив прямо в коде
        //Оставил его просто для демонстрации
        //В комментарии ниже представил отсортированную версию, чтобы можно было
        //сравнить с выводом алгоритма

        int[] arr = new int[]{
                21, 100, 52, 62, 25, 30, 18, 49, 53, 93, 22, 65, 25, 4, 54, 67, 100, 52, 19, 71,
                3, 66, 62, 21, 39, 80, 100, 33, 50, 97, 56, 45, 33, 63, 11, 69, 48, 3, 89, 2, 15,
                7, 40, 29, 8, 3, 35, 95, 52, 99, 28, 57, 71, 17, 39, 45, 20, 78, 17, 68, 92, 68,
                19, 58, 64, 32, 50, 68, 11, 100, 42, 94, 71, 77, 50, 47, 83, 13, 31, 44, 66, 20,
                23, 35, 20, 87, 3, 86, 71, 2, 12, 26, 83, 70, 84, 16, 44, 62, 4, 27, 9, 54, 97,
                28, 58, 43, 2, 41, 32, 50, 87, 37, 36, 36, 48, 41, 76, 76, 5, 22, 84, 84, 47, 18,
                8, 35, 55, 16, 69, 74, 14, 52, 89, 99, 47, 98, 25, 46, 97, 90, 7, 35, 6, 56, 12,
                37, 12, 24, 3, 52, 85, 88, 31, 91, 86, 25, 17, 27, 6, 79, 80, 90, 25, 13, 42, 31,
                44, 1, 86, 6, 72, 11, 10, 36, 96, 71, 82, 91, 66, 56, 23, 61, 93, 72, 14, 41, 93,
                69, 41, 80, 12, 99, 100, 1, 68, 81, 36, 23, 21, 72, 90, 38, 86, 49, 13, 43, 60, 90,
                64, 39, 5, 75, 73, 20, 18, 86, 80, 19, 92, 83, 2, 31, 91, 70, 73, 89, 70, 92, 29,
                41, 14, 63, 72, 85, 34, 14, 20, 82, 24, 26, 25, 8, 5, 76, 72, 51, 33, 43, 81, 74,
                65, 1, 54, 88, 86, 86, 9, 97, 79, 19, 48, 12, 92, 89, 10, 67, 87, 85, 85, 24, 83,
                6, 53, 83, 82, 30, 44, 59, 100, 70, 84, 68, 53, 48, 96, 41, 69, 42, 36, 27, 57, 12,
                39, 26, 28, 100, 15, 76, 92, 34
        };

        BinarySearchTree bst = new BinarySearchTree(arr);
        bst.getNodesInfo();

    }

    /*
        1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 5, 5, 5, 6, 6, 6, 6, 7, 7, 8, 8, 8, 9, 9,
        10, 10, 11, 11, 11, 12, 12, 12, 12, 12, 12, 13, 13, 13, 14, 14, 14, 14, 15, 15, 16,
        16, 17, 17, 17, 18, 18, 18, 19, 19, 19, 19, 20, 20, 20, 20, 20, 21, 21, 21, 22, 22,
        23, 23, 23, 24, 24, 24, 25, 25, 25, 25, 25, 25, 26, 26, 26, 27, 27, 27, 28, 28, 28,
        29, 29, 30, 30, 31, 31, 31, 31, 32, 32, 33, 33, 33, 34, 34, 35, 35, 35, 35, 36, 36,
        36, 36, 36, 37, 37, 38, 39, 39, 39, 39, 40, 41, 41, 41, 41, 41, 41, 42, 42, 42, 43,
        43, 43, 44, 44, 44, 44, 45, 45, 46, 47, 47, 47, 48, 48, 48, 48, 49, 49, 50, 50, 50,
        50, 51, 52, 52, 52, 52, 52, 53, 53, 53, 54, 54, 54, 55, 56, 56, 56, 57, 57, 58, 58,
        59, 60, 61, 62, 62, 62, 63, 63, 64, 64, 65, 65, 66, 66, 66, 67, 67, 68, 68, 68, 68,
        68, 69, 69, 69, 69, 70, 70, 70, 70, 71, 71, 71, 71, 71, 72, 72, 72, 72, 72, 73, 73,
        74, 74, 75, 76, 76, 76, 76, 77, 78, 79, 79, 80, 80, 80, 80, 81, 81, 82, 82, 82, 83,
        83, 83, 83, 83, 84, 84, 84, 84, 85, 85, 85, 85, 86, 86, 86, 86, 86, 86, 86, 87, 87,
        87, 88, 88, 89, 89, 89, 89, 90, 90, 90, 90, 91, 91, 91, 92, 92, 92, 92, 92, 93, 93,
        93, 94, 95, 96, 96, 97, 97, 97, 97, 98, 99, 99, 99, 100, 100, 100, 100, 100, 100, 100
    */
}
