package Saper;

import java.util.Scanner;

//Napisz	program,	który	zasymuluje	dzia³anie	sapera.	Program	ma	za zadanie	pobraæ
// od	u¿ytkownika rozmiar	planszy	(n ? [3, 10],	m ? [3, 10])	oraz	prawdopodobieñstwo	w	procentach
// na	wyst¹pienie bomby	pod	danym	polem	p ? [25, 75].	Nastêpnie	ma	utworzyæ	dwuwymiarow¹
// tablicê	booli,	w której	odpowiednio	zapisze,	czy	pod	danym	polem	kryje	siê	bomba,
// póŸniej	powinien	wygenerowaæ poprawne	rozwi¹zanie	uk³adanki,	tzn. ile	bomb	wyst¹pi³o
// obok	konkretnego	pola. Przyk³ad	dla	n = 5, m = 3, p = 35:
public class Saper {
    private static int szerokosc;
    private static int wysokosc;
    private static int prawdopodobienstwoWybuchu;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbê wierszy z zakresu 3-10");
        wysokosc = scanner.nextInt();
        System.out.println("Podaj liczbê kolumn z zakresu 3-10");
        szerokosc = scanner.nextInt();
        System.out.println("Podaj prawdopodobieñstwo wybuchu z zakresu 25 - 75%");
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