public class BreakContinue {
    public static void main(String args[]) {
        for (int i = 0; i < 10; i = i + 1) {
            if (i == 2) {
                // continue;
                System.out.println("count is " + i);
                break;
            }

        }
    }
}
