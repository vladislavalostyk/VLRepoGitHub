import java.util.Scanner;

/**
 * Created by ����� on 26.10.2015.
 */
public class Ex1 {
    public static void main(String[] args) {

        Scanner = new Scanner(System.in);

        int number = new Random().nextInt(100);

        int response;

        System.out.println("��� - ������� ����� �� 0 �� 100!");

        while (true) {
            response = Integer.parseInt(scaner.nextLine());

            if (response == number) {
                System.out.println("�� �������!");
                break;
            } else if (response < number) {
                System.out.println("����� �����");
            } else {
                System.out.println("����� �����");
            }
        }
    }
}
