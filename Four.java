import java.io.IOException;

public class Four {

    public void printEvenNumbers() {
        for (int i = 0; i < 10; i = i + 2) {
            System.out.println("count: " + i);
        }
    }

    public static void main(String args[]) throws IOException {
        Four printPattern = new Four();
        printPattern.printEvenNumbers();
    }
}
