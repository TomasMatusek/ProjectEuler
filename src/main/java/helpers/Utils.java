package helpers;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Utils {

    public long[] getTestingDataFromFile(String filename) {
        URL fileURL = Utils.class.getClassLoader().getResource(filename);
        if (fileURL == null) {
            return new long[] {};
        }

        String filePath = fileURL.getPath();
        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8)) {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String content = contentBuilder.toString();

        List<Long> values = Arrays.stream(content.split(" "))
                .map(String::trim)
                .mapToLong(Long::new)
                .boxed()
                .collect(Collectors.toList());


        return values.stream().mapToLong(l -> l).toArray();
    }

    public int[] getTestingDataFromFile2(String filename) {
        URL fileURL = Utils.class.getClassLoader().getResource(filename);
        if (fileURL == null) {
            return new int[] {};
        }

        String filePath = fileURL.getPath();
        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8)) {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String content = contentBuilder.toString();

        List<Integer> values = Arrays.stream(content.split(" "))
                .map(String::trim)
                .mapToInt(Integer::new)
                .boxed()
                .collect(Collectors.toList());


        return values.stream().mapToInt(Math::toIntExact).toArray();
    }


}
