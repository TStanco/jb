public class ConcatInt {

//    Napisz	 program,	który	 dla	 podanego	x wyliczy wartoœæ	wyra¿enia:
//    x + xx + xxx np.	 dla
//    x = 5 poprawnym	wynikiem	jest	5 + 55 + 555 = 615,
//    a x = 15:	15 + 1515 + 151515 = 153 045.

    public static void main(String[] args) {
        int n = 15;
        System.out.println("Pierwsza liczba: " + n + ", druga liczba: " + n + n + ", trzecia liczba: " + n + n + n);

        String number = Integer.toString(n);
        int result1 = Integer.parseInt(number);
        int result2 = Integer.parseInt(number + number);
        int result3 = Integer.parseInt(number + number + number);
        System.out.println("Suma: " + (result1 + result2 + result3));
    }
}