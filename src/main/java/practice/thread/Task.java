package practice.thread;

import java.util.UUID;

public class Task {

    private final String id;
    private final String name;

    public Task(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public void doJob() {
        try {
            long start = System.currentTimeMillis();
            Thread.sleep(2000);
            System.out.println(toString(start, System.currentTimeMillis()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString(long start, long finish) {
        return "Task{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", start='" + start + '\'' +
                ", finish='" + finish + '\'' +
                ", thread='" + Thread.currentThread().getId() + '\'' +
                '}';
    }
}
