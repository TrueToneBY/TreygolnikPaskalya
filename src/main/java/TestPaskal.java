import java.util.Scanner;

public class TestPaskal {

    /**
     * Created by ParseJava on 18.04.2020.
     */


        public static void main(String[] args) {
            System.out.println("Введите число например : 5");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();


            createPascalTriangle(n);
        }

        public static int[][] createPascalTriangle(int n) {

            checkNumber(n);

            int[][] array = new int[n + 1][n + 1];

            for (int i = 0; i < array.length; i++) {

                getFormTriangle(array, i);

                for (int j = 0; j < array[0].length; j++) {
                    if (j > i) {
                        break;
                    }
                    if ((i > j) && (j > 0)) {
                        array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
                    } else {
                        array[i][j] = 1;
                    }

                    System.out.print(array[i][j] + "   ");
                }

                System.out.println();
            }
            return array;
        }

        public static void getFormTriangle(int[][] array, int i) {
            for (int k = i; k < array.length; k++) {
                System.out.print("  ");
            }
        }

        public static void checkNumber(int n) {
            if (n < 0) {
                throw new IllegalAccessError("negative number");
            }
            if (n == 0) {
                n = 1;
            }
        }
    }


