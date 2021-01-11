import java.io.IOException;
import java.util.Scanner;

public class Three {
    public static void main(String args[]) throws IOException {
        System.out.println("Enter your choice");
        Scanner input = new Scanner(System.in);

        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("you choosed one");
                break;
            case 2:
                System.out.println("you choosed 2");
                break;

            default:
                System.out.println("you choosed nothing");
                break;
        }
        input.close();
    }
}
