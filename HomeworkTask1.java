package app.globaleco.lesson4;

public class HomeworkTask1 {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 8, 9, 10};
        for (int i = 0; i < number.length; i++) {
            int a = i != 0 ? number[i] - number[i - 1] : 1;
            if (a != 1) System.out.println(number[i] - 1);
            if (i == 0 && number[i] != 1) {
                System.out.println(number[i] - 1);
            }
            if (i == number.length - 1 && number[i] != 10) {
                System.out.println(number[i] + 1);
            }
        }
    }
}
