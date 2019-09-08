package com.zubarevam.invoker;

import com.zubarevam.command.Task;

interface ITaskQueue {
    void AddTask(Task task);
    void ExecuteTasks();
}
