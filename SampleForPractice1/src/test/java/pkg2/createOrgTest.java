package pkg2;

import org.testng.annotations.Test;

public class createOrgTest {
	@Test
	public void createOrg() 
	{
		
		String URL = System.getProperty("url");	
		String BROWSER = System.getProperty("browser", "chrome");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
	System.out.println("====Executed createOrgTest====");
	
	}
	@Test
	public void modifycreateOrg() 
	{
		
	System.out.println("====Executed modifycreateOrg====");
	}

}
