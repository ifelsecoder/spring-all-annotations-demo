package com.example.annotations.config;

import com.example.annotations.bean.MyFirstBean;
import com.example.annotations.bean.MySecondBean;
import com.example.annotations.util.MyLogger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MyAppConfiguration {

	private static final String ANNOTATIONS = " [ANNOTATIONS:  " +
													"@Bean, @Configuration" +
												"]";

	public MyAppConfiguration() {
		MyLogger.log("MyAppConfiguration, constructor - called" + ANNOTATIONS);
	}

	@Bean
	public MyFirstBean getMyFirstBean() {
		MyLogger.log("MyAppConfiguration, getMyFirstBean - called" + ANNOTATIONS);
		return new MyFirstBean();
	}

	@Bean(name= {"getMySecondBean", "MySecondBean"}, initMethod="init", destroyMethod="destroy")
	public MySecondBean getMySecondBean() {
		MyLogger.log("MyAppConfiguration, getMySecondBean - called" + ANNOTATIONS);
		return new MySecondBean();
	}
}
