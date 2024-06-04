package Testingframework.section17;

import org.testng.annotations.Test;

public class Frame2 {
	public class TestNg {

		@Test(groups= {"smoke"})
		public void output()
		{
			System.out.println("welcome");
			
		}
		@Test
		public void input()
		{
			System.out.println("come in");
			
		}
	}
}
