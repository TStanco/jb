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
            System.out.println("Mamy tu jedn¹ spacjê.");
        }else if (numberOfSpaces>1&numberOfSpaces<5){
            System.out.println("W tym tekœcie s¹ "+ numberOfSpaces + " spacje.");
        }else {
            System.out.println("W tym tekœcie jest " + numberOfSpaces + " spacji.");
        }
    }
}