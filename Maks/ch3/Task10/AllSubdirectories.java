package ch3.Task10;

import java.io.File;
import java.io.FileFilter;

public class AllSubdirectories {
    public static File[] allSubdirectories1(File directory){
        return directory.listFiles(file ->  file.isDirectory());
    }
    public static File[] allSubdirectories2(File directory){
        return directory.listFiles(File::isDirectory);
    }
    public static File[] allSubdirectories3(File directory){
        return directory.listFiles(new FileFilter(){
            public boolean accept(File file){
                return file.isDirectory();
            }
        });
    }
    public static void main(String[] args) {
        File directory = new File(System.getProperty("user.dir"));
        System.out.printf("All subdirectories of \"%s\":\n", directory);

        System.out.println("Using lambdas:");
        File[] subdirectories1 = allSubdirectories1(directory);
        for(File subdirectory : subdirectories1){
            System.out.println(subdirectory);
        }

        System.out.println("Using references:");
        File[] subdirectories2 = allSubdirectories2(directory);
        for(File subdirectory : subdirectories2){
            System.out.println(subdirectory);
        }

        System.out.println("Using anonymous class:");
        File[] subdirectories3 = allSubdirectories3(directory);
        for(File subdirectory : subdirectories3){
            System.out.println(subdirectory);
        }
    }
}
