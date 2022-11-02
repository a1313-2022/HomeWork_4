package OOP;

import java.util.Scanner;

public class HomeWork_4_task_3_5 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Воскресенье = 0\nПонедельник = 1\nСуббота = 6");

        System.out.println("Введите сегодняшний день недели: ");
        int toDay = input.nextInt();

        System.out.println("Введите кол-во дней спустя: ");
        int latterDay = input.nextInt();
        int totalDay = (toDay + latterDay) % 7;

        System.out.println("\nСегодняшний день недели: ");
        switch (toDay) {
            case 0:
                System.out.println("Воскресенье");
                break;
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
        }

        System.out.println("\nЧерез " +latterDay+ " дня будет ");
        switch (totalDay) {
            case 0:
                System.out.println("Воскресенье");
                break;
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
        }

    }
}
