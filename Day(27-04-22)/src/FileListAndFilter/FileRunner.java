package FileListAndFilter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class FileRunner {
    public static void main(String[] args) throws IOException {

        Path directory = Paths.get(".");

        //Shows all the folders and files in the directory using File.list
        System.out.println("File.list: ");
        Files.list(directory)
                .forEach(System.out::println);

        System.out.println();

        System.out.println("File.walk: ");
        Files.walk(directory, 4)
                .forEach(System.out::println);

        System.out.println();

        System.out.println("File.walk which contains only java name: ");
        Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
        Files.walk(directory)
                .filter(predicate)
                .forEach(System.out::println);

        System.out.println();

        System.out.println("File.find to find only .java with BiPredicate: ");
        BiPredicate<Path, BasicFileAttributes> matcher
                =((path, attributes) -> String.valueOf(path).contains(".java"));
        Files.find(directory, 4, matcher)
                .forEach(System.out::println);


//        BiPredicate<Path, BasicFileAttributes> directoryMatcher
//                = ((path, attributes) -> attributes.isDirectory());
//        Files.find(directory, 4, directoryMatcher)
//                .forEach(System.out::println);
    }
}
