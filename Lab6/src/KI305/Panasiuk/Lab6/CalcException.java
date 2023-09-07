package KI305.Panasiuk.Lab6;

/**
 * Class CalcException implements a subclass that catches arithmetic exceptions and provides an explanation
 * of why this exception occurred.
 * 
 * @author Taras Panasiuk
 * @version 1.0
 */
@SuppressWarnings("serial")
public class CalcException extends ArithmeticException {
    /**
     * Default constructor.
     */
    public CalcException() {

    }

    /**
     * Constructor.
     * 
     * @param cause Explanatory message explaining why the exception occurred.
     */
    public CalcException(String cause) {
        super(cause);
    }
}
