package exception;

public class MyException extends RuntimeException {
	String msg;
	String fileName;

	public MyException(String msg, String fileName) {
		super(msg);
		this.msg = msg;
		this.fileName = fileName;
	}
}
