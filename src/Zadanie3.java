import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);
        System.out.println("Podaj swoja wage w kg");
        double waga = klaw.nextDouble();
        System.out.println("Podaj swoj wzrost w cm");
        double wzrost = klaw.nextDouble()/100;
        double bmi = waga/Math.pow(wzrost, 2);
        if (bmi>25) {
            System.out.println("bmi = "+bmi+" masz nadwage");
        } else if (bmi>=18.5 && bmi<=25) {
            System.out.println("bmi = "+bmi+" masz prawidlowa mase ciala");
        } else if (bmi <18.5) {
            System.out.println("bmi = "+bmi+" masz niedowage");
        }
    }
}
