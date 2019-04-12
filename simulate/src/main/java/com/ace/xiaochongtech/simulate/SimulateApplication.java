package com.ace.xiaochongtech.simulate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class SimulateApplication {
	
	public static Logger LOG = LoggerFactory.getLogger(SimulateApplication.class);

	public static void main(String[] args) {
		
		try {
			
			LOG.info("服务启动中......");
			SpringApplication.run(SimulateApplication.class, args);
			
		} catch (Exception e) {
			LOG.error("服务启动失败", e);
		}
		
		
		
		
	}
	
}
