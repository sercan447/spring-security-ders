package org.kemal.model;

public class User {

	private int id;
	private String username;
	private String password;
	private String email;
	private String authority;
	private boolean enabled = true;
	
	public User() {}

	public User(int id, String username, String password, String authority, boolean enabled) {
	
		this.id = id;
		this.username = username;
		this.password = password;
		this.authority = authority;
		this.enabled = enabled;
	}

	public User(String username, String password, String authority, boolean enabled) {

		this.username = username;
		this.password = password;
		this.authority = authority;
		this.enabled = enabled;
	}





	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", authority=" + authority + ", enabled="
				+ enabled + "]";
	}
	
	
	
	
}
