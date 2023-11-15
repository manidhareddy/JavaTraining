import java.io.*;
import java.util.*;

public class FileOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		createFile(scanner);
		writeFile(Scanner);

	}

    private static void createFile(Scanner scanner) {
        System.out.println("Enter the file name to create:");
        String fileName = scanner.nextLine();

        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error creating the file: " + e.getMessage());
        }
    }

    private static void writeFile(Scanner scanner) {
        System.out.println("Enter the file name to write:");
        String fileName = scanner.nextLine();

        try (FileWriter fileWriter = new FileWriter(fileName);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            System.out.println("Enter text to the file:");
            String line;
            while (!(line = scanner.nextLine()).isEmpty()) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            System.out.println("Text written to the file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }

    private static void readFile(Scanner scanner) {
        System.out.println("Enter the file name to read:");
        String fileName = scanner.nextLine();

        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    private static void deleteFile(Scanner scanner) {
        System.out.println("Enter the file name to delete:");
        String fileName = scanner.nextLine();

        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Error deleting the file. File may not exist.");
        }
    }
}
