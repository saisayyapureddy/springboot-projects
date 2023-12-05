package com.springsai.userservice.wrapperObject;

import com.springsai.userservice.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplate {
	private User user;
	private Department department;

}
