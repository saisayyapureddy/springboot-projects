package com.springsai.userservice.UserService;

import com.springsai.userservice.entity.User;
import com.springsai.userservice.wrapperObject.ResponseTemplate;

public interface UserService {
	
	public User saveUser(User user);
	public User getUser(Long id);
	public ResponseTemplate getUserWithDepartment(long userId);

}
