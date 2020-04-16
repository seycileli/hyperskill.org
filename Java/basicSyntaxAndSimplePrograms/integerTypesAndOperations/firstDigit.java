package basicSyntaxAndSimplePrograms;

import java.util.Scanner;

public class firstDigit {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        solution();
        solutionTwo();
        solutionThree();
        solutionFour();
    }

    public static void solution() {

        int n = sc.nextInt();

        int result = n / 10;

        System.out.println(result);
    }

    public static void solutionTwo() {

        System.out.println(sc.nextInt() / 10);
    }

    public static void solutionThree() {

        int number, firstNum;
        number = sc.nextInt();

        firstNum = number;
        while (firstNum >= 10) {
            firstNum = firstNum / 10;
        }

        System.out.println(firstNum);
    }

    public static void solutionFour() {

        int number = sc.nextInt();

        System.out.println(number / 10);

    }
}
