package com.qingjie.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogPropertiesApplicationTest {

	@Autowired
	private BlogProperties blogProperties;

	@Test
	public void getHello() throws Exception {
		Assert.assertEquals(blogProperties.getName(), "qingjie zhao");
		Assert.assertEquals(blogProperties.getTitle(), "Spring Boot Demo");
	}

}
