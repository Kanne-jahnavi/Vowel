import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int vowelCount = countVowels(str);

        System.out.println("Number of vowels: " + vowelCount);

        scanner.close();
    }
