package com.zubarevam.classes;

import com.zubarevam.interfaces.IStudent;

import java.time.*;
import java.util.Date;


public class Student implements IStudent {
    public static final int NUM_OF_HOURS_PER_DAY = 8;
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
        try {
            LocalDateTime currentDate = LocalDateTime.now();
            // переменная endDate - дата и время завершения курсов
            LocalDateTime endDate = convertToLocalDateTimeViaInstant(startDate).
                    plusDays(curriculum.getHours() / NUM_OF_HOURS_PER_DAY);
            endDate = endDate.plusHours(curriculum.getHours() % NUM_OF_HOURS_PER_DAY);
            Duration ans;
            // если студент завершил обучение, isEnded = true, иначе false
            if (currentDate.isAfter(endDate)) {
                ans = Duration.between(endDate, currentDate);
            } else {
                ans = Duration.between(currentDate, endDate);
            }

            return ans;
        } catch (Exception e) {
            System.err.println("Exception in Class \"Student\", method \"isEnded\"");
            e.printStackTrace();
            throw e;
        }
    }
    public boolean isEnded() {

            LocalDateTime currentDate = LocalDateTime.now();
            // переменная endDate - дата и время завершения курсов
            LocalDateTime endDate;
            try {
                endDate = convertToLocalDateTimeViaInstant(startDate).
                        plusDays(curriculum.getHours() / NUM_OF_HOURS_PER_DAY);
                endDate = endDate.plusHours(curriculum.getHours() % NUM_OF_HOURS_PER_DAY);

                boolean ans;
                // если студент завершил обучение, isEnded = true, иначе false
                return currentDate.isAfter(endDate);
            }
            catch (Exception e) {
                System.err.println("Exception in Class \"Student\", method \"isEnded\"");
                e.printStackTrace();
                throw e;
            }
    }


    private LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
        try {
            return dateToConvert.toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDate();
        } catch (Exception e) {
            System.err.println("Exception in Class \"Student\", method \"convertToLocalDateViaInstant\"");
            e.printStackTrace();
            throw e;
        }
    }
    private LocalDateTime convertToLocalDateTimeViaInstant(Date dateToConvert) {
        try {
            return dateToConvert.toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDateTime();
        } catch (Exception e) {
            System.err.println("Exception in Class \"Student\", method \"convertToLocalDateTimeViaInstant\"");
            e.printStackTrace();
            throw e;
        }
    }

}
