
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class CountWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1. Enter text");
        System.out.println("2. Provide a file");
        int option = scanner.nextInt();
        scanner.nextLine(); 
        String inputText = "";
        if (option == 1) {
            System.out.print("Enter a text: ");
            inputText = scanner.nextLine();
            String[] words = inputText.split("[\\s\\p{Punct}]+");
            int wordCount = words.length;
            System.out.println("Input text: " + inputText);
            System.out.println("Number of words: " + wordCount);
        } else if (option == 2) {
            ReadFileWords("C:\\Users\\OshiD\\OneDrive\\Desktop\\Read.txt"); 
         } else {
            System.out.println("Invalid option.");
            return;
        }

        scanner.close();
    }
    public static void ReadFileWords(String fileName) {
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            int wordCount = 0;
            while (scanner.hasNext()) {
                String word = scanner.next();
                wordCount++;
                System.out.println(word); 
            }
            System.out.println("Number of words in the file: " + wordCount);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}