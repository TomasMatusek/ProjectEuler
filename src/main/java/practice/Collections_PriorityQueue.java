package practice;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.UUID;

public class Collections_PriorityQueue {

    public static void main() {

        // For priority queue object must implement comparable so queue can order objects
        Queue<Task> tasks = new PriorityQueue<>();
        tasks.add(new Task("File processing", 1));
        tasks.add(new Task("Pictures processing", 2));
        tasks.add(new Task("PDF processing", 3));
        tasks.add(new Task("XLSX processing", 4));
        tasks.add(new Task("DB processing", 1));

        /**
         * A PriorityQueue is what is called a binary heap. It is only ordered/sorted in the sense that the first element is the least. In other word, it only cares about what is in the front of the queue, the rest are "ordered" when needed.
         * The elements are only ordered as they are dequeued, i.e. removed from the queue using poll(). This is the reason why a PriorityQueue manages to have such good performance, as it is not doing any more sorting than it needs at any time.
         */

        while (tasks.size() > 0) {
            Task task = tasks.poll();
            task.process();
            System.out.println(String.format("Remaining tasks: %s", tasks.size()));
        }

    }
}

class Task implements Comparable<Task> {

    private final String id;
    private final String name;
    private final int priority;

    public Task(String name, int priority) {
        this.id = UUID.randomUUID().toString();
        this.priority = priority;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public void process() {
        System.out.println(String.format("Processing task: %s, id: %s, priority: %s", getName(), getId(), getPriority()));
        System.out.println("");
    }

    @Override
    public int compareTo(Task o) {
        return getPriority() - o.getPriority();
    }

    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }
}