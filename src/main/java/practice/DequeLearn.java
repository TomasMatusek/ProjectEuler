package practice;

import java.util.ArrayDeque;

public class DequeLearn {

    public static void learn() {

        ArrayDeque<String> s = new ArrayDeque<>();
        s.push("a");
        s.push("b");
        s.push("c");
        // New elements are pushed at the top [c, b, a]

        System.out.println(s);
        System.out.println(String.format("s.getFirst(): %s", s.getFirst()));
        System.out.println(String.format("s.getLast(): %s", s.getLast()));
        System.out.println(String.format("s.peek(): %s", s.peek()));

        // Throws exception, all add* methods throw exception
        s.add("tail");
        System.out.println(String.format("s.add('tail'): %s", s));

        // All offer* methods do same but does not throw exception
        s.offerLast("tail2");
        System.out.println(String.format("s.offerLast('tail2'): %s", s));

        // All poll* methods gets value and remove it
        String value = s.pollLast();
        System.out.println(String.format("s.pollLast(): %s, value: %s", s, value));
    }
}
