package FileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {
    public static void main(String[] args) throws IOException {

        Path fileToWrite = Paths.get("C:\\Users\\LENOVO\\IdeaProjects\\javatraining\\Day(27-04-22)\\src\\FileHandling\\Resources\\data-write.txt");

        List<String> list =
                List.of("Sujan", "Vinit", "Kavita", "Sandeep");

        Files.write(fileToWrite, list);
    }
}
