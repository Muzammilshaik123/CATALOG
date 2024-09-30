import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.json.JSONObject;

public class SecretSharing {
    public static void main(String[] args) {
        try {
            // Read Test Case 1 (Renamed to testcase1.json)
            File file1 = new File("data/testcase1.json");
            Scanner scanner1 = new Scanner(file1);
            StringBuilder jsonStr1 = new StringBuilder();
            
            while (scanner1.hasNextLine()) {
                jsonStr1.append(scanner1.nextLine());
            }
            scanner1.close();

            // Parse JSON for Test Case 1
            JSONObject jsonObject1 = new JSONObject(jsonStr1.toString());
            System.out.println("Test Case 1 JSON: " + jsonObject1.toString(2));  // Pretty print JSON for debugging

            // Read Test Case 2 (Renamed to testcase2.json)
            File file2 = new File("data/testcase2.json");
            Scanner scanner2 = new Scanner(file2);
            StringBuilder jsonStr2 = new StringBuilder();
            
            while (scanner2.hasNextLine()) {
                jsonStr2.append(scanner2.nextLine());
            }
            scanner2.close();

            // Parse JSON for Test Case 2
            JSONObject jsonObject2 = new JSONObject(jsonStr2.toString());
            System.out.println("Test Case 2 JSON: " + jsonObject2.toString(2));  // Pretty print JSON for debugging

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please check the file path.");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
