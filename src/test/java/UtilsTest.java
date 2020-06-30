import helpers.Utils;
import org.junit.jupiter.api.Test;

import java.util.List;

public class UtilsTest {

    @Test
    public void When_FileProvided_Then_ListOfNumbersReturned() {
        long[] list = new Utils().getTestingDataFromFile("hackerrank.problem_003.txt");
    }
}
