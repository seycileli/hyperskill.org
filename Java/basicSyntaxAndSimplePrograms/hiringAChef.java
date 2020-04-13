import java.util.Scanner;

public class hyperSkill {

    static Scanner sc;
    public static void main(String[] args) {

        sc = new Scanner(System.in);
        test();

    }
    
        public static void test() {

        Scanner sc = new Scanner(System.in);

        String firstName = sc.next();
        int age = sc.nextInt();
        String education = sc.next();
        int experience = sc.nextInt();
        String cuisine = sc.next();

        System.out.println(firstName + "\n" +
                age + "\n" +
                education + "\n" +
                experience + "\n" +
                cuisine + "\n");

        System.out.println("The form for " + firstName + " is completed. We will contact you if we need a chef " +
                "that cooks " + cuisine + " dishes.");

    }
