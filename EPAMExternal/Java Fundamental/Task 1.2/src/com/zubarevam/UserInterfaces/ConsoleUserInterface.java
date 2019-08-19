/*
 * Консольный интерфейс, взаимодействующий с пользователем
 * @autor Зубарев Александр
 * Лекция № 1
 * Задача № 2
 */

package com.zubarevam.UserInterfaces;

import com.zubarevam.Logic.Task1_2;

import java.io.IOException;
import java.util.Scanner;

public class ConsoleUserInterface {
    private static Scanner in = new Scanner(System.in); // отвечает за прием символов с клавиатуры

    //запускает консольный интерфейс
    public static void start() {


        while (true) {
            /* описывает возможные варианты пользователю */
            System.out.println("\nChoose your option:\n" +
                    "1. Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.\n" +
                    "2. Ввести n строк с консоли. Вывести на консоль те строки, длина которых больше средней, а также длину.\n" +
                    "3. Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше средней, а также длину.\n" +
                    "4. Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. Если таких слов несколько, найти первое из них.\n" +
                    "5. Ввести n слов с консоли. Найти слово, состоящее только из различных символов. Если таких слов несколько, найти первое из них.\n" +
                    "6. Ввести n слов с консоли. Найти слово, состоящее только из цифр. Если таких слов больше одного, найти второе из них.\n" +
                    "exit - exit)\n");

            /* принимает выбор пользователя и выполняет соответсвующий вариант, либо выводит на экран, что данные введены неверно */
            try {
                int n; // количество строк введенное пользователем
                String[] str; // строки введенные пользователем
                String[] resultArray; // строки-ответ
                String words;
                String resultStr; // слово-ответ
                switch (in.nextLine()) {
                    case "1":
                        /* получение инпута с клавиатуры */
                        System.out.println("Input number of strings");
                        n = Integer.parseInt(in.nextLine());
                        System.out.println("Input strings");
                        str = new String[n];
                        for (int i = 0; i < n; i++) {
                            System.out.println("input Line: " + (i + 1));
                            str[i] = in.nextLine();
                        }

                        /* вычисление ответа */
                        resultArray = Task1_2.option1(str, n);

                        /* вывод ответа */
                        System.out.println("Shortest String:\n\"" + resultArray[0] + "\"\nit's length: " + resultArray[0].length());
                        System.out.println("Longest String:\n\"" + resultArray[1] + "\"\nit's length: " + resultArray[1].length());
                        break;
                    case "2":
                        /* получение инпута с клавиатуры */
                        System.out.println("Input number of strings");
                        n = Integer.parseInt(in.nextLine());
                        System.out.println("Input strings");
                        str = new String[n];
                        for (int i = 0; i < n; i++) {
                            System.out.println("input Line: " + i + 1);
                            str[i] = in.nextLine();
                        }

                        /* вычисление ответа */
                        resultArray = Task1_2.option2(str, n);

                        /* вывод ответа */
                        System.out.println("Result strings:");
                        for (String s : resultArray) {
                            System.out.println("\"" + s + "\"; it's length: " + s.length());
                        }
                        break;
                    case "3":
                        /* получение инпута с клавиатуры */
                        System.out.println("Input number of strings");
                        n = Integer.parseInt(in.nextLine());
                        System.out.println("Input strings");
                        str = new String[n];
                        for (int i = 0; i < n; i++) {
                            System.out.println("input Line: " + i + 1);
                            str[i] = in.nextLine();
                        }
                        /* вычисление ответа */
                        resultArray = Task1_2.option3(str, n);

                        /* вывод ответа */
                        System.out.println("Result strings:");
                        for (String s : resultArray) {
                            System.out.println("\"" + s + "\"; it's length: " + s.length());
                        }
                        break;
                    case "4":
                        /* получение инпута с клавиатуры */
                        System.out.println("Input number of words");
                        n = Integer.parseInt(in.nextLine());
                        System.out.println("Input words");
                        words = in.nextLine();

                        /* вычисление ответа */
                        resultStr = Task1_2.option4(words, n);

                        /* вывод ответа */
                        System.out.println("Result word:\n" + resultStr);
                        break;
                    case "5":
                        /* получение инпута с клавиатуры */
                        System.out.println("Input number of words");
                        n = in.nextInt();
                        System.out.println("Input words");
                        words = in.nextLine();

                        /* вычисление ответа */
                        resultStr = Task1_2.option5(words, n);

                        /* вывод ответа */
                        System.out.println("Result word:\n" + resultStr);
                        break;
                    case "6":
                        /* получение инпута с клавиатуры */
                        System.out.println("Input number of words");
                        n = Integer.parseInt(in.nextLine());
                        System.out.println("Input words");
                        words = in.nextLine();

                        /* вычисление ответа */
                        resultStr = Task1_2.option6(words, n);

                        /* вывод ответа */
                        System.out.println("Result word:\n" + resultStr);
                        break;
                    case "exit":
                        System.exit(0);
                    default:
                        //System.out.println("Incorrect input! Try again");
                        System.out.println("Incorrect output! Try again");
                }
            }
            catch (Exception e){
                System.out.println("Incorrect output! Try again");
            }
        }
    }




}
