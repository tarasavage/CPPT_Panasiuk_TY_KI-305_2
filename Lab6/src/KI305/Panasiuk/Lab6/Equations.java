package KI305.Panasiuk.Lab6;

import java.io.*;
import java.util.Scanner;
/**
 * Class that implements a method for calculating the expression sin(3x-5) / ctg(2x).
 * 
 * @author Taras Panasiuk
 * @version 1.0
 */
public class Equations {
    private double result;

    /**
     * Calculates the expression sin(3x-5) / ctg(2x) and stores the result.
     *
     * @param x The value of the angle in degrees.
     * @throws CalcException if there is an error during the calculation.
     */
    public void calculate(double x) throws CalcException {
        try {
            double division = (1.0 / Math.tan(Math.toRadians(2 * x)));

            // Check for division by zero
            if (division == 0) {
                throw new CalcException("Exception reason: ctg(2x) = 0");
            }

            result = Math.sin(Math.toRadians(3 * x - 5)) / division;

            // Check for NaN and Infinity
            if (Double.isNaN(result) || Double.isInfinite(result) || Double.isInfinite(-result)) {
                throw new ArithmeticException();
            }

            // Check for illegal values of X for ctg calculation
            if (x % 90 == 0) {
                throw new CalcException("Exception reason: Illegal value of X for ctg calculation");
            }

        } catch (ArithmeticException ex) {
            throw new CalcException("Unknown reason for the exception during expression calculation");
        }
    }

    /**
     * Writes the calculated result to a text file.
     *
     * @param fName The name of the text file.
     * @throws FileNotFoundException if the file cannot be found.
     */
    public void writeResTxt(String fName) throws FileNotFoundException {
        PrintWriter f = new PrintWriter(fName);
        f.printf("%f ", result);
        f.close();
    }

    /**
     * Reads the calculated result from a text file.
     *
     * @param fName The name of the text file.
     */
    public void readResTxt(String fName) {
        try {
            File f = new File(fName);
            if (f.exists()) {
                Scanner s = new Scanner(f);
                result = s.nextDouble();
                s.close();
            } else {
                throw new FileNotFoundException("File " + fName + " not found");
            }
        } catch (FileNotFoundException ex) {
            System.out.print(ex.getMessage());
        }
    }

    /**
     * Writes the calculated result to a binary file.
     *
     * @param fName The name of the binary file.
     * @throws FileNotFoundException if the file cannot be found.
     * @throws IOException if there is an I/O error.
     */
    public void writeResBin(String fName) throws FileNotFoundException, IOException {
        DataOutputStream f = new DataOutputStream(new FileOutputStream(fName));
        f.writeDouble(result);
        f.close();
    }

    /**
     * Reads the calculated result from a binary file.
     *
     * @param fName The name of the binary file.
     * @throws FileNotFoundException if the file cannot be found.
     * @throws IOException if there is an I/O error.
     */
    public void readResBin(String fName) throws FileNotFoundException, IOException {
        DataInputStream f = new DataInputStream(new FileInputStream(fName));
        result = f.readDouble();
        f.close();
    }

    /**
     * Gets the calculated result.
     *
     * @return The calculated result.
     */
    public double getResult() {
        return result;
    }
}
