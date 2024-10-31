import java.util.Scanner;

public class Refill {
    public static int refill(int balance) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\n=========================");
        System.out.println("       Пополнение счета    ");
        System.out.println("=========================");

        while (true) {
            System.out.print("\n0. Что-бы вернуться назад \n\n1. Пополнить счет");

            System.out.print("\nВыбрать: ");
            byte comeBack = scanner.nextByte();

            if (comeBack == 0) {
                Menu.menu();
                break;
            } else if(comeBack == 1) {
                while (true) {
                    System.out.print("\nВведите сумму для пополнение: ");
                    int inputRefill = scanner.nextInt();

                    if (inputRefill < 100) {
                        System.out.println("\n== Сумма минимального пополнения 100с ==");
                    } else {
                        balance += inputRefill;
                        System.out.println("\n★  Ваш баланс пополнен на " + inputRefill + "с  ★");
                        return balance;
                    }
                }
            } else {
                System.out.println("\n== Введите верное значение! ==");
            }
        }
        return balance;
    }
}
