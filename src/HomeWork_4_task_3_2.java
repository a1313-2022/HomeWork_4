package OOP;

import java.util.Scanner;

public class HomeWork_4_task_3_2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int randomNumber1 = (int) (Math.random() * 100 +1);
        int randomNumber2 = (int) (Math.random() * 100 +1);
        int randomNumber3 = (int) (Math.random() * 100 +1);

        System.out.println("Система загадала 3 целочисленных числа - " +randomNumber1+" " +randomNumber2+" " +randomNumber3+
                           "\nвведите сумму этих трёх значений: ");
        int value = input.nextInt();
        System.out.println("Проверка на истинность суммы 3 значений = " + (randomNumber1 +randomNumber2 +randomNumber3 == value));

    }
}
