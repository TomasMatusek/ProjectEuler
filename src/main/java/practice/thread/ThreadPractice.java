package practice.thread;

import sun.nio.ch.ThreadPool;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPractice {
    public static void main(String[] args) throws InterruptedException {
        Task task1 = new Task("File processing");
        Task task2 = new Task("Dtabase update");
        Task task3 = new Task("Sending emails");
        List<Task> tasks = Arrays.asList(task1, task2, task3);

        // Concurrent execution
        tasks.forEach((task) -> CompletableFuture.runAsync(task::doJob));

        // Sequential execution
        tasks.forEach(Task::doJob);

        Thread.sleep(60000);
    }
}