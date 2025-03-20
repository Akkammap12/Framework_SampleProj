package pkg1;

import org.testng.annotations.Test;

public class createContactTest {
	@Test
	public void createContact() 
	{
		
		String URL = System.getProperty("url");	
		String BROWSER = System.getProperty("browser", "chrome");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
		System.out.println("====Executed createContact====");
	}
	@Test
	public void modifycreateContact() 
	{
	System.out.println("====Executed modifycreateContact====");
	}

}
