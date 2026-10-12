import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionA1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Birinci ədədi daxil edin (bölünən): ");
                int a = scanner.nextInt();

                System.out.print("İkinci ədədi daxil edin (bölən): ");
                int b = scanner.nextInt();

                int netice = a / b;
                System.out.println("Nəticə: " + a + " / " + b + " = " + netice);

                break;

            } catch (InputMismatchException e) {
                System.out.println("Xəta: Zəhmət olmasa yalnız tam ədəd daxil edin!");
                scanner.next();
            } catch (ArithmeticException e) {
                System.out.println("Xəta: Ədədi sıfıra bölmək olmaz! Yenidən cəhd edin.");
            }
            System.out.println();
        }
        scanner.close();
    }
}

