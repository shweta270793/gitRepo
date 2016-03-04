package appModules;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.ComparePage;
import utility.ExcelUtils;

public class SearchAndCompareUser {
	int USR_LR_GUID_NO;
	int USR_BD_FIRST_NAME_NO;
	int USR_BD_LAST_NAME_NO;
	int USR_LR_EMAIL_NO;
	int USR_BD_PHONE_NUMBER_NO;
	int USR_LR_BD_DOB_NO;
	int USR_LR_GENDER_NO;
	int USR_LR_STATUS_NO;
	int USR_LR_CUSTOMER_TYPE_NO;
	int USR_LR_START_DATE_NO;
	int USR_BD_COACH_ID_NO;
	int USR_BD_CUSTOMER_ID_NO;
	int USR_BD_SPONSOR_ID_NO;
	int USR_BD_BILL_ADDRESS1_NO;
	int USR_BD_BILL_ADDRESS2_NO;
	int USR_BD_BILL_CITY_NO;
	int USR_BD_BILL_STATE_NO;
	int USR_BD_BILL_POSTAL_CODE_NO;
	int USR_BD_BILL_COUNTRY_NO;
	int USR_BD_SHIP_ADDRESS1_NO;
	int USR_BD_SHIP_ADDRESS2_NO;
	int USR_BD_SHIP_CITY_NO;
	int USR_BD_SHIP_STATE_NO;
	int USR_BD_SHIP_POSTAL_CODE_NO;
	int USR_BD_SHIP_COUNTRY_NO;
	int USR_LR_USERNAME_NO;
	int USR_ORGANIZATION_NO;
	int USR_LR_LOCALE_NO;
	int USR_BD_LEAD_WHEEL_TYPE_NO;
	int USR_BD_LEAD_WHEEL_LANGUAGE_NO;
	int USR_BD_COMPANY_NAME_NO;
	int USR_BD_BIZ_ADDRESS_NO;
	int USR_BD_BIZ_CITY_NO;
	int USR_BD_BIZ_STATE_NO;
	int USR_BD_BIZ_POSTAL_CODE_NO;
	int USR_BD_BIZ_COUNTRY_NO;

