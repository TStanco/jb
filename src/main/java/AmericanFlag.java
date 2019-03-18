public class AmericanFlag {

    public static void main(String[] args) {
        System.out.println();
        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 6; j++) {
                System.out.print("* " + "\t");

            }
            for (int k = 0; k < 38; k++) {
                System.out.print("= ");
            }
            System.out.println("\n");
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 50; j++) {
                System.out.print("= ");
            }
            System.out.println("\n");
        }
    }
}
