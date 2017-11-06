package pojo;

public class User {
	public long id;
	public String username;
	public long getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "user [id=" + id + ", username=" + username + "]";
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
