package KI305.Panasiuk.Lab6;

import java.io.*;
import java.util.Scanner;

/**
 * Class CalcExceptionDriver implements a driver for the given expression calculator.
 * 
 * @author Taras Panasiuk
 * @version 1.0
 */
public class CalcExceptionDriver {
	/**
	 * The main method, the starting point of the program.
	 *
	 * @param args The command-line arguments passed to the program.
	 */
    public static void main(String[] args) {
        try {
            Equations obj = new Equations();
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Enter data: ");
                double data = scanner.nextDouble();
                obj.calculate(data);

                System.out.println("Result is: " + obj.getResult());

                obj.writeResTxt("textRes.txt");
                obj.writeResBin("BinRes.bin");
                obj.readResBin("BinRes.bin");

                System.out.println("Result is: " + obj.getResult());

                obj.readResTxt("textRes.txt");

                System.out.println("Result is: " + obj.getResult());
            } catch (FileNotFoundException ex) {
                System.out.print("Exception reason: File not found - " + ex.getMessage());
            } catch (IOException ex) {
                System.out.print("Exception reason: IO Exception - " + ex.getMessage());
            } finally {
                scanner.close();
            }
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
