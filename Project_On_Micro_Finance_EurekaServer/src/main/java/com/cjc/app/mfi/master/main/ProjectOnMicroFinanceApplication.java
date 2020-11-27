package com.cjc.app.mfi.master.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ProjectOnMicroFinanceApplication {

	public static void main(String[] args) 
	{
		System.out.println("Eureka_Server !!!");
		SpringApplication.run(ProjectOnMicroFinanceApplication.class, args);
	}

}
