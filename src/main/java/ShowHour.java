
//Napisz	program,	kt�ry	pobierze	od	u�ytkownika	liczb�	 sekund,
// a	nast�pnie	wy�wietli	godzin�	w formacie	HH:MM:SS
// np.	dla	86399 poprawnym	wynikiem	jest	23:59:59.

public class ShowHour {

    public static void main(String[] args) {
        int numberOfSeconds = 54399;
        int numberOfHours = numberOfSeconds /3600 ;
        int numberOfMinutesInLastHour = (numberOfSeconds%3600)/60;
        int numberOfSecondsInLastHour = ((numberOfSeconds %3600)%60)%60;

        System.out.println(numberOfHours +":"+numberOfMinutesInLastHour+":"+numberOfSecondsInLastHour);
    }
}
