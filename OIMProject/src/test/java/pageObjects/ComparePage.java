package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComparePage {
	static WebElement element = null;

	public static WebElement searchuserEmail(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("//table[@id='pt1:_d_reg:region0:1:qryId1:vPanel4']/tbody/tr/td/span[@id='pt1:_d_reg:region0:1:qryId1:value40']/input[@id='pt1:_d_reg:region0:1:qryId1:value40::content']"));
		return element;
	}

	public static WebElement btn_searchBT(WebDriver driver) {
		element = driver.findElement(By
				.id("pt1:_d_reg:region0:1:qryId1::search"));
		return element;
	}

	public static WebElement uidClck(WebDriver driver) {
		element = driver.findElement(By
				.xpath("//tbody/tr/td[2][@class='xxv']/a"));
		return element;
	}

	public static WebElement getUserLogin(WebDriver driver) {
		element = driver.findElement(By
				.xpath("//tr[@id='pt1:_d_reg:region1:1:plam1']/td[2]"));
		return element;
	}

	public static WebElement getfirstName(WebDriver driver) {
		element = driver.findElement(By
				.xpath("//tr[@id='pt1:_d_reg:region1:1:plam43']/td[2]"));
		return element;
	}

	public static WebElement getIdentityStatus(WebDriver driver) {
		element = driver.findElement(By
				.xpath("//tr[@id='pt1:_d_reg:region1:1:plam2']/td[2]"));
		return element;
	}

	public static WebElement getLastName(WebDriver driver) {
		element = driver.findElement(By
				.xpath("//tr[@id='pt1:_d_reg:region1:1:plam17']/td[2]"));
		return element;
	}

	public static WebElement getEmail(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='pt1:_d_reg:region1:1:plam34']/td[2]"));
		// tr[@id='pt1:_d_reg:region1:1:plam2']/td[2]
		return element;
	}

	public static WebElement getOrganisation(WebDriver driver) {
		element = driver.findElement(By
				.xpath("//tr[@id='pt1:_d_reg:region1:1:plam20']/td[2]"));
		return element;
	}

	public static WebElement getAccountEffectiveStartDate(WebDriver driver) {
		element = driver.findElement(By
				.xpath("//tr[@id='pt1:_d_reg:region1:1:plam45']/td[2]"));

		return element;
	}

	public static WebElement getEffectiveProvisionDate(WebDriver driver) {
		element = driver.findElement(By
				.xpath("//tr[@id='pt1:_d_reg:region1:1:plam46']/td[2]"));

		return element;
	}

	public static WebElement getDateOfBirth(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("//tr[@id='pt1:_d_reg:region1:1:dtrt_dc_2739489992']/td[2]"));

		return element;
	}

	public static WebElement getGender(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(" //tr[@id='pt1:_d_reg:region1:1:dtrt_dc_7933827347']/td[2]"));

		return element;
	}

	public static WebElement getCustomerType(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("//tr[@id='pt1:_d_reg:region1:1:dtrt_dc_347559110']/td[2]"));

		return element;
	}

	public static WebElement getCustomerId(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("//tr[@id='pt1:_d_reg:region1:1:dtrt_dc_3310033608']/td[2]"));

		return element;
	}

	public static WebElement getCoachId(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("//tr[@id='pt1:_d_reg:region1:1:dtrt_dc_229778426']/td[2]"));

		return element;
	}

	public static WebElement getSponserRepId(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("//tr[@id='pt1:_d_reg:region1:1:dtrt_dc_2139552301']/td[2]"));

		return element;
	}

	public static WebElement getLeadWheelLanguage(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("//tr[@id='pt1:_d_reg:region1:1:dtrt_dc_9223822827']/td[2]"));

		return element;
	}

	public static WebElement getLeadWheelType(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("//tr[@id='pt1:_d_reg:region1:1:dtrt_dc_1711801741']/td[2]"));

		return element;
	}

	public static WebElement getCompanyName(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("//tr[@id='pt1:_d_reg:region1:1:dtrt_dc_5093730647']/td[2]"));

		return element;
	}

	public static WebElement getBillingAddress1(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("//tr[@id='pt1:_d_reg:region1:1:dtrt_dc_1021430801']/td[2]"));

		return element;
	}

	public static WebElement getBillingAddress2(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("//tr[@id='pt1:_d_reg:region1:1:dtrt_dc_1190533619']/td[2]"));

		return element;
	}

	public static WebElement getBillingCity(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("//tr[@id='pt1:_d_reg:region1:1:dtrt_dc_6275828442']/td[2]"));

		return element;
	}

	public static WebElement getBillingState(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("//tr[@id='pt1:_d_reg:region1:1:dtrt_dc_3331188893']/td[2]"));

		return element;
	}

	public static WebElement getBillingPostalCode(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("//tr[@id='pt1:_d_reg:region1:1:dtrt_dc_6151453442']/td[2]"));

		return element;
	}

	public static WebElement getBillingCountry(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("//tr[@id='pt1:_d_reg:region1:1:dtrt_dc_200601481']/td[2]"));

		return element;
	}

	public static WebElement getShippingAddress1(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("//tr[@id='pt1:_d_reg:region1:1:dtrt_dc_5442848918']/td[2]"));

		return element;
	}

	public static WebElement getShippingAddress2(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("//tr[@id='pt1:_d_reg:region1:1:dtrt_dc_8522060564']/td[2]"));

		return element;
	}

	public static WebElement getShippingCity(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("//tr[@id='pt1:_d_reg:region1:1:dtrt_dc_2819567499']/td[2]"));

		return element;
	}

	public static WebElement getShippingState(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("//tr[@id='pt1:_d_reg:region1:1:dtrt_dc_5245066547']/td[2]"));

		return element;
	}

	public static WebElement getShippingPostalCode(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("//tr[@id='pt1:_d_reg:region1:1:dtrt_dc_1172009376']/td[2]"));

		return element;
	}

	public static WebElement getShippingCountry(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("//tr[@id='pt1:_d_reg:region1:1:dtrt_dc_8042849590']/td[2]"));

		return element;
	}

	public static WebElement getBusinessAddress1(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("//tr[@id='pt1:_d_reg:region1:1:dtrt_dc_4712243566']/td[2]"));

		return element;
	}

	public static WebElement getBusinessAddress2(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("//tr[@id='pt1:_d_reg:region1:1:dtrt_dc_5805915553']/td[2]"));

		return element;
	}

	public static WebElement getBusinessCity(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("//tr[@id='pt1:_d_reg:region1:1:dtrt_dc_6264173572']/td[2]"));

		return element;
	}

	public static WebElement getBusinessState(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("//tr[@id='pt1:_d_reg:region1:1:dtrt_dc_355590081']/td[2]"));

		return element;
	}

	public static WebElement getBusinessPostalCode(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("//tr[@id='pt1:_d_reg:region1:1:dtrt_dc_9163547588']/td[2]"));

		return element;
	}

	public static WebElement getBusinessCountry(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("//tr[@id='pt1:_d_reg:region1:1:dtrt_dc_8926428526']/td[2]"));

		return element;
	}

	public static WebElement getTermAndCondition(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("//tr[@id='pt1:_d_reg:region1:1:dtrt_dc_6751640615']/td[2]"));

		return element;
	}

	public static WebElement getCustomLocale(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("//tr[@id='pt1:_d_reg:region1:1:dtrt_dc_1381887640']/td[2]"));

		return element;
	}

	public static WebElement closeTab(WebDriver driver) {
		element = driver.findElement(By.className("xx2"));
		return element;

	}

	public static WebElement getPhoneNumber(WebDriver driver) {
		element = driver.findElement(By
				.xpath("//tr[@id='pt1:_d_reg:region1:0:plam6']/td[2]"));
		return element;
	}

	public static WebElement getUserName(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("//tr[@id='pt1:_d_reg:region1:1:dtrt_dc_7431171235']/td[2]"));
		return element;
	}
}
