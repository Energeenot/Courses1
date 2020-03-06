import java.util.Locale;
import java.util.Scanner;

public class data_input {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        scanner.useLocale(Locale.UK);
        double x = readDouble();
        double y = readDouble();
    }

    public static double readDouble() {
        return scanner.nextDouble();
    }
}
