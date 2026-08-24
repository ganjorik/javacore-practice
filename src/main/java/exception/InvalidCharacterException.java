package exception;

public class InvalidCharacterException extends Exception {
	private String msg;

	public InvalidCharacterException(String msg) {
		super(msg);
		this.msg = msg;
	}
}
