package Domain;

public class User {
	private String _username;
	private String _password;
	public UserDAO _unnamed_UserDAO_;

	public User() {
		throw new UnsupportedOperationException();
	}

	public User(String aUsername, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public int login() {
		throw new UnsupportedOperationException();
	}

	public void setUsername(String aUsername) {
		this._username = aUsername;
	}

	public String getUsername() {
		return this._username;
	}

	public void setPassword(String aPassword) {
		this._password = aPassword;
	}

	public String getPassword() {
		return this._password;
	}
}