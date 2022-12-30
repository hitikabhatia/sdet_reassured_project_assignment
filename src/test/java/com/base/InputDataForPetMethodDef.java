package com.base;

public class InputDataForPetMethodDef {
	
	String mydogName;
	public String myinputDataForAddPet;
	public String myupdatedInputDataForUpdatePet;
	
	public String getMydogName() {
		return mydogName;
	}

	public void setMydogName(String mydogName) {
		this.mydogName = mydogName;
	}
	
	public String intializeBodyData() {
		myinputDataForAddPet = "{\r\n"
				+ "		  \"id\": 0,\r\n"
				+ "		  \"category\": {\r\n"
				+ "		    \"id\": 0,\r\n"
				+ "		    \"name\": \"string\"\r\n"
				+ "		  },\r\n"
				+ "		  \"name\": \""+getMydogName()+"\",\r\n"
				+ "		  \"photoUrls\": [\r\n"
				+ "		    \"string\"\r\n"
				+ "		  ],\r\n"
				+ "		  \"tags\": [\r\n"
				+ "		    {\r\n"
				+ "		      \"id\": 0,\r\n"
				+ "		      \"name\": \"string\"\r\n"
				+ "		    }\r\n"
				+ "		  ],\r\n"
				+ "		  \"status\": \"available\"\r\n"
				+ "		}";
		return myinputDataForAddPet;
	}
	
	public String intializeUpdatedData(String newID, String newName) {
		myupdatedInputDataForUpdatePet = "{\r\n"
				+ "  \"id\": "+newID+",\r\n"
				+ "  \"category\": {\r\n"
				+ "    \"id\": 0,\r\n"
				+ "    \"name\": \"string\"\r\n"
				+ "  },\r\n"
				+ "  \"name\": \""+newName+"\",\r\n"
				+ "  \"photoUrls\": [\r\n"
				+ "    \"string\"\r\n"
				+ "  ],\r\n"
				+ "  \"tags\": [\r\n"
				+ "    {\r\n"
				+ "      \"id\": 0,\r\n"
				+ "      \"name\": \"string\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"status\": \"available\"\r\n"
				+ "}";
		return myupdatedInputDataForUpdatePet;
	}
	
	
	
}
