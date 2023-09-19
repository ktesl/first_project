package app.globaleco.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkTask3 {
    public static void main(String[] args) {
        double sum = 0;
        double a;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Enter the value:");
            a = scan.nextDouble();
            sum += a;
        } while (a != 0);
        System.out.println("Sum = " + sum);
    }
}
