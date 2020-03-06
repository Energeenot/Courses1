import java.util.Locale;
import java.util.Scanner;

public class main {
        public static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            scanner.useLocale(Locale.UK);
            int x = readint();
            String result = getResult(x);
            System.out.println(result);
            String str = Integer.toString(x);

        }

        public static int readint() {
            return scanner.nextInt();
        }

        public static String getResult(int x) {
            if (x==1) {
                return "1 bochka";
            }
            if (x>=2 || x<5){
                return (" bochki");
            }
            else {
                return (String)x;
            }
        }
    }
