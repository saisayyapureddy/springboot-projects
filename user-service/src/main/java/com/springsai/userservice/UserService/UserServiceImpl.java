package com.springsai.userservice.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springsai.userservice.entity.User;
import com.springsai.userservice.repository.UserRepository;
import com.springsai.userservice.wrapperObject.Department;
import com.springsai.userservice.wrapperObject.ResponseTemplate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public User saveUser(User user) {
		log.info("inside saveUser from UserServiceImpl" + user);
		return userRepository.save(user);
	}

	@Override
	public User getUser(Long id) {
		return userRepository.findById(id).get();
	}

	@Override
	public ResponseTemplate getUserWithDepartment(long userId) {
		ResponseTemplate responseTemplate = new ResponseTemplate();
		User user = userRepository.findById(userId).get();
		// department get method url -->http://localhost:9001/departments/1
		Department department = restTemplate.getForObject("http://localhost:9001/departments/" 
		+ user.getUserId(),
		Department.class);

		responseTemplate.setDepartment(department);
		responseTemplate.setUser(user);

		return responseTemplate;
	}

}
