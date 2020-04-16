package basicSyntaxAndSimplePrograms;

import java.util.Scanner;

public class printingStringsInTheSameOrder {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        solution();
        solutionTwo();

    }

    public static void solution() {

        String one = sc.next();
        String two = sc.next();
        String three = sc.next();
        String four = sc.next();

        System.out.println(one + "\n" + two + "\n" + three + "\n" + four);

    }

    public static void solutionTwo() {

        for (int i = 0; i <= 4; i++) {
            System.out.println(sc.next());
        }

    }

}
