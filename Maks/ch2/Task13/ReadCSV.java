package ch2.Task13;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.FileReader;

public class ReadCSV {
    public static void main(String[] args) throws Exception{
        String filename = "ch2/Task13/addresses.csv";
        CSVReader reader = new CSVReaderBuilder(new FileReader(filename)).build();
        String [] nextLine;
        while((nextLine = reader.readNext()) != null){
            System.out.printf("Name:%s, Address: %s, Email: %s", nextLine[0],  nextLine[1], nextLine[2]);
        }
    }
}
