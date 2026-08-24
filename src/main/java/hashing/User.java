package hashing;

import java.time.LocalDate;
import java.util.Objects;

public class User {
	private String login;
	private String password;
	private LocalDate createDate;

	public User(String login, String password, LocalDate createDate) {
		this.login = login;
		this.password = password;
		this.createDate = createDate;
	}

	public User(String login) {
		this.login = login;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof User)) return false;
		User user = (User) o;
		return Objects.equals(login, user.login) && Objects.equals(password, user.password) && Objects.equals(createDate, user.createDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(login, password, createDate);
	}

	@Override
	public String toString() {
		return "User{" +
				"login='" + login + '\'' +
				", password='" + password + '\'' +
				", createDate=" + createDate +
				'}';
	}
}
