package hackerrank.problem_004;

import com.sun.tools.javac.util.Pair;

public class Kangaroo {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        for (int j = 2; j <= 10000; j++) {
            x1 = x1 + v1;
            x2 = x2 + v2;
            if (x1 == x2)
                return "YES";
        }
        return "NO";
    }
}