package basicSyntaxAndSimplePrograms;

import java.util.Scanner;

public class readingIntegerNumbers {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

      solutionOne();
      solutionTwo();

    }

    public static void solutionOne() {

        int x = sc.nextInt();

        int result = ((x + 1) * x + 2) * x + 3;

        System.out.println(result);

        System.out.println();

    }

    public static void solutionTwo() {

        System.out.println(((sc.nextInt() + 1) * sc.nextInt() + 2) * sc.nextInt() + 3);

    }

}
