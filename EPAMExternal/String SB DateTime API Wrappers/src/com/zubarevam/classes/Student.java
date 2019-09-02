package com.zubarevam.classes;

import com.zubarevam.interfaces.IStudent;

import java.time.*;
import java.util.Date;


public class Student implements IStudent {
    private String name;
    private Curriculum curriculum;
    private Date startDate;

    public Student(String name, Curriculum curriculum, Date startDate) {
        this.name = name;
        this.curriculum = curriculum;
        this.startDate = startDate;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Curriculum getCurriculum() {
        return curriculum;
    }

    @Override
    public Date getStartDate() {
        return startDate;
    }

    // подсчитывает время до завершения курса (положительное) или время после завершения курса
    public Duration countDurationFromCurriculumEndToThisMoment() {
        LocalDateTime currentDate = LocalDateTime.now();
        // переменная endDate - дата и время завершения курсов
        LocalDateTime endDate = convertToLocalDateTimeViaInstant(startDate).
                plusDays(curriculum.getHours() / 8);
        endDate = endDate.plusHours(curriculum.getHours() % 8);
        Duration ans;
        // если студент завершил обучение, isEnded = true, иначе false
        if (currentDate.isAfter(endDate)) {
            ans = Duration.between(endDate, currentDate);
        } else {
            ans = Duration.between(currentDate, endDate);
        }

        return ans;
    }
    public boolean isEnded() {
        LocalDateTime currentDate = LocalDateTime.now();
        // переменная endDate - дата и время завершения курсов
        LocalDateTime endDate = convertToLocalDateTimeViaInstant(startDate).
                plusDays(curriculum.getHours() / 8);
        endDate = endDate.plusHours(curriculum.getHours() % 8);
        boolean ans;
        // если студент завершил обучение, isEnded = true, иначе false
        if (currentDate.isAfter(endDate)) {
            return true;
        } else {
            return false;
        }
    }


    private LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }
    private LocalDateTime convertToLocalDateTimeViaInstant(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }

}
