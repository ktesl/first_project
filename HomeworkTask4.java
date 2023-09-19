package app.globaleco.lesson4;

import java.util.Scanner;

public class HomeworkTask4 {
    public static void main(String[] args) {
        String password = "test123";
        String psw = "";
        Scanner scan = new Scanner(System.in);
    while (!psw.equals(password)){
        System.out.println("Enter the password: ");
            psw = scan.nextLine();
    }
    }
}
