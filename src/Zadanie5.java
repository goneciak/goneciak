import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);
        System.out.println("Podaj mase w kg");
        double masa = klaw.nextDouble();
        double ciezar = masa*9.8;
        if (ciezar > 1000) {
            System.out.println("Obiekt jest zbyt ciezki");
        } else if (ciezar < 10) {
            System.out.println("Obiekt jest za lekki");
        } else {
            System.out.println("Prawidlowa masa obiektu");
        }
    }
}
