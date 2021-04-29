package com.example.annotations.bean;

import com.example.annotations.util.MyLogger;


public class MySecondBean
{
	public void isFile() {
		MyLogger.log("MySecondBean, isFile - called");
	}

	public String toString() {
		MyLogger.log("MySecondBean, toString - called");
		return "MySecondBean"+this.hashCode();
	}
	
	public void init() {
		MyLogger.log("MySecondBean, init - called");
	}
	
	public void destroy() {
		MyLogger.log("MySecondBean, destroy - called");
	}
}