	// ExcelUtils excelutils = new ExcelUtils();
	public void SearchAndCompareValue(int rowNum, WebDriver driver)
			throws Exception {
		for (int j = 0; j < ExcelUtils.getColumnCount(); j++) {
			if (ExcelUtils.getCellData(0, j).equals("USR_LR_GUID")) {
				USR_LR_GUID_NO = j;
			}
			if (ExcelUtils.getCellData(0, j).equals("USR_BD_FIRST_NAME")) {
				USR_BD_FIRST_NAME_NO = j;
			}
			if (ExcelUtils.getCellData(0, j).equals("USR_BD_LAST_NAME")) {
				USR_BD_LAST_NAME_NO = j;
			}
			if (ExcelUtils.getCellData(0, j).equals("USR_LR_EMAIL")) {
				USR_LR_EMAIL_NO = j;
			}
			if (ExcelUtils.getCellData(0, j).equals("USR_BD_PHONE_NUMBER")) {
				USR_BD_PHONE_NUMBER_NO = j;
			}
			if (ExcelUtils.getCellData(0, j).equals("USR_LR_BD_DOB")) {
				USR_LR_BD_DOB_NO = j;
			}
			if (ExcelUtils.getCellData(0, j).equals("USR_LR_GENDER")) {
				USR_LR_GENDER_NO = j;
			}
			if (ExcelUtils.getCellData(0, j).equals("USR_LR_STATUS")) {
				USR_LR_STATUS_NO = j;
			}
			if (ExcelUtils.getCellData(0, j).equals("USR_LR_CUSTOMER_TYPE")) {
				USR_LR_CUSTOMER_TYPE_NO = j;
			}
			if (ExcelUtils.getCellData(0, j).equals("USR_LR_START_DATE")) {
				USR_LR_START_DATE_NO = j;
			}
			if (ExcelUtils.getCellData(0, j).equals("USR_BD_COACH_ID")) {
				USR_BD_COACH_ID_NO = j;
			}
			if (ExcelUtils.getCellData(0, j).equals("USR_BD_CUSTOMER_ID")) {
				USR_BD_CUSTOMER_ID_NO = j;
			}
			if (ExcelUtils.getCellData(0, j).equals("USR_BD_SPONSOR_ID")) {
				USR_BD_SPONSOR_ID_NO = j;
			}
			if (ExcelUtils.getCellData(0, j).equals("USR_BD_BILL_ADDRESS1")) {
				USR_BD_BILL_ADDRESS1_NO = j;
			}
			if (ExcelUtils.getCellData(0, j).equals("USR_BD_BILL_ADDRESS2")) {
				USR_BD_BILL_ADDRESS2_NO = j;
			}
			if (ExcelUtils.getCellData(0, j).equals("USR_BD_BILL_CITY")) {
				USR_BD_BILL_CITY_NO = j;
			}
			if (ExcelUtils.getCellData(0, j).equals("USR_BD_BILL_STATE")) {
				USR_BD_BILL_STATE_NO = j;
			}
			if (ExcelUtils.getCellData(0, j).equals("USR_BD_BILL_POSTAL_CODE")) {
				USR_BD_BILL_POSTAL_CODE_NO = j;
			}
			if (ExcelUtils.getCellData(0, j).equals("USR_BD_BILL_COUNTRY")) {
				USR_BD_BILL_COUNTRY_NO = j;
			}
			if (ExcelUtils.getCellData(0, j).equals("USR_BD_SHIP_ADDRESS1")) {
				USR_BD_SHIP_ADDRESS1_NO = j;
			}
			if (ExcelUtils.getCellData(0, j).equals("USR_BD_SHIP_ADDRESS2")) {
				USR_BD_SHIP_ADDRESS2_NO = j;
			}
			if (ExcelUtils.getCellData(0, j).equals("USR_BD_SHIP_CITY")) {
				USR_BD_SHIP_CITY_NO = j;
			}
			if (ExcelUtils.getCellData(0, j).equals("USR_BD_SHIP_STATE")) {
				USR_BD_SHIP_STATE_NO = j;
			}
			if (ExcelUtils.getCellData(0, j).equals("USR_BD_SHIP_POSTAL_CODE")) {
				USR_BD_SHIP_POSTAL_CODE_NO = j;
			}
			if (ExcelUtils.getCellData(0, j).equals("USR_BD_SHIP_COUNTRY")) {
				USR_BD_SHIP_COUNTRY_NO = j;
			}
			if (ExcelUtils.getCellData(0, j).equals("USR_LR_USERNAME")) {
				USR_LR_USERNAME_NO = j;
			}
			if (ExcelUtils.getCellData(0, j).equals("USR_ORGANIZATION")) {
				USR_ORGANIZATION_NO = j;
			}
			if (ExcelUtils.getCellData(0, j).equals("USR_LR_LOCALE")) {
				USR_LR_LOCALE_NO = j;
			}
			if (ExcelUtils.getCellData(0, j).equals("USR_BD_LEAD_WHEEL_TYPE")) {
				USR_BD_LEAD_WHEEL_TYPE_NO = j;
			}
			if (ExcelUtils.getCellData(0, j).equals(
					"USR_BD_LEAD_WHEEL_LANGUAGE")) {
				USR_BD_LEAD_WHEEL_LANGUAGE_NO = j;
			}
			if (ExcelUtils.getCellData(0, j).equals("USR_BD_COMPANY_NAME")) {
				USR_BD_COMPANY_NAME_NO = j;
			}
			if (ExcelUtils.getCellData(0, j).equals("USR_BD_BIZ_ADDRESS")) {
				USR_BD_BIZ_ADDRESS_NO = j;
			}
			if (ExcelUtils.getCellData(0, j).equals("USR_BD_BIZ_CITY")) {
				USR_BD_BIZ_CITY_NO = j;
			}
			if (ExcelUtils.getCellData(0, j).equals("USR_BD_BIZ_STATE")) {
				USR_BD_BIZ_STATE_NO = j;
			}
			if (ExcelUtils.getCellData(0, j).equals("USR_BD_BIZ_POSTAL_CODE")) {
				USR_BD_BIZ_POSTAL_CODE_NO = j;
			}
			if (ExcelUtils.getCellData(0, j).equals("USR_BD_BIZ_COUNTRY")) {
				USR_BD_BIZ_COUNTRY_NO = j;
			}

		}
		String UserEmail = ExcelUtils.getCellData(rowNum, USR_LR_EMAIL_NO);
		System.out.println(UserEmail);
		Thread.sleep(50000);
		ComparePage.searchuserEmail(driver).clear();
		ComparePage.searchuserEmail(driver).sendKeys(UserEmail);
		System.out.println(rowNum);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		ComparePage.btn_searchBT(driver).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		ComparePage.uidClck(driver).click();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		WebElement UserLogin = ComparePage.getUserLogin(driver);
		String fUserLogin = UserLogin.getText();
		String excelUserLogin = ExcelUtils.getCellData(rowNum, USR_LR_GUID_NO);
		System.out.println(excelUserLogin + "  " + fUserLogin);

		WebElement firstName = ComparePage.getfirstName(driver);
		String ffirstName = firstName.getText();
		String excelfirstName = ExcelUtils.getCellData(rowNum,
				USR_BD_FIRST_NAME_NO);
		System.out.println(excelfirstName + "   " + ffirstName);

		WebElement lastName = ComparePage.getLastName(driver);
		String flastName = lastName.getText();
		String excelLastName = ExcelUtils.getCellData(rowNum,
				USR_BD_LAST_NAME_NO);
		System.out.println(excelLastName + "   " + flastName);

		WebElement IdentityStatus = ComparePage.getIdentityStatus(driver);
		String fIdentityStatus = IdentityStatus.getText();
		String excelIdentityStatus = ExcelUtils.getCellData(rowNum,
				USR_LR_STATUS_NO);
		System.out.println(excelIdentityStatus + " " + fIdentityStatus);

		WebElement Email1 = ComparePage.getEmail(driver);
		String fEmail = Email1.getText();
		String excelEmail = ExcelUtils.getCellData(rowNum, 3);
		System.out.println(excelEmail + "   " + fEmail);

		// WebElement phoneNumber = ComparePage.getPhoneNumber(driver);
		// String fphoneNumber = phoneNumber.getText();
		// String excelphoneNumber = ExcelUtils.getCellData(rowNum,
		// USR_BD_PHONE_NUMBER_NO);
		// System.out.println(excelphoneNumber + "  " + fphoneNumber);

		WebElement Organisation = ComparePage.getOrganisation(driver);
		String fOrganisation = Organisation.getText();
		String excelOrganisation = ExcelUtils.getCellData(rowNum,
				USR_ORGANIZATION_NO);
		System.out.println(excelOrganisation + "   " + fOrganisation);

		WebElement AccountEffectiveStartDate = ComparePage
				.getAccountEffectiveStartDate(driver);
		String fAccountEffectiveStartDateDummy = AccountEffectiveStartDate
				.getText();
		String excelAccountEffectiveStartDateDummy = ExcelUtils.getCellData(
				rowNum, USR_LR_START_DATE_NO);
		// Date dateAccountEffectiveStartDate = new
		// SimpleDateFormat("d-mmm-yy").parse(excelAccountEffectiveStartDateDummy);
		// String excelAccountEffectiveStartDate = new
		// SimpleDateFormat("MM/dd/yyyy").format(dateAccountEffectiveStartDate);
		// System.out.println(excelAccountEffectiveStartDate);
		// Date datefAccountEffectiveStartDateDummy = new
		// SimpleDateFormat("d/MM/yyyy").parse(
		// fAccountEffectiveStartDateDummy);
		// String fAccountEffectiveStartDate = new
		// SimpleDateFormat("MM/dd/yyyy").format(datefAccountEffectiveStartDateDummy);
		// System.out.println(excelAccountEffectiveStartDate + "  "
		// + fAccountEffectiveStartDate);

		WebElement EffectiveProvisionDate = ComparePage
				.getEffectiveProvisionDate(driver);
		String fEffectiveProvisionDate = EffectiveProvisionDate.getText();
		// String excelEffectiveProvisionDate = ExcelUtils.getCellData(rowNum,
		// 8);
		System.out.println(fEffectiveProvisionDate);

		WebElement DateOfBirth = ComparePage.getDateOfBirth(driver);

		String fDateOfBirthDummy = DateOfBirth.getText();
		String excelDateOfBirthDummy = ExcelUtils.getCellData(rowNum,
				USR_LR_BD_DOB_NO);
		Date date = new SimpleDateFormat("dd-MM-yyyy")
				.parse(excelDateOfBirthDummy);
		String excelDateOfBirth = new SimpleDateFormat("MM/dd/yyyy")
				.format(date);
		System.out.println(excelDateOfBirth);
		Date dateDOB = new SimpleDateFormat("MM/dd/yyyy")
				.parse(fDateOfBirthDummy);
		String fDateOfBirth = new SimpleDateFormat("MM/dd/yyyy")
				.format(dateDOB);

		System.out.println(excelDateOfBirth + "  " + fDateOfBirth);

		WebElement Gender = ComparePage.getGender(driver);
		String fGender = Gender.getText();
		String excelGender = ExcelUtils.getCellData(rowNum, USR_LR_GENDER_NO);
		System.out.println(excelGender + "  " + fGender);

		WebElement CustomerType = ComparePage.getCustomerType(driver);
		String fCustomerType = CustomerType.getText();
		String excelCustomerType = ExcelUtils.getCellData(rowNum,
				USR_LR_CUSTOMER_TYPE_NO);
		System.out.println(excelCustomerType + " " + fCustomerType);

		WebElement CustomerId = ComparePage.getCustomerId(driver);
		String fCustomerId = CustomerId.getText();
		String excelCustomerUd = ExcelUtils.getCellData(rowNum,
				USR_BD_CUSTOMER_ID_NO);
		System.out.println(excelCustomerUd + "  " + fCustomerId);

		WebElement CoachId = ComparePage.getCoachId(driver);
		String fCoachId = CoachId.getText();
		String excelCoachId = ExcelUtils
				.getCellData(rowNum, USR_BD_COACH_ID_NO);
		System.out.println(excelCoachId + " " + fCoachId);

		WebElement SponserRepId = ComparePage.getSponserRepId(driver);
		String fSponserRepId = SponserRepId.getText();
		String excelSponserRepId = ExcelUtils.getCellData(rowNum,
				USR_BD_SPONSOR_ID_NO);
		System.out.println(excelSponserRepId + "  " + fSponserRepId);

		WebElement LeadWheelLanguage = ComparePage.getLeadWheelLanguage(driver);
		String fLeadWheelLanguage = LeadWheelLanguage.getText();
		String excelLeadWheelLanguage = ExcelUtils.getCellData(rowNum,
				USR_BD_LEAD_WHEEL_LANGUAGE_NO);
		System.out.println(excelLeadWheelLanguage + "  " + fLeadWheelLanguage);

		WebElement LeadWheelType = ComparePage.getLeadWheelType(driver);
		String fLeadWheelType = LeadWheelType.getText();
		String excelLeadWheelType = ExcelUtils.getCellData(rowNum,
				USR_BD_LEAD_WHEEL_TYPE_NO);
		System.out.println(excelLeadWheelType + "  " + fLeadWheelType);

		WebElement CompanyName = ComparePage.getCompanyName(driver);
		String fCompanyName = CompanyName.getText();
		String excelCompanyName = ExcelUtils.getCellData(rowNum,
				USR_BD_COMPANY_NAME_NO);
		System.out.println(excelCompanyName + "  " + fCompanyName);

		WebElement BillingAddress1 = ComparePage.getBillingAddress1(driver);
		String fBillingAddress1 = BillingAddress1.getText();
		String excelBillAddress1 = ExcelUtils.getCellData(rowNum,
				USR_BD_BILL_ADDRESS1_NO);
		System.out.println(excelBillAddress1 + "  " + fBillingAddress1);

		WebElement BillingAddress2 = ComparePage.getBillingAddress2(driver);
		String fBillingAddress2 = BillingAddress2.getText();
		String excelBillAddress2 = ExcelUtils.getCellData(rowNum,
				USR_BD_BILL_ADDRESS2_NO);
		System.out.println(excelBillAddress2 + " " + fBillingAddress2);

		WebElement BillingCity = ComparePage.getBillingCity(driver);
		String fBillingCity = BillingCity.getText();
		String excelBillinggCity = ExcelUtils.getCellData(rowNum,
				USR_BD_BILL_CITY_NO);
		System.out.println(excelBillinggCity + " " + fBillingCity);

		WebElement BillingState = ComparePage.getBillingState(driver);
		String excelBillingState = ExcelUtils.getCellData(rowNum,
				USR_BD_BILL_STATE_NO);
		String fBillingState = BillingState.getText();
		System.out.println(excelBillingState + "  " + fBillingState);

		WebElement BillingPostalCode = ComparePage.getBillingPostalCode(driver);
		String excelBillingPostalCode = ExcelUtils.getCellData(rowNum,
				USR_BD_BILL_POSTAL_CODE_NO);
		String fBillingPostalCode = BillingPostalCode.getText();
		System.out.println(excelBillingPostalCode + "   " + fBillingPostalCode);

		WebElement BillingCountry = ComparePage.getBillingCountry(driver);
		String fBillingCountry = BillingCountry.getText();
		String excelBillingCountry = ExcelUtils.getCellData(rowNum,
				USR_BD_BILL_COUNTRY_NO);
		System.out.println(excelBillingCountry + " " + fBillingCountry);

		WebElement ShippingAddress1 = ComparePage.getShippingAddress1(driver);
		String fShippingAddress1 = ShippingAddress1.getText();
		String excelShippingAddress1 = ExcelUtils.getCellData(rowNum,
				USR_BD_SHIP_ADDRESS1_NO);
		System.out.println(excelShippingAddress1 + "  " + fShippingAddress1);

		WebElement ShippingAddress2 = ComparePage.getShippingAddress2(driver);
		String fShippingAddress2 = ShippingAddress2.getText();
		String excelShippingAddress2 = ExcelUtils.getCellData(rowNum,
				USR_BD_SHIP_ADDRESS2_NO);
		System.out.println(excelShippingAddress2 + "   " + fShippingAddress2);

		WebElement ShippingCity = ComparePage.getShippingCity(driver);
		String fShippingCity = ShippingCity.getText();
		String excelShippingCity = ExcelUtils.getCellData(rowNum,
				USR_BD_SHIP_CITY_NO);
		System.out.println(excelShippingCity + "  " + fShippingCity);

		WebElement ShippingState = ComparePage.getShippingState(driver);
		String fShippingState = ShippingState.getText();
		String excelShippingState = ExcelUtils.getCellData(rowNum,
				USR_BD_SHIP_STATE_NO);
		System.out.println(excelShippingState + "  " + fShippingState);

		WebElement ShippingPostalCode = ComparePage
				.getShippingPostalCode(driver);
		String fShippingPostalCode = ShippingPostalCode.getText();
		String excelShippingPostalCode = ExcelUtils.getCellData(rowNum,
				USR_BD_SHIP_POSTAL_CODE_NO);
		System.out.println(excelShippingPostalCode + "   "
				+ fShippingPostalCode);

		WebElement ShippingCountry = ComparePage.getShippingCountry(driver);
		String fShippingCountry = ShippingCountry.getText();
		String excelShippingCountry = ExcelUtils.getCellData(rowNum,
				USR_BD_SHIP_COUNTRY_NO);
		System.out.println(excelShippingCountry + " " + fShippingCountry);

		WebElement BusinessAddress1 = ComparePage.getBusinessAddress1(driver);
		String fBusinessAddress1 = BusinessAddress1.getText();
		String excelBussinessAddress1 = ExcelUtils.getCellData(rowNum,
				USR_BD_BIZ_ADDRESS_NO);
		System.out.println(excelBussinessAddress1 + "  " + fBusinessAddress1);

		WebElement BusinessAddress2 = ComparePage.getBusinessAddress2(driver);
		String fBusinessAddress2 = BusinessAddress1.getText();
		// String excelBussinessAddress2 = ExcelUtils.getCellData(rowNum, );
		// System.out.println(fBusinessAddress2);

		WebElement BusinessCity = ComparePage.getBusinessCity(driver);
		String fBusinessCity = BusinessCity.getText();
		String excelBussinessCity = ExcelUtils.getCellData(rowNum,
				USR_BD_BIZ_CITY_NO);
		System.out.println(excelBussinessCity + "  " + fBillingCity);

		WebElement BusinessState = ComparePage.getBusinessState(driver);
		String fBusinessState = BusinessState.getText();
		String excelBussinessState = ExcelUtils.getCellData(rowNum,
				USR_BD_BIZ_STATE_NO);
		System.out.println(excelBussinessState + "  " + fBusinessState);

		WebElement BusinessPostalCode = ComparePage
				.getBusinessPostalCode(driver);
		String fBusinessPostalCode = BusinessPostalCode.getText();
		String excelBussinessPostalCode = ExcelUtils.getCellData(rowNum,
				USR_BD_BIZ_POSTAL_CODE_NO);
		System.out.println(excelBussinessPostalCode + "  "
				+ fBusinessPostalCode);

		WebElement BusinessCountry = ComparePage.getBusinessCountry(driver);
		String fBusinessCountry = BusinessCountry.getText();
		String excelBussinessCountry = ExcelUtils.getCellData(rowNum,
				USR_BD_BIZ_COUNTRY_NO);
		System.out.println(excelBussinessCountry + "  " + fBusinessCountry);

		WebElement TermAndCondition = ComparePage.getTermAndCondition(driver);
		String fTermAndCondition = TermAndCondition.getText();
		// String excelTermAndCondition = ExcelUtils.getCellData(rowNum, 22);
		System.out.println(fTermAndCondition);

		WebElement CustomLocale = ComparePage.getCustomLocale(driver);
		String fCustomLocale = CustomLocale.getText();
		String excelCustomLocale = ExcelUtils.getCellData(rowNum,
				USR_LR_LOCALE_NO);
		System.out.println(excelCustomLocale + "  " + fCustomLocale);

		WebElement UserName = ComparePage.getUserName(driver);
		String fUserName = UserName.getText();
		String excelUserName = ExcelUtils.getCellData(rowNum,
				USR_LR_USERNAME_NO);
		System.out.println(excelUserName + "  " + fUserName);

		if ((excelUserLogin.equalsIgnoreCase(fUserLogin))
				&& (excelfirstName.equalsIgnoreCase(ffirstName))
				&& (excelLastName.equalsIgnoreCase(flastName))

				&& (excelEmail.equalsIgnoreCase(fEmail))

				&& (excelIdentityStatus.equalsIgnoreCase(fIdentityStatus))
				&& (excelOrganisation.equalsIgnoreCase(fOrganisation))
				&& (excelGender.equalsIgnoreCase(fGender))
				&& (excelCustomerType.equalsIgnoreCase(fCustomerType))
				&& (excelCustomerUd.equalsIgnoreCase(fCustomerId))
				&& (excelCoachId.equalsIgnoreCase(fCoachId))
				&& (excelSponserRepId.equals(fSponserRepId))

				&& (excelLeadWheelLanguage.equalsIgnoreCase(fLeadWheelLanguage))
				&& (excelLeadWheelType.equalsIgnoreCase(fLeadWheelType))
				&& (excelCompanyName.equalsIgnoreCase(fCompanyName))
				&& (excelBillAddress1.equalsIgnoreCase(fBillingAddress1))

				&& (excelBillAddress2.equalsIgnoreCase(fBillingAddress2))

				&& (excelBillinggCity.equalsIgnoreCase(fBillingCity))
				&& (excelBillingState.equalsIgnoreCase(fBillingState))

				&& (excelBillingPostalCode.equalsIgnoreCase(fBillingPostalCode))
				&& (excelBillingCountry.equalsIgnoreCase(fBillingCountry))
				&& (fBillingCountry.equalsIgnoreCase(fBillingCountry))
				&& (excelShippingAddress1.equalsIgnoreCase(fShippingAddress1))
				&& (excelShippingAddress2.equalsIgnoreCase(fShippingAddress2))
				&& (excelShippingCity.equalsIgnoreCase(fShippingCity))
				&& (excelShippingState.equalsIgnoreCase(fShippingState))
				&& (excelShippingPostalCode
						.equalsIgnoreCase(fShippingPostalCode))
				&& (excelShippingCountry.equalsIgnoreCase(fShippingCountry))
				// &&
				// (excelBussinessAddress1.equalsIgnoreCase(fBusinessAddress1))
				&& (excelBussinessCity.equalsIgnoreCase(fBusinessCity))
				&& (excelBussinessState.equalsIgnoreCase(fBusinessState))
				&& (excelBussinessPostalCode
						.equalsIgnoreCase(fBusinessPostalCode))
				&& (excelBussinessCountry.equalsIgnoreCase(fBusinessCountry))
				&& (excelCustomLocale.equalsIgnoreCase(fCustomLocale))
				&& (excelUserName.equalsIgnoreCase(fUserName))
			//	&&(excelDateOfBirth.equalsIgnoreCase(fDateOfBirth))
				) {
			System.out.println("pass");

			ExcelUtils.setCellData("pass", rowNum, 37);
		} else {
			System.out.println("fail");

			ExcelUtils.setCellData("fail", rowNum, 37);
		}
		ComparePage.closeTab(driver).click();
	}

}