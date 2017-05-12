package com.ootb.springcloud.ribbon.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.ootb.springcloud.ribbon.vo.User;

@Service
public class RibbonService {

	private Logger logger = LoggerFactory.getLogger(RibbonService.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="fallback")
	public User findUserById(Long id){
		User userVO = new User();
		userVO = restTemplate.getForObject("http://service-provider/users/" + id, User.class);
		userVO.setId(id);
		return userVO;
	}
	
	public User fallback(Long id){
		logger.info("ERROR ");
		User userVO = new User();
		userVO.setId(-1l);
		
		return userVO;
	}
}
