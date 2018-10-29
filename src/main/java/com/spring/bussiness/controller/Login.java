package com.spring.bussiness.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.bussiness.dao.User;

@Controller
public class Login {


	private static Logger logger = LogManager.getLogger(Login.class);

	@RequestMapping(value = "login", method = { RequestMethod.POST })
	@CrossOrigin
	@ResponseBody
	public User addArticle(@RequestBody User u4b, HttpServletRequest request) {


		logger.error("ss");
		logger.info("big");
		System.out.println("sss");
		User sad = new User();
		sad.setNick("sad");
		sad.setSex("sad");

		return sad;
	}
}
