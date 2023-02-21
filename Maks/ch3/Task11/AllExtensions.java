package ch3.Task11;

import java.io.File;
import java.util.Scanner;

public class AllExtensions {
    public static String[] allExtensions(File directory, String extension){
        return directory.list((dir, name) -> new File(dir, name).isFile() && name.endsWith(extension));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String extension = scanner.nextLine();

//        File directory = new File(System.getProperty("user.dir"));
        File directory = new File("C:/Users/zavgm/Desktop/");
        System.out.printf("All files with extension %s in \"%s\" directory:\n", extension, directory);

        String[] filenames = allExtensions(directory, extension);
        for(String filename : filenames){
            System.out.println(filename);
        }
    }
}
