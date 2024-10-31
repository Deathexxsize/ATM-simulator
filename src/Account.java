import java.util.Scanner;

public class Account {
    public static int account(int balance) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\n=========================");
        System.out.println("     Проверка счета    ");
        System.out.println("=========================");

        System.out.println("\n★  Ваш баланс счета " + balance + "с  ★");

        while (true) {
            System.out.print("\n0. Что-бы вернуться назад");

            System.out.print("\nВыбрать: ");
            byte comeBack = scanner.nextByte();

            if (comeBack == 0) {
                Menu.menu();
                break;
            } else {
                System.out.println("\n== Введите верное значение! ==");
            }
        }
        return balance;
    }
}
