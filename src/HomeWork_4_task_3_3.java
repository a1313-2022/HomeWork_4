package OOP;

import java.util.Scanner;

public class HomeWork_4_task_3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();
        int E = input.nextInt();
        int F = input.nextInt();

        System.out.println(" Ваши значения: " +"\nA: "+A +"\nB: "+B +"\nC: "+C +"\nD: "+D +"\nE: "+E +"\nF: "+F);

        if (A*D - B*C == 0) {
            System.out.println("Уравнение не имеет решения!");
        }
    }
}
