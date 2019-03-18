import java.util.Scanner;

public class RegularHexagon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj d³ugoœæ boku szeœciok¹ta foremnego:");
        double baseLength = scanner.nextDouble();
        scanner.close();
        double height = Math.sqrt((baseLength * baseLength) - ((baseLength / 2) * (baseLength / 2)));
        System.out.printf("Wysokoœæ: %.2f",height);
        countHexagonSurface(baseLength, height);
        countAmbit(baseLength);
        countDiagonals(baseLength, height);
        countSurfaceOfInscribedCircle(height);
    }

    private static void countSurfaceOfInscribedCircle(double height) {
        double inscribedCircleSurface = Math.PI*height*height;
        System.out.printf("\t Powierzchnia okrêgu wpisanego: %.2f",inscribedCircleSurface);
    }

    private static void countDiagonals(double aLength, double height) {
        double shortDiagonal = height*2;
        double longDiagonal = aLength*2;
        System.out.printf("\t Krótsza przek¹tna: %.2f a d³u¿sza: %.2f",shortDiagonal ,longDiagonal);
    }

    private static void countAmbit(double aLength) {
        double ambit = aLength*6;
        System.out.printf("\t Obwód wynosi: %.2f", ambit);
    }

    private static double countHexagonSurface(double aLength, double height) {
        double hexagonSurface = 6 * (((aLength / 2) * height));
        System.out.printf("\t Powierzchnia: %.2f", hexagonSurface);
//        return hexagonSurface;
        return hexagonSurface;
    }

}
