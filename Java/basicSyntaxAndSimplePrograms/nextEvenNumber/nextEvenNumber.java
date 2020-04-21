package basicSyntaxAndSimplePrograms;

import java.util.Scanner;

public class OutputEvenNumber {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        solution();
        solutionTwo();
        solutionThree();

    }

    private static void solution() {

        int x = sc.nextInt();
        int i = x - x % 2 + 2;
        System.out.println(i);

    }

    private static void solutionTwo() {
        int x = sc.nextInt();

        x += 1;
        x += x % 2;
        System.out.println(x);

    }

    private static void solutionThree() {
        int x = sc.nextInt();

        if (x % 2 == 0) {
            x += 1;
        }

        System.out.println(++x);

    }

}
