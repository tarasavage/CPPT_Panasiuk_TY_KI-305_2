package KI305.Panasiuk.Lab5;

/**
 * Class that implements a method for calculating the expression sin(3x-5) / ctg(2x).
 * 
 * @author Taras Panasiuk
 * @version 1.0
 */
public class Equations {
    /**
     * Method to calculate the sin(3x-5) / ctg(2x) expression.
     * 
     * @param x Angle in degrees.
     * @throws CalcException
     * @return Result of the calculation.
     */
    public double calculate(double x) throws CalcException {
        double y;
        try {
            double division = (1.0 / Math.tan(Math.toRadians(2 * x)));
            
            // Check for division by zero
            if (division == 0) {
                throw new CalcException("Exception reason: ctg(2x) = 0");
            }
            
            y = Math.sin(Math.toRadians(3 * x - 5)) / division;
            
            // Check for NaN and Infinity
            if (Double.isNaN(y) || Double.isInfinite(y) || Double.isInfinite(-y)) {
                throw new ArithmeticException();
            }
            
            // Check for illegal values of X for ctg calculation
            if (x % 90 == 0) {
                throw new CalcException("Exception reason: Illegal value of X for ctg calculation");
            }
            
        } catch (ArithmeticException ex) {
            throw new CalcException("Unknown reason for the exception during expression calculation");
        }
        return y;
    }
}
