package exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {

	void validateRegistration(String login, String password, String confirmPassword)
			throws EmptyLoginException, InvalidCharacterException, PasswordConfirmationException, LengthException {

		if ((login == null || login.trim().length() == 0) ||
				password == null || password.length() == 0 ||
				confirmPassword == null || confirmPassword.length() == 0) {
			throw new EmptyLoginException("Все поля должны быть заполнены");
		}

		if (login.length() > 20 || password.length() > 20 ||
				confirmPassword.length() > 20) {
			throw new LengthException("Длина поля не должна превышать 20 символов");
		}
		Pattern pattern = Pattern.compile("[^a-zA-Z0-1_]");
		Matcher matcher = pattern.matcher(login);
		Matcher matcher1 = pattern.matcher(password);
		Matcher matcher2 = pattern.matcher(confirmPassword);
		if (matcher.find() || matcher1.find() || matcher2.find()) {
			throw new InvalidCharacterException("Введены недопустимые символы");
		}
		if (!password.equals(confirmPassword)) {
			throw new PasswordConfirmationException("Пароли и его подтверждение не совпадают");
		}
	}

	public static void main(String[] args) {
		Registration registration = new Registration();
		try {
			registration.validateRegistration("101001", "tttt_", "tttt_");
		} catch (EmptyLoginException e) {
			e.printStackTrace();
		} catch (InvalidCharacterException e) {
			e.printStackTrace();
		} catch (PasswordConfirmationException e) {
			e.printStackTrace();
		} catch (LengthException e) {
			e.printStackTrace();
		}
	}
}
