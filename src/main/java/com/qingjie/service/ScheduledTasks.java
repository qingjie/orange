package com.qingjie.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	// @Scheduled(fixedRate = 5000)
	@Scheduled(cron = "*/5 * * * * *")
	public void reportCurrentTime() {
		System.out.println("Current Time: " + dateFormat.format(new Date()));
	}

}