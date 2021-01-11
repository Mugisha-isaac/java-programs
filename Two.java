import java.io.IOException;
import java.util.Scanner;

public class Two {
    static Scanner reader = new Scanner(System.in);

    public static void main(String args[]) throws IOException {
        // System.out.println("Enter your name");
        // String name = reader.nextLine();
        // char age = name.charAt(0);
        // System.out.println("your name is:" + name);
        // System.out.println("your gender is " + age);
        System.out.println("Enter your name");
        String name = args[0];
        System.out.println(name);
    }
}
