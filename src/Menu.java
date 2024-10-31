import java.util.Scanner;

public class Menu {

    public static int cardNum = 6969; // пин код юзера
    public static int balance = 0; // Баланс

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n\n=========================");
            System.out.println("       Главное меню      ");
            System.out.println("=========================");

            System.out.print("\n0. Что-бы вернуться назад \n\n1. Проверка счета \n2. Пополнение счета \n3. Снятие денег \n4. Изменить PIN код");

            System.out.print("\nВыбрать: ");
            byte comeBack = scanner.nextByte();

            if (comeBack == 0) {
                Main.signIn();
            } else if (comeBack == 1) {
                Account.account(balance);
            } else if (comeBack == 2) {
                balance = Refill.refill(balance);
            } else if (comeBack == 3) {
                balance = Withdraw.withdraw(balance);
            } else if (comeBack == 4) {
                cardNum = ChangePin.changePin(cardNum);
            } else {
                System.out.println("\n★  Введите верное значение!  ★");
            }
        }
    }
}
