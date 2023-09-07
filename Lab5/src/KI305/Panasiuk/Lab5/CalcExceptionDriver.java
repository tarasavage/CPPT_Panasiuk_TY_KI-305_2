package KI305.Panasiuk.Lab5;

import java.io.*;
import java.util.*;

/**
 * Class CalcExceptionDriver implements a driver for the given expression calculator.
 * 
 * @author Taras Panasiuk
 * @version 1.0
 */
public class CalcExceptionDriver {
    /**
     * The main method, the starting point of the program.
     */
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            PrintWriter fout = new PrintWriter(new File("result.txt"));
            try {
                try {
                    Equations eq = new Equations();
                    System.out.print("Enter X in degrees: ");
                    double res = eq.calculate(input.nextDouble());
                    System.out.print("sin(3x-5) / ctg(2x) = " + res);
                    fout.print(res);
                } finally {
                    fout.flush();
                    fout.close();
                    input.close();
                }
            } catch (CalcException ex) {
                System.out.print(ex.getMessage());
            }
        } catch (FileNotFoundException ex) {
            System.out.print("Exception reason: Perhaps wrong file path");
        }
    }
}

