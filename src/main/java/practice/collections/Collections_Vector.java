package practice.collections;

import java.util.Stack;

public class Collections_Vector {

    public static void test() {
        Stack<String> plates = new Stack<>();
        plates.add("Plate 1");
        plates.add("Plate 2");
        plates.add("Plate 3");
        System.out.println(plates);

        // LIFO (last in first out) - we put plat 3 at the top and if we call pop() plate 3 is first removed
        // Get and remove [Plate 3]
        plates.pop();
        System.out.println(plates);

        // Get
        plates.peek();
        System.out.println(plates);
    }
}