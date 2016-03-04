package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn_Page {

	static WebElement element = null;

	public static WebElement txtbx_UserName(WebDriver driver) {

		element = driver.findElement(By.id("pt1:_pt_it1::content"));

		return element;

	}

	public static WebElement txtbx_Password(WebDriver driver) {

		element = driver.findElement(By.id("pt1:_pt_it2::content"));

		return element;

	}

	public static WebElement btn_LogIn(WebDriver driver) {

		element = driver.findElement(By.id("pt1:_pt_cb1"));

		return element;

	}

	public static WebElement btn_clickUsers(WebDriver driver) {

		element = driver.findElement(By.id("pt1:_lar:0:cil10"));

		return element;

	}

}