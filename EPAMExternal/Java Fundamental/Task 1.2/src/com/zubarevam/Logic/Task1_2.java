/*
 * Логика задания № 1
 * @autor Зубарев Александр
 * Лекция № 1
 * Задача № 2
 */


package com.zubarevam.Logic;

public class Task1_2 {




/*
1. Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
2. Ввести n строк с консоли. Вывести на консоль те строки, длина которых больше средней, а также длину.
3. Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше средней, а также длину.
4. Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. Если таких слов несколько, найти первое из них.
5. Ввести n слов с консоли. Найти слово, состоящее только из различных символов. Если таких слов несколько, найти первое из них.
6. Ввести n слов с консоли. Найти слово, состоящее только из цифр. Если таких слов больше одного, найти второе из них.
 */

    // 1. Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
    public static String[] option1(String[] str, int n) {
        int iLongest = 0; // индекс самой длинной строки
        int iShortest = 0; // индекс самой короткой строки
        for (int i = 0; i < str.length; i++) {
            if (str[iLongest].length() < str[i].length()) {
                iLongest = i;
            }
            if (str[iShortest].length() > str[i].length()) {
                iShortest = i;
            }
        }

        /* создает массив-ответ и возвращает его */
        String[] ans = new String[2];
        ans[0] = str[iShortest];
        ans[1] = str[iLongest];
        return ans;
    }
    // 2. Ввести n строк с консоли. Вывести на консоль те строки, длина которых больше средней, а также длину.
    public static String[] option2(String[] str, int n) {

        /* вычисление средней длины строки */
        int average = 0; // средняя длина строки
        for (String s : str) {
            average += s.length();
        }
        average /= n;

        /* вычисление количества строк, которые больше среднего */
        int nResult = 0; // количество строк в результирующем массиве
        for (String s : str) {
            if (s.length() > average) {
                nResult++;
            }
        }

        /* создание и заполнение результирующего массива */
        String[] result = new String[nResult];
        int i = 0; // индекс для массива result
        for (String s : str) {
            if (s.length() > average) {
                result[i++] = s;
            }
        }
        return result;
    }
    // 3. Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше средней, а также длину.
    public static String[] option3(String[] str, int n) {

        /* вычисление средней длины строки */
        int average = 0; // средняя длина строки
        for (String s : str) {
            average += s.length();
        }
        average = (average + (n + 1) / 2) / n; // вычисление с округление в большую сторону

        /* вычисление количества строк, которые меньше среднего */
        int nResult = 0; // количество строк в результирующем массиве
        for (String s : str) {
            if (s.length() < average) {
                nResult++;
            }
        }

        /* создание и заполнение результирующего массива */
        String[] result = new String[nResult];
        int i = 0; // индекс для массива result
        for (String s : str) {
            if (s.length() < average) {
                result[i++] = s;
            }
        }
        return result;

    }
    // 4. Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. Если таких слов несколько, найти первое из них.
    public static String option4(String str, int n) {

        /* перегруппировывает строку в массив слов */
        String[] word = stringToWords(str, n);

        /* вычисляет слово с минимальным кол-вом различных символов */
        int count = 100; // минимальное число разлчных символов у слова word[i]
        int iAns = 0; // индекс искомого слова в массиве word
        for (int i = 0; i < word.length; i++) { // проход по словам у массива word
            int curCount = 0; // минимальное число различных сивмолов у слова word[i]
            for (int j = 0; j < word[i].length(); j++) { // проход по символам в слове word[i]
                char tmp = (char) word[i].indexOf(j); // j-тый символ
                if (word[i].indexOf(tmp) == j) {
                    curCount++;
                }
            }
            if (curCount < count) {
                count = curCount;
                iAns = i;
            }
        }
        return word[iAns];
    }
    // 5. Ввести n слов с консоли. Найти слово, состоящее только из различных символов. Если таких слов несколько, найти первое из них.
    public static String option5(String str, int n) {
        /* перегруппировывает строку в массив слов */
        String[] word = stringToWords(str, n);

        /* вычисляет первое слово, состоящее только из различных символов */
        for (String s : word) { // проход по словам у массива word
            boolean isCorrupted = false; // отвечает на вопрос: есть ли у слова s одинаковые символы?
            for (int j = 0; j < s.length(); j++) { // проход по символам в слове s
                char tmp = (char) s.indexOf(j); // j-тый символ
                if (s.indexOf(tmp) < j) {
                    isCorrupted = true;
                    break;
                }
            }
            /* если у слова нет одинаковых символов, возвращаем его */
            if (!isCorrupted) {
                return s;
            }
        }
        return ""; //если нет слова состоящего только из различных символов, возвращаем пустую строку
    }
    // 6. Ввести n слов с консоли. Найти слово, состоящее только из цифр. Если таких слов больше одного, найти второе из них.

    public static String option6(String str, int n) {
        /* перегруппировывает строку в массив слов */
        String[] word = stringToWords(str, n);
        String numbers = "0123456789";
        int rightChoiseCount = 0; // считает количество подходящих слов
        String rightWord = ""; // содержит в себе ответ
        for (String s : word) { // проход по словам у массива word
            boolean isOnlyNumbers = true; // отвечает на вопрос: только ли из символов состоит слово s?
            for (int j = 0; j < s.length(); j++) {
                char tmp = (char) s.indexOf(j); // j-тый символ
                if (numbers.indexOf(tmp) == -1) {
                    isOnlyNumbers = false;
                    break;
                }
            }
            if (isOnlyNumbers) {
                rightChoiseCount++;
                rightWord = s;
                if (rightChoiseCount == 2) {
                    return rightWord;
                }
            }
        }
        /* если не нашлось двух подходящих строк, выведет либо первую подходящую, либо пустую строку*/
        return rightWord;
    }

    /* перевод строки со словами в массив строк. используется в вариантах 4, 5, 6 */
    private static String[] stringToWords(String str, int n) {
        String[] word = new String[n]; // массив строк
        int iWord = 0; // индекс для массива строк
        for (String tmp : " ".split(str)) {
            word[iWord++] = tmp;
        }
        return word;
    }
}
