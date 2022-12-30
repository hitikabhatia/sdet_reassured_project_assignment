package com.restassured;

import static io.restassured.RestAssured.given;
import java.util.Scanner;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import com.base.InputDataForPetMethodDef;

public class PetStoreMethodDefinitionClass {
	public String petID;

	@BeforeTest
	public void addPet() {
		
		System.out.println("Adding the pet");

		InputDataForPetMethodDef mydataInputClassObject = new InputDataForPetMethodDef();
		mydataInputClassObject.setMydogName("husky");

		Response myaddPetRequestResponse = given().header("Content-Type", "application/json").when()
				.body(mydataInputClassObject.intializeBodyData()).post("/v2/pet");

		int returnedStatusCode = myaddPetRequestResponse.getStatusCode();
		Assert.assertEquals(returnedStatusCode, 200, "Pet could not be added");
		System.out.println("New pet has been added");

		JsonPath jsonPathResponseAddPet = myaddPetRequestResponse.jsonPath();
		petID = jsonPathResponseAddPet.getString("id");
	}

	@Test
	public void updatePet() {

		System.out.println("Updating the Pet");
		String mydogNewName = "german-shepherd";

		InputDataForPetMethodDef myInputDataClassObject = new InputDataForPetMethodDef();
		Response myUpdateRequestResponse = given().header("Content-Type", "application/json").when()
				.body(myInputDataClassObject.intializeUpdatedData(petID, mydogNewName)).put("/v2/pet");
		Assert.assertEquals(myUpdateRequestResponse.getStatusCode(), 200, "Pet could not be updated");
		System.out.println("Pet has been updated successfully.");
		
	}

	@Test
	public void getPetByID() {
		System.out.println("Getting the pet information");
		Response myGetRequestResponse = given().header("Content-Type", "application/json").when().get("/v2/pet/" + petID);
		Assert.assertEquals(myGetRequestResponse.getStatusCode(), 200, "Pet information could not be retrieved");
		System.out.println("Pet information retrieved successfully.");
		
	}

	@AfterTest
	public void deletePetByID() {
		System.out.println("Removing the pet");
		Response myDeleteRequestResponse = given().header("Content-Type", "application/json").delete("/v2/pet/" + petID);
		Assert.assertEquals(myDeleteRequestResponse.getStatusCode(), 200, "Pet could not be deleted");
		System.out.println("Pet deleted successfully.");
	}
}