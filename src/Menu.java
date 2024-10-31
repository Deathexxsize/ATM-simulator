import java.util.Scanner;

public class Menu {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\n=========================");
        System.out.println("       Главное меню      ");
        System.out.println("=========================");

        int balance = 0; // Баланс


        while (true) {
            System.out.print("\n0. Что-бы вернуться назад \n\n1. Проверка счета \n2. Внесение денег \n3. Снятие денег \n4. Изменить PIN код");

            System.out.print("\nВыбрать: ");
            byte comeBack = scanner.nextByte();

            if (comeBack == 0) {
                Main.signIn();
                break;
            } else if (comeBack == 1) {
                Account.account(balance);
                break;
            } else if (comeBack == 2) {
                balance = Refill.refill(balance);
                break;
            } else if (comeBack == 3) {
                break;
            } else if (comeBack == 4) {
                break;
            } else {
                System.out.println("\n★  Введите верное значение!  ★");
            }
        }

    }

}
