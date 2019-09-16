package com.zubarevam;

import com.zubarevam.option1.ReadAndWrite;
import com.zubarevam.option2.CreateCatalogList;
import com.zubarevam.option3.PoemCreateAndSortByStringLength;
import com.zubarevam.option4.CheckBracketCorrectnessWithStack;
import com.zubarevam.option5.ChoseDifferentWords;

import java.io.IOException;

public class StartPoint {

    public static void main(String[] args) throws IOException {
        StartPoint startPoint = new StartPoint();
        startPoint.testAll();
    }

    private void testAll() throws IOException {
        testOption1();
        System.out.println("\n\nOption №2:");
        testOption2();
        System.out.println("\n\nOption №3:");
        testOption3();
        System.out.println("\n\nOption №4:");
        testOption4();
        System.out.println("\n\nOption №5:");
        testOption5();
    }
    private void testOption1() {
        ReadAndWrite option1 = new ReadAndWrite();
        option1.execute();
    }
    private void testOption2() throws IOException {
        CreateCatalogList option2 = new CreateCatalogList();
        option2.execute().forEach(System.out::println);
    }
    private void testOption3() {
        String poem =
            "Вот она - сидит ко мне спиною.\n" +
            "Вроде тут, потрогать даже можно.\n" +
            "Hа вопрос ответит односложно\n" +
            "Или покачает головою.\n" +
            "Где она сейчас на самом деле?\n" +
            "Где угодно, только не со мною.\n" +
            "Сам себе посуду я помою,\n" +
            "Сам себе я ужин разогрею.\n" +
            "У нее великие проблемы -\n" +
            "Кубики в стакан сложить плотнее,\n" +
            "Дьявола пристукнуть поскорее\n" +
            "И коннект дождаться от модема.\n" +
            "Глупый я - открыл ей виртуальность,\n" +
            "Hаучил компьютерному делу,\n" +
            "Сам себе урезал \"доступ к телу\",\n" +
            "Получил печальную реальность.";
        PoemCreateAndSortByStringLength option3 = new PoemCreateAndSortByStringLength();
        option3.execute(poem).forEach(System.out::println);
    }
    private void testOption4() {
        String[] brackets = {"{()[]}", "{[{((){})}]}", "[[]", "]][]", "[[]]]"};
        CheckBracketCorrectnessWithStack option4 = new CheckBracketCorrectnessWithStack();
        for (String s : brackets) {
            System.out.println(s + " : " + option4.execute(s));
        }
    }
    private void testOption5() throws IOException {
        ChoseDifferentWords option5 = new ChoseDifferentWords();
        option5.execute().forEach(System.out::println);
    }
}
