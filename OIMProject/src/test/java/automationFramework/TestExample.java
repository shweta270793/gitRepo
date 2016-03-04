package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import appModules.SignIn_Action;
import utility.Constant;

public class TestExample {
	static SignIn_Action signIn_Action = new SignIn_Action();
	static WebDriver driver = null;

	@BeforeMethod
	public static void beforemethod() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get(Constant.URL);

	}

	// public static WebDriver driver;
	@Test
	public static void test() throws Exception {

		// This is to open the Excel file. Excel path, file name and the sheet
		// name are parameters to this method

		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		signIn_Action.Execute(driver);
	}

	// SignIn_Action.Execute(driver);

	@AfterMethod
	public static void afterMethod() {
		System.out
				.println("Login Successfully, now it is the time to Log Off buddy.");
		driver.close();

	}

}