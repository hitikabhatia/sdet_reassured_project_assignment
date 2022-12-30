package com.restassured;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.base.InputDataForUserMethodDef;

import io.restassured.response.Response;

public class PetStoreUserMethodDefinitions {
	@BeforeSuite
	public void createUser() {
		InputDataForUserMethodDef myUserDetailsClassObj = new InputDataForUserMethodDef();
		Response createUserRequestResponse = given().header("Content-Type", "application/json").when()
				.body(myUserDetailsClassObj.initializeUserDetails()).post("/v2/user/createWithArray");
		Assert.assertEquals(createUserRequestResponse.getStatusCode(), 200, "User could not be created");
		System.out.println("*****User has been created successfully.******");
	}
	
	@AfterSuite
	public void deleteUser() {
		InputDataForUserMethodDef myUserDetailsClassObj = new InputDataForUserMethodDef();
		myUserDetailsClassObj.setUserName("hbhatia");
		Response myUserDeleteRequestResponse = given().header("Content-Type", "application/json").delete("/v2/user/" + myUserDetailsClassObj.getUserName());
		Assert.assertEquals(myUserDeleteRequestResponse.getStatusCode(), 200, "User could not be deleted");
		System.out.println("*****User has been deleted successfully.******");
	}
}
