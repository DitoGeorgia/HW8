public class Main {
    public static void main(String[] args) {
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //#2 Распечатать все значения массива начиная с 0 до последнего индексов.
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("==================================\n");
        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
        System.out.println("==================================\n");
        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - (1 + i)];
            array[array.length - (1 + i)] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
