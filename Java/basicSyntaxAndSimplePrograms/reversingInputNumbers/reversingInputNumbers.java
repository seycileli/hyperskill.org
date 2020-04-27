package basicSyntaxAndSimplePrograms;

import java.util.Scanner;

public class reversingInputNumbers {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        solution();
        solutionTwo();

    }

    public static void solution() {

        int x = sc.nextInt();
        System.out.println(x % 10 * 100 + x % 100 / 10 * 10 + x / 100);

    }

    public static void solutionTwo() {

        int i = sc.nextInt();
        int firstDigit = i / 100;
        int thirdDigit = i % 10;
        int secondDigit = (i - firstDigit * 100 - thirdDigit) / 10;
        int reverse = thirdDigit * 100 + secondDigit * 10 + firstDigit;

        System.out.println(reverse);
    }

}
