package appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import pageObjects.LogIn_Page;
import utility.Constant;
import utility.ExcelUtils;

// Now this method does not need any arguments

public class SignIn_Action {

	private static final CharSequence sUserEmail = null;

	public void Execute(WebDriver driver) throws Exception {

		String sUserName = Constant.Username;
		String sPassword = Constant.Password;

		// Home_Page.lnk_MyAccount(driver).click();

		LogIn_Page.txtbx_UserName(driver).sendKeys(sUserName);

		LogIn_Page.txtbx_Password(driver).sendKeys(sPassword);

		LogIn_Page.btn_LogIn(driver).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		LogIn_Page.btn_clickUsers(driver).click();

		// driver.getCurrentUrl();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		ExcelUtils.setExcelFile(
				Constant.Path_TestData + Constant.File_TestData,
				"Export_Worksheet");
		int rowCount = ExcelUtils.getrowCount();
		System.out.println(rowCount);
		for (int i = 1; i <= rowCount; i++) {
			SearchAndCompareUser sc = new SearchAndCompareUser();
			sc.SearchAndCompareValue(i, driver);
		}
	}

}