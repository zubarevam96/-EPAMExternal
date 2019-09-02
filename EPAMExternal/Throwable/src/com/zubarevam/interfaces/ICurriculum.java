package com.zubarevam.interfaces;

import com.zubarevam.classes.Course;

public interface ICurriculum {
    String getName();
    Course[] getCourses();
    int getHours(); // возвращает сумму часов, которая будет затрачена на все курсы
}
