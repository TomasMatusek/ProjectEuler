package practice.function;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionMain {

    public static void main(String... args) {
        int companyId = 10;
        int cellId = getCellIdByCompany(companyId);
        getEula(cellId, (cellIdParam) -> {
            return cellIdParam == 1;
        });

        getEula(cellId, (cellIdParam) -> {
            return cellIdParam == 2;
        });
    }

    static Result getEula(int cellId, Predicate<Integer> isLocalCell) {
        if (isLocalCell.test(cellId)) {
            return new Result(true, "local data");
        }
        return new Result(true, "remote data");
    }

    static int getCellIdByCompany(int companyId) {
        return 1;
    }


    static class Result {

        private final String data;
        private final boolean success;

        public Result(boolean success, String data) {
            this.success = success;
            this.data = data;
        }

        public boolean isSuccess() {
            return success;
        }

        public String getData() {
            return data;
        }
    }
}