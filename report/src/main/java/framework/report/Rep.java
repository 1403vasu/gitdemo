package framework.report;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Rep {
	ExtentReports er;
	@BeforeMethod
	public void config() {
	String path = System.getProperty("user.dir")+"\\reports\\index.html";
	 ExtentSparkReporter rep = new ExtentSparkReporter(path);
	 rep.config().setReportName("Web automation");
	 rep.config().setDocumentTitle("Test Result");
	  er = new ExtentReports();
	 er.attachReporter(rep);
	 er.setSystemInfo("Tester", "Vasumathi");
		
	}
	@Test
	public void testmethod() {
		er.createTest("Demo");
		 WebDriver d = new ChromeDriver();
		 d.get("https://rahulshettyacademy.com/");
		 d.manage().window().maximize();
		 d.quit();
		 er.flush();
	}
}
