package gui.swing.exceptions;
/**
 * This exception is throwed when there's a problem with the size of the arrays.
 
 */
public class IncorrectArrayBoundsException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public IncorrectArrayBoundsException() {
		super();
	}
	public IncorrectArrayBoundsException(String message) {
		super(message);
	}
	public IncorrectArrayBoundsException(String message, Throwable cause) {
		super(message, cause);
	}
}
