/*
 * Консольный интерфейс, взаимодействующий с пользователем
 * @autor Зубарев Александр
 * Лекция № 1
 * Задача № 1
 */

package com.zubarevam.UserInterfaces;

import com.zubarevam.Logic.Task1;

import java.util.Scanner;

public class ConsoleUserInterface {
    private static Scanner in = new Scanner(System.in); // отвечает за прием символов с клавиатуры

    //запускает консольный интерфейс
    public static void start() {

            /* задает массиву некоторые значения */
            Task1.recreate();
            /* выводит на экран текущий массив */
            System.out.println("Your array now is:\n");
            for (int i = 0; i < Task1.NUM_OF_ELEMENTS; i++) {
                System.out.print(Task1.array[i] + " ");
            }
        while (true) {
            /* описывает возможные варианты пользователю */
            System.out.println("\nChoose your option:\n" +
                    "1. поменять местами максимальный отрицательный элемент и минимальный положительный.\n" +
                    "2. определить сумму элементов, состоящих на чётных позициях.\n" +
                    "3. заменить нулями отрицательные элементы.\n" +
                    "4. утроить каждый положительный элемент, который стоит перед отрицательным.\n" +
                    "5. найти разницу между средним арифметическим и значение минимального элемента.\n" +
                    "6. вывести все элементы, которые встречаются больше одного раза и индексы которых нечётные.\n" +
                    "Or n - recreate array\n" +
                    "exit - exit)\n");

            /* принимает выбор пользователя и выполняет соответсвующий вариант, либо выводит на экран, что данные введены неверно */
            switch (in.nextLine()) {
                case "1":
                    System.out.println("Array was/Array now:");
                    showArray(Task1.array);
                    Task1.option1();
                    showArray(Task1.array);
                    break;
                case "2":
                    System.out.println("Sum is: " + Task1.option2());
                    break;
                case "3":
                    System.out.println("Array was/Array now:");
                    showArray(Task1.array);
                    Task1.option3();
                    showArray(Task1.array);
                    break;
                case "4":
                    System.out.println("Array was/Array now:");
                    showArray(Task1.array);
                    Task1.option4();
                    showArray(Task1.array);
                    break;
                case "5":
                    System.out.println("Answer is: " + Task1.option5());
                    break;
                case "6":
                    System.out.println("Array was/Result array:");
                    showArray(Task1.array);
                    showArray(Task1.option6());
                    break;
                case "n":
                    System.out.println("Array was/Array now:");
                    showArray(Task1.array);
                    Task1.recreate();
                    showArray(Task1.array);
                    break;
                case "exit":
                    System.exit(0);
                default:
                    System.out.println("Incorrect input! Try again");
            }
        }
    }
    private static void showArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }


}
