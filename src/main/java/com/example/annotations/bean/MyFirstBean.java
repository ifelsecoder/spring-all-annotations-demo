package com.example.annotations.bean;

import com.example.annotations.util.MyLogger;

public class MyFirstBean
{

	public String toString() {
		MyLogger.log("MyFirstBean, toString - called");
		return "MyFirstBean, " + this.hashCode();
	}
}
