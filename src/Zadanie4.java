import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);
        System.out.println("Podaj pierwszy wynik z testu");
        int wynik1 = klaw.nextInt();
        System.out.println("Podaj drugi wynik z testu");
        int wynik2 = klaw.nextInt();
        System.out.println("Podaj trzeci wynik z testu");
        int wynik3 = klaw.nextInt();
        double srednia = (wynik1+wynik2+wynik3)/3;

        System.out.println("Srednia = "+srednia);
        if (srednia >= 90) {
            System.out.println("Ocena 5");
        } else if (srednia < 90 && srednia >= 80) {
            System.out.println("Ocena 4");
        } else if (srednia < 80 && srednia >= 70) {
            System.out.println("Ocena 3");
        } else if (srednia < 70 && srednia >= 60) {
            System.out.println("Ocena 2");
        } else if (srednia < 60) {
            System.out.println("Ocena 1");
        }
    }
}
