package basicSyntaxAndSimplePrograms;

import java.util.Scanner;

public class printingEachWordInANewLine {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        solution();
        solutionTwo();
        solutionThree();
        
    }

    public static void solution() {

        String one = sc.next();
        String two = sc.next();
        String three = sc.next();
        String four = sc.next();
        String five = sc.next();

        System.out.print(one + "\n" + two + "\n" +
                three + "\n" + four + "\n" + five);

    }

    public static void solutionTwo() {

        for (int i = 0; i < 5; i++) {
            System.out.println(sc.next());
        }
    }

    public static void solutionThree() {

        while(sc.hasNext()) {
            System.out.println(sc.next());
        }

    }

}
