import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);
        System.out.println("Wprowadz liczbe sekund");
        int sekundy = klaw.nextInt();
        if (sekundy >= 86400) {
            System.out.println(sekundy+" sekund to "+sekundy/86400+" dni");
        } else if (sekundy >= 3600) {
            System.out.println(sekundy+" sekund to "+sekundy/3600+" godzin");
        } else if (sekundy >= 60) {
            System.out.println(sekundy+" sekund to "+sekundy/60+" minut");
        }
    }
}
