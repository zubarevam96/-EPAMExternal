package com.zubarevam.invoker;

import com.zubarevam.command.Task;
import com.zubarevam.receiver.Animal;

import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements ITaskQueue {
    private List<Task> taskList = new ArrayList<>();
    public void AddTask(Task task) {
        taskList.add(task);
    }
    public void ExecuteTasks() {
        while (!taskList.isEmpty()) {
            Animal<? extends Comparable> animal;
            animal = taskList.get(0).execute();
            // далее следует наверняка лютый говнокод,
            // просьба написать как следует оформлять это правильно
            //region shityCode
            String partNot = "";
            String partYet = " now!";
            if (!animal.isHappy()) {
                partNot = " not ";
                partYet = " yet";
            }
            //endregion
            System.out.format("The animal named %s is %s happy %s\n", animal.getName(), partNot, partYet);
            taskList.remove(0);
        }
    }
}
