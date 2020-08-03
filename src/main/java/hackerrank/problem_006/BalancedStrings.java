package hackerrank.problem_006;

import java.util.ArrayDeque;
import java.util.Stack;

public class BalancedStrings {

    // ( { } )

    // 1. We added (
    // 2. We added {
    // 3. If 3 char match oposite of previous -> remove both

    public static boolean isParenthesesStringBalanced(String input) {
        ArrayDeque<Character> deque = new ArrayDeque<>();
        for (Character ch : input.toCharArray()) {
            if (deque.isEmpty()) {
                deque.add(ch);
                continue;
            }

            // If lst inserted char is opposite of current ch then remote it
            // Do not insert ch because we already matched it's opposite
            // By doing this in loop we remove all chars, if any left it has no opposite pair
            if ((deque.peekLast() == '{' && ch == '}') ||
                (deque.peekLast() == '[' && ch == ']') ||
                (deque.peekLast() == '(' && ch == ')')) {
                deque.removeLast();
                continue;
            }

            deque.add(ch);
        }

        return deque.isEmpty();
    }
}
