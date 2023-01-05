import java.util.Scanner;
public class Zadanie2 {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);
        System.out.println("Podaj dzien");
        int dzien = klaw.nextInt();
        System.out.println("Podaj miesiac");
        int miesiac = klaw.nextInt();
        System.out.println("Podaj ostatnie 2 cyfry roku");
        int rok = klaw.nextInt();
        if (dzien*miesiac == rok) {
            System.out.println("Podana data jest magiczna");
        } else if (dzien*miesiac != rok) {
            System.out.println("Podana data nie jest magiczna");
        }
    }
}
