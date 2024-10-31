import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║                                        ║");
        System.out.println("║           ★  ATM of NurBank  ★        ║");
        System.out.println("║                                        ║");
        System.out.println("╚════════════════════════════════════════╝");

        signIn();
    }

    public static void signIn() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("\n\n=========================");
        System.out.println("    Проверка PIN кода    ");
        System.out.println("=========================");

        int cardNum = 6969; // пин код юзера
        byte numAttempts = 3; // счетчик попыток

        while (true) {
            System.out.print("\nВведите PIN код: ");
            short inputCardNum = scanner.nextShort();

            if (cardNum == inputCardNum) {
                Menu.menu();
                break;
            } else {
                numAttempts--;
                System.out.println("\nНе верный PIN код или карта заблокировано! \nу вас осталось " + numAttempts + " попытки");
                if (numAttempts == 0) {
                    System.out.println("\n== Ваша карта заблокировано! ==");
                    break;
                }
            }
        }
    }
}