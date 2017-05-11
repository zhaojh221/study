package com.ootb.springcloud.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ootb.springcloud.ribbon.vo.User;

@Service
public class RibbonService {

	@Autowired
	private RestTemplate restTemplate;
	
	public User findUserById(Long id){
		User userVO = new User();
		userVO = restTemplate.getForObject("http://service-provider/users/" + id, User.class);
		return userVO;
	}
}
