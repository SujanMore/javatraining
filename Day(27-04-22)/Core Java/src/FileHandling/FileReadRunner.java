package FileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadRunner {
    public static void main(String[] args) throws IOException {

        Path fileToRead = Paths.get("C:\\Users\\LENOVO\\IdeaProjects\\javatraining\\Day(27-04-22)\\src\\FileHandling\\Resources\\data.txt");

//        List<String> lines = Files.readAllLines(fileToRead);
//        System.out.println(lines);

        Files.lines(fileToRead)
                .forEach(System.out::println);

        System.out.println();

        System.out.println("Find words that starts with 's' : ");
        Files.lines(fileToRead)
                .map(String:: toLowerCase)
                .filter(str -> str.startsWith("s"))
                .forEach(System.out::println);
    }
}
