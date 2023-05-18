package ch3.Task11;

import java.io.File;
import java.nio.file.Paths;
import java.util.Scanner;

public class AllExtensions {
    public static String[] allExtensions(File directory, String extension){
        return directory.list((dir, name) -> new File(dir, name).isFile() && name.endsWith(extension));
    }
    public static void main(String[] args) {
        String extension;
        try(Scanner scanner = new Scanner(System.in)) {
            extension = scanner.nextLine();
        }

//        File directory = new File(System.getProperty("user.dir"));
        File directory = Paths.get("").toAbsolutePath().toFile();
        System.out.printf("All files with extension %s in \"%s\" directory:\n", extension, directory.toPath().toAbsolutePath());

        String[] filenames = allExtensions(directory, extension);
        if(filenames != null) for(String filename : filenames){
            System.out.println(filename);
        }
        else System.out.println("no files found");
    }
}
