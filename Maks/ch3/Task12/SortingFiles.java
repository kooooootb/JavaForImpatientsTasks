package ch3.Task12;

import java.io.File;
import java.util.Arrays;

public class SortingFiles {
    public static void sort(File[] files){
        Arrays.sort(files, (first, second) -> {
            boolean isFile1 = first.isFile();
            boolean isFile2 = second.isFile();
            if(isFile1 != isFile2){
                if(isFile2){
                    return -1;
                } else{
                    return 1;
                }
            }

            return first.compareTo(second);
        });
    }
    public static void main(String[] args) {
        File[] files = new File(System.getProperty("user.dir")).listFiles();
        if(files == null){
            return;
        }

        System.out.println("Before");
        for(File file : files){
            System.out.println(file);
        }

        sort(files);

        System.out.println("After:");
        for(File file : files){
            System.out.println(file);
        }
    }
}
