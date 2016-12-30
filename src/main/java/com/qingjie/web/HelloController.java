package com.qingjie.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}

}

/*
 * @Controller public class HelloController {
 * 
 * @RequestMapping("/hello") public String hello() throws Exception { throw new
 * Exception("发生错误"); }
 * 
 * @RequestMapping("/json") public String json() throws MyException { throw new
 * MyException("发生错误2"); }
 * 
 * @RequestMapping("/") public String index(ModelMap map) {
 * map.addAttribute("host", "http://www.syr.edu"); return "index"; }
 * 
 * }
 */