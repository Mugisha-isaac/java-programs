package Arrays;

public class Two {
    public static void main(String args[]) {
        int[][] numbers = new int[3][3];
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 5;

        numbers[1][0] = 5;
        numbers[1][1] = 8;
        numbers[1][2] = 12;

        numbers[2][0] = 0;
        numbers[2][1] = 0;
        numbers[2][2] = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    System.out.print(numbers[i][j] + "\t");
                }

            }
            System.out.print("\n");
        }
    }
}
