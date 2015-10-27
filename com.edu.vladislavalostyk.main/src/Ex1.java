import java.util.Scanner;

/**
 * Created by —ашка on 26.10.2015.
 */
public class Ex1 {
    public static void main(String[] args) {

        Scanner = new Scanner(System.in);

        int number = new Random().nextInt(100);

        int response;

        System.out.println("√ра - в≥дгадай число в≥д 0 до 100!");

        while (true) {
            response = Integer.parseInt(scaner.nextLine());

            if (response == number) {
                System.out.println("¬и вгадали!");
                break;
            } else if (response < number) {
                System.out.println("„исло менше");
            } else {
                System.out.println("„исло б≥льше");
            }
        }
    }
}
