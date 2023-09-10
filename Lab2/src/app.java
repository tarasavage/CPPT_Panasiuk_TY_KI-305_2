import java.io.*;
import java.util.*;

public class app {

    private static final int MIN_MATRIX_SIZE = 3;
    private static final String OUTPUT_FILE = "Result.txt";

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_FILE))) {

            int size = getInputSize(scanner);
            String fillCharacter = getInputFillCharacter(scanner);

            char[][] matrix = generateMatrix(size, fillCharacter);
            displayMatrix(matrix);
            saveMatrixToFile(matrix, writer);

        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    private static int getInputSize(Scanner scanner) {
        int size = 0;
        while (true) {
            try {
                System.out.print("Enter size: ");
                size = scanner.nextInt();
                if (size <= MIN_MATRIX_SIZE) {
                    System.out.println("The size of the matrix must be greater than " + MIN_MATRIX_SIZE);
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine(); // Consume the invalid input
            }
        }
        return size;
    }

    private static String getInputFillCharacter(Scanner scanner) {
        String fillCharacter;
        while (true) {
            System.out.print("Enter fill character: ");
            fillCharacter = scanner.next();
            if (fillCharacter.length() != 1) {
                System.out.println("Fill character must be a single character.");
            } else {
                break;
            }
        }
        return fillCharacter;
    }

    private static char[][] generateMatrix(int size, String fillCharacter) {
        char[][] matrix = new char[size][];
        for (int i = 0; i < size; i++) {
            matrix[i] = new char[size - i];
            Arrays.fill(matrix[i], fillCharacter.charAt(0));
        }
        return matrix;
    }

    private static void displayMatrix(char[][] matrix) {
        for (char[] row : matrix) {
        	for (int skip = 0; skip < matrix.length - row.length; skip++) {
        		System.out.print("\t");
        	}
            for (char cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }

    private static void saveMatrixToFile(char[][] matrix, BufferedWriter writer) throws IOException {
        for (char[] row : matrix) {
        	for (int skip = 0; skip < matrix.length - row.length; skip++) {
        		writer.write("\t");
        	}
            for (char cell : row) {
                writer.write(cell + "\t");
            }
            writer.newLine();
        }
        writer.flush();
        System.out.println("Matrix saved to " + OUTPUT_FILE);
    }
}
