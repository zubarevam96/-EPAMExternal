/*
 * Логика задания № 1
 * @autor Зубарев Александр
 * Лекция № 1
 * Задача № 1
 */


package com.zubarevam.Logic;

public class Task1 {
    public static final int NUM_OF_ELEMENTS = 20; // количество элементов у массива
    public static final int[] array = new int[NUM_OF_ELEMENTS]; // главный массив, с которым работает задание





    // 1. поменять местами максимальный отрицательный элемент и минимальный положительный.
    public static void option1() {
        int iMaxNeg = 0; // индекс максивального отрицательноо элемента
        int iMinPos = 0; // индекс минимального положительного элемента
        int maxNeg = -20; // значение максивального отрицательноо элемента
        int minPos =  20; // значение минимального положительного элемента

        /* вычисление индексов макс. отриц. и мин. полож. элементов */
        for (int i = 0; i < NUM_OF_ELEMENTS; i++) {
            if (array[i] < 0) {
                if (array[i] > maxNeg) {
                    iMaxNeg = i;
                    maxNeg = array[i];
                }
            }
            if (array[i] > 0) {
                if (array[i] < minPos) {
                    iMinPos = i;
                    minPos = array[i];
                }
            }
        }
        /* свап элементов */
        int tmp = array[iMaxNeg];
        array[iMaxNeg] = array[iMinPos];
        array[iMinPos] = tmp;
    }
    // 2. определить сумму элементов, состоящих на чётных позициях.
    public static int option2() {
        int sum = 0;
        for (int i = 1; i < NUM_OF_ELEMENTS; i+= 2) { // четные позиции имеют нечетные индексы
            sum += array[i];
        }
        return sum;
    }
    // 3. заменить нулями отрицательные элементы.
    public static void option3() {
        for (int i = 0; i < NUM_OF_ELEMENTS; i++)
            if (array[i] < 0) {
                array[i] = 0;
            }
    }
    // 4. утроить каждый положительный элемент который стоит перед отрицательным.
    public static void option4() {
        for (int i = 1; i < NUM_OF_ELEMENTS; i++) {
            if (array[i] < 0 && array[i - 1] > 0) {
                array[i - 1] *= 3;
            }
        }
    }
    // 5. найти разницу между средним арифметическим и значение минимального элемента.
    public static double option5() {
        double average = 0; // среднее арифметическое
        int minElement = 11; // минимальное значение элемента; инициализировано как 11 т к элементы массива от -10 до 10
        for (int i = 0; i < NUM_OF_ELEMENTS; i++) {
            average += array[i];
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }
        return average / NUM_OF_ELEMENTS - minElement;
    }
    // 6. вывести все элементы, которые встречаются больше одного раза и индексы которых нечётные.
    /*
    * Алгоритм.
    *  Шаг 1: за первый проход по массиву подсчитываем, какое число (от -10 до 10) сколько раз встречается
    *   (с помощью массива countMeets: числу -10 соответствует число 0 массива array, и так далее)
    *
    * Шаг 2: вторым проходом по нечетным индексам смотрим, сколько раз встретилось число array[i]
    *   (если в countMeets[array[i]] будет больше единицы - число встретилось больше одного раза),
    *   и считаем, сколько будет таких элементов, чтобы создать массив нужной длины
    *   такие махинации нужны из-за невозможности изменять длину массива
    * Шаг 3: третьим проходом делаем то же, что и на втором, только теперь заполняем массив,
    *   а не считаем количество элементов
    */
    public static int[] option6() {
        int[] countMeets = new int[21];
        int length = 0; // длина результирующего массива
        for (int i = 0; i < NUM_OF_ELEMENTS; i++) {
            countMeets[array[i] + 10]++;
        }

        for (int i = 1; i < NUM_OF_ELEMENTS; i += 2) {
            if (countMeets[array[i] + 10] > 1) {
                length++;
            }
        }
        int[] result = new int[length]; // возвращаемый массив
        int j = 0; // индекс массива result
        for (int i = 1; i < NUM_OF_ELEMENTS; i += 2) {
            if (countMeets[array[i] + 10] > 1) {
                result[j++] = array[i]; // инкрементируем j после присвоения значения j-тому элементу
            }
        }
        return result;
    }

    // пересоздание массива
    public static void recreate() {
        for (int i = 0; i < NUM_OF_ELEMENTS; i++) {
            array[i] = (int)(Math.random() * 100) % 21 - 10;
        }
    }
}
