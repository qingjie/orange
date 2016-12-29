package com.qingjie.web;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.qingjie.domain.User;

@RestController
public class HelloController {
	
	  @RequestMapping("/hello") 
	  public String index() { return "Hello World"; }
	 

}
