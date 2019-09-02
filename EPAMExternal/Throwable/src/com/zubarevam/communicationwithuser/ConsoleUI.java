package com.zubarevam.communicationwithuser;

import com.zubarevam.classes.Student;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Locale;
import java.util.NoSuchElementException;

public class ConsoleUI {
    public void show(Student[] students) {
        try {
            for (Student student : students) {
                Duration duration = student.countDurationFromCurriculumEndToThisMoment();
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault());
                String messagePart = !student.isEnded() ?
                        "Обучение не закончено. До окончания осталось "
                        :
                        "Обучение закончено. После окончания прошло ";
                System.out.println(student.getName() + " (" + student.getCurriculum().getName() + ") - "
                        + messagePart + duration.toDays() + " д. " + duration.toHoursPart() + " ч.");
            }
        } catch (NoSuchElementException e) {
            System.err.println("NoSuchElementException in Class \"ConsoleUI\", method \"show\"");
        } catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException in Class \"ConsoleUI\", method \"show\"");
        } catch (Exception e) {
            System.err.println("Exception in Class \"ConsoleUI\", method \"show\"");
        }
    }
}
// Ivanov Ivan (Java Developer) - Обучение не закончено. До окончания осталось 1 д 6 ч.
// Petrov Petr (J2EE Developer) - Обучение закончено. После окончания прошло 3 ч.