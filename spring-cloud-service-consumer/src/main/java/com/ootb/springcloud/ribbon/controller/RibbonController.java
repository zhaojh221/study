package com.ootb.springcloud.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ootb.springcloud.ribbon.service.RibbonService;
import com.ootb.springcloud.ribbon.vo.User;

@RestController
public class RibbonController {

	@Autowired
	private RibbonService ribbonService;
	
	@GetMapping("/ribbon/{id}")
	public User findById(@PathVariable Long id){
		return ribbonService.findUserById(id);
	}
}
