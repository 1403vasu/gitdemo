package Testingframework.section17;

import org.testng.annotations.Test;

public class frame4 {
	public class TestNg {

		@Test
		public void carloan()
		{
			System.out.println("login page");
			
		}
		@Test(groups={"smoke"})
		public void webpage()
		{
			System.out.println("home login page");
			
		}
		@Test
		public void ex()
		{
			System.out.println("ex login page");
			
		}	
}
}
