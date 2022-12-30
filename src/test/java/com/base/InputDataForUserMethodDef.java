package com.base;

public class InputDataForUserMethodDef {
	public String userDetails;
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String userName;
	
	public String initializeUserDetails() {
		userDetails = "[\r\n"
				+ "  {\r\n"
				+ "    \"id\": 0,\r\n"
				+ "    \"username\": \"hbhatia\",\r\n"
				+ "    \"firstName\": \"Hitika\",\r\n"
				+ "    \"lastName\": \"Bhatia\",\r\n"
				+ "    \"email\": \"hitika.bhatia@petstoreswagger.io\",\r\n"
				+ "    \"password\": \"petstore12345\",\r\n"
				+ "    \"phone\": \"012345678\",\r\n"
				+ "    \"userStatus\": 0\r\n"
				+ "  }\r\n"
				+ "]";
		
		return userDetails;
	}

}
