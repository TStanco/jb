package Saper;

import java.util.Scanner;

//Napisz	program,	kt�ry	zasymuluje	dzia�anie	sapera.	Program	ma	za zadanie	pobra�
// od	u�ytkownika rozmiar	planszy	(n ? [3, 10],	m ? [3, 10])	oraz	prawdopodobie�stwo	w	procentach
// na	wyst�pienie bomby	pod	danym	polem	p ? [25, 75].	Nast�pnie	ma	utworzy�	dwuwymiarow�
// tablic�	booli,	w kt�rej	odpowiednio	zapisze,	czy	pod	danym	polem	kryje	si�	bomba,
// p�niej	powinien	wygenerowa� poprawne	rozwi�zanie	uk�adanki,	tzn. ile	bomb	wyst�pi�o
// obok	konkretnego	pola. Przyk�ad	dla	n = 5, m = 3, p = 35:
public class Saper {
    private static int szerokosc;
    private static int wysokosc;
    private static int prawdopodobienstwoWybuchu;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczb� wierszy z zakresu 3-10");
        wysokosc = scanner.nextInt();
        System.out.println("Podaj liczb� kolumn z zakresu 3-10");
        szerokosc = scanner.nextInt();
        System.out.println("Podaj prawdopodobie�stwo wybuchu z zakresu 25 - 75%");
        prawdopodobienstwoWybuchu = scanner.nextInt();
        scanner.close();
        int[][] poleArray = new int[wysokosc][szerokosc];
        System.out.println(poleArray.length);

        for (int i = 0; i < wysokosc; i++)
            poleArray = {};
            for (int j = 0; j < szerokosc; j++) {
               poleArray = {j};
            }
    }


}