package Lab2.Task13;

import java.io.FileReader;
import java.util.Map;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVReaderHeaderAware;

public class Task13 {
    public static void main(String[] args) throws Exception {

        Map<String, String> values = new CSVReaderHeaderAware(new FileReader("Employee.csv")).readMap();

    }
}
