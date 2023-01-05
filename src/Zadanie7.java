import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);
        System.out.println("Podaj pierwsze imie");
        String imie1 = klaw.nextLine();
        System.out.println("Podaj drugie imie");
        String imie2 = klaw.nextLine();
        System.out.println("Podaj trzecie imie");
        String imie3 = klaw.nextLine();
        String[] imie = {imie1, imie2, imie3};
        java.util.Arrays.sort(imie);
        for (String  : imie) {
            System.out.println(imie);
        }
    }
}
