package service;

import javax.annotation.Resource;

import mapper.UserMapper;
import pojo.User;

public class UserService {
/*	public User getUserById(long id){
		User user = new User();
		user.setId(1);
		user.setUsername("subendong");
		
		return user;
	}*/
	
	//�Զ�װ��
    private UserMapper userMapper;
    
    /**
     * ��ѯ�û�����
     */    
    public User findByUserId(int id) {
    	User user = userMapper.findByUserId(id);
    	
    /*	User user = new User();
		user.setId(1);
		user.setUsername("subendong");*/
    	
        return user;
    }
}
