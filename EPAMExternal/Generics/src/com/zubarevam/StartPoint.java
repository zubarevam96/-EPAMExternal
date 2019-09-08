package com.zubarevam;

import com.zubarevam.command.Feed;
import com.zubarevam.command.Play;
import com.zubarevam.command.Wash;
import com.zubarevam.invoker.TaskQueue;
import com.zubarevam.receiver.Animal;

public class StartPoint {

    public static void main(String[] args) {
	StartPoint startPoint = new StartPoint();
	startPoint.testCommandExecutor();
    }

    public void testCommandExecutor() {
        Animal<String> dog = new Animal<>("TheDog", "Doggy", 2);
        Feed feedDog = new Feed(dog);
        Wash washDog = new Wash(dog);
        Play playWithDog = new Play(dog);
        TaskQueue dogTaskQueue = new TaskQueue();
        dogTaskQueue.AddTask(feedDog);
        dogTaskQueue.AddTask(washDog);
        dogTaskQueue.AddTask(washDog);
        dogTaskQueue.AddTask(playWithDog);
        dogTaskQueue.ExecuteTasks();

        Animal<Integer> cat = new Animal<>(1, "Kitty", 1);
        Feed feedCat = new Feed(cat);
        Wash washCat = new Wash(cat);
        Play playWithCat = new Play(cat);
        TaskQueue catTaskQueue = new TaskQueue();
        catTaskQueue.AddTask(feedCat);
        catTaskQueue.AddTask(washCat);
        catTaskQueue.AddTask(playWithCat);
        catTaskQueue.ExecuteTasks();
    }
}
