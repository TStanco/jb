
//Napisz	program,	który	dla	liczb	z	zakresu	 [1	…	100]	wypisze:
// liczby	podzielne	przez	3,	podzielne przez	5,	podzielne	przez	3	i	5
// (za	ka¿dym	razem	wyliczaj	od	nowa).

public class DivByThree {
    public static void main(String[] args) {

        System.out.println("Liczby podzielne przez 3:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i +",\t");
            }
        }
        System.out.println("\nLiczby podzielne przez 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i +",\t");
            }
        }
        System.out.println("\nLiczby podzielne przez 3 i 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 ==0 & i%5  == 0) {
                System.out.print(i +",\t");
            }
        }
    }
}
