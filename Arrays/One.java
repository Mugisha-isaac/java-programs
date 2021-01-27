package Arrays;

import java.util.Scanner;

public class One {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        String[] jobs = new String[5];
        // jobs[0] = "developer";
        // jobs[1] = "tester";
        // jobs[2] = "QA";
        // jobs[3] = "manager";
        // jobs[2] = "Admin";

        System.out.println("Enter jobs");

        for (int i = 0; i < 4; i++) {
            // System.out.println(jobs[i]);
            jobs[i] = reader.nextLine();
        }

        System.out.println("List of jobs");
        for (int i = 0; i < 5; i++) {
            System.out.println(jobs[i]);
        }
    }
}
