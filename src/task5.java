import java.util.Locale;
import java.util.Scanner;

public class task5 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        scanner.useLocale(Locale.UK);
        double x = readDouble();
        double y = readDouble();
        String result = getResult(x, y);
        System.out.println(result);

    }

    public static double readDouble() {
        return scanner.nextDouble();
    }

    public static String getResult(double x, double y) {
        Double eps = 1e-5;
        if ((x*x+y*y<=1 && y>=x) || (x*x+y*y<=1 && x<=0)) {
            return "YES";
        }
        else {
            return "NO";
        }
    }
}
