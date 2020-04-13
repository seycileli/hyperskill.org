import java.util.Scanner;

public class hyperSkill {

    static Scanner sc;
    public static void main(String[] args) {

    sc = new Scanner(System.in);

    test();

    }
    
   public static void test() {

   String java = sc.next();
   String programming = sc.next();
   String language = sc.next();

   System.out.println(language + "\n" + programming + "\n" + java);

}
