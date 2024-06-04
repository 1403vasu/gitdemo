package Testingframework.section17;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class frame3 {
		@Test(groups= {"smoke"})
		public void homeloan()
		{
			System.out.println("login page");
			
		}
	

		@Parameters({"URL"})
		@Test
		public void webpages(String url)
		{
			System.out.println("home login page ");
			System.out.println(url);	
		}
		
		@Test(dependsOnMethods = {"homeloan"})
		public void ex()
		{
			System.out.println("ex login page");
			
		}
}

