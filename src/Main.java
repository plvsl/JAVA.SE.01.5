import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matrixSize;

        do {
            System.out.println("Enter the matrix size");
            matrixSize = input.nextInt();

            if (matrixSize <= 0) {
                System.out.println("Incorrect! Enter the matrix size again!");
                System.out.println("---------------------------------------");
            }

        } while (matrixSize <= 0);

        int matrixArray[][] = new int[matrixSize][matrixSize];
        int endOfMatrix = matrixSize - 1;

        for (int i = 0; i < matrixSize; i++) {
            matrixArray[i][i] = 1;
            matrixArray[endOfMatrix - i][i] = 1;
        }

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                System.out.print(matrixArray[i][j]);
            }
            System.out.println();
        }
    }

}