package com.qingjie.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	@ResponseBody
	public String hello(@RequestParam String name) {
		return "Hello " + name;
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