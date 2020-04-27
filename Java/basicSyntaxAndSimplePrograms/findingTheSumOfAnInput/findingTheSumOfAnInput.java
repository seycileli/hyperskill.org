package basicSyntaxAndSimplePrograms;

import java.util.Scanner;

public class findingTheSumOfAnInput {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        solution();
        solutionTwo();

    }

    public static void solution() {

        int x = sc.nextInt();

        int firstDigit = x / 100;
        int secondDigit = (x % 100) / 10;
        int thirdDigit = x % 10;

        int sum = firstDigit + secondDigit + thirdDigit;

        System.out.println(sum);
    }

    public static void solutionTwo() {
        int x = sc.nextInt();
        System.out.println(x / 100 + (x % 100) / 10 + (x % 100) % 10);
    }

}
