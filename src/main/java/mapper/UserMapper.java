package mapper;

import pojo.User;

public interface UserMapper {
	public User findByUserId(int id);
}
