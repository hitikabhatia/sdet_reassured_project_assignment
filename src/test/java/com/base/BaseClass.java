package com.base;

import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;

public class BaseClass {
	
	@BeforeSuite
	public void setupURL() {
		System.out.println("**------------------Starting the test program----------------**");
		RestAssured.baseURI = "https://petstore.swagger.io";
	}
}
