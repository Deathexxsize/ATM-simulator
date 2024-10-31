import java.util.Scanner;

public class ChangePin {
    public static int changePin(int cardNum) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\n=========================");
        System.out.println("      Изменение PIN кода   ");
        System.out.println("=========================");

        while (true) {
            System.out.print("\n0. Что-бы вернуться назад \n\n1. Изменить PIN код");

            System.out.print("\nВыбрать: ");
            byte comeBack = scanner.nextByte();

            if (comeBack == 0) {
                Menu.menu();
                break;
            } else if(comeBack == 1) {
                while (true) {
                    System.out.print("\nВведите новый PIN код: ");
                    int inputNewPin = scanner.nextInt();

                    if (inputNewPin < 999 || inputNewPin > 9999) {
                        System.out.println("\n== Ошибка! Введите 4-х значный PIN код ==");
                    }else {
                        cardNum = inputNewPin;
                        System.out.println("\n★  Ваш новый PIN код " + inputNewPin + "  ★");
                        return cardNum;
                    }
                }
            } else {
                System.out.println("\n== Введите верное значение! ==");
            }
        }
        return cardNum;
    }
}
