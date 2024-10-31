import java.util.Scanner;

public class Withdraw {
    public static int withdraw(int balance) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\n=========================");
        System.out.println("         Снятие денег      ");
        System.out.println("=========================");

        while (true) {
            System.out.print("\n0. Что-бы вернуться назад \n\n1. Снять деньги");

            System.out.print("\nВыбрать: ");
            byte comeBack = scanner.nextByte();

            if (comeBack == 0) {
                Menu.menu();
                break;
            } else if(comeBack == 1) {
                while (true) {
                    System.out.print("\nВведите сумму для снятие: ");
                    int withdraw = scanner.nextInt();

                    if (withdraw > balance) {
                        System.out.println("\n== Не достаточно средст на счету ==");
                    } else {
                        balance -= withdraw;
                        System.out.println("\n★  С вашего счета была снята " + withdraw + "с  ★");
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
