import java.util.ArrayList;
import java.util.Scanner;

public class hyperSkill {

    static Scanner sc;
    public static void main(String[] args) {

        sc = new Scanner(System.in);

        solutionOne();
        solutionTwo();

   }
    
    public static void solutionOne() {
    
    sc = new Scanner(System.in);

    String guestName1 = sc.next();
    String guestName2 = sc.next();
    String guestName3 = sc.next();
    String guestName4 = sc.next();
    String guestName5 = sc.next();
    String guestName6 = sc.next();
    String guestName7 = sc.next();
    String guestName8 = sc.next();

    System.out.println(guestName8 + "\n" + guestName7 + "\n" + guestName6 + "\n" + guestName5 + "\n"
                + guestName4 + "\n" + guestName3 + "\n" + guestName2 + "\n" + guestName1);
        
    }
        
    public static void solutionTwo() {
    
        sc = new Scanner(System.in);

        ArrayList<String> guest = new ArrayList<>();
        while (sc.hasNext()) {
            guest.add(sc.next());
        }

        for (int i = guest.size() - 1; i >= 0; --i) {
            System.out.println(guest.get(i));
        }
        

    }
