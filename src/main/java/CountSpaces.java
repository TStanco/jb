import java.util.Scanner;

public class CountSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst:");
        String s = scanner.nextLine();
        scanner.close();
        int numberOfSpaces = 0;
        for (int i = 0; i<s.length(); i++) {
            if (Character.isWhitespace(s.charAt(i))) {
                numberOfSpaces++;
            }
        }
        if (numberOfSpaces == 1){
            System.out.println("Mamy tu jedna spacje.");
        }else if (numberOfSpaces>1&numberOfSpaces<5){
            System.out.println("W tym tekscie sa "+ numberOfSpaces + " spacje.");
        }else {
            System.out.println("W tym tekscie jest " + numberOfSpaces + " spacji.");
        }
    }
}