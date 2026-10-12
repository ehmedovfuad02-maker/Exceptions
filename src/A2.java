 import java.util.InputMismatchException;
import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        String[] names = {"Fuad", "Mehemmed", "Nuray"};
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print(" (0, 1 və ya 2): ");
                int index = scanner.nextInt();

                String element = names[index];
                System.out.println("Daxil edilən indeksdəki element: " + element);

                break;

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Xəta: Yanlış indeks!");
            } catch (InputMismatchException e) {
                System.out.println("Xəta:  tam ədəd daxil edin!");
                scanner.next();
            }
            System.out.println();
        }
        scanner.close();
    }
}

