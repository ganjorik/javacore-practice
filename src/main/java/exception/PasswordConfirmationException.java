package exception;

public class PasswordConfirmationException extends Exception {
	private String msg;

	public PasswordConfirmationException(String msg) {
		super(msg);
		this.msg = msg;
	}
}
