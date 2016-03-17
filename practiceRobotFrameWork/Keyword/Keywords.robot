*** Settings ***
Documentation    Suite description
Library  Selenium2Library
Library   robot.libraries.DateTime
Library   robot.libraries.String
Resource  ../Locators/Locators.robot
Resource  ../Locators/Variables.robot

*** Keywords ***
Create random mail id
    ${randomEmail}    Generate Random String    5    [LOWER]
    ${date}    Get Current Date        result_format=%Y%m%d
    ${emailidram}       Catenate    SEPARATOR=\n      ${email}  ${date}
    ${emailid}       Catenate    SEPARATOR=\n      ${emailidram}   ${randomEmail}

    [Return]    ${emailid}


Open Browser And Hit the URL of Bodybeast
       open browser  ${BodybeastURL}   firefox
Open Browser And Hit the URL of Tbb
        open browser  ${TbbMainSiteUrl}    firefox

Scroll page
        execute javascript   window.scrollTo(1000,1000)
Enter UserName
        input text     xpath=//input[@class='email_field']    ${UserName}
Enter Password
        input password   //input[@id='_58_password']    ${Password}
Click Login button
        click button   //input[@id='continueButton']
Verify title of bodybeast first page.
        Title Should Be    Body Beast
Click on Not a Member button on Tbb
        click Element   //div[@id='banner']/div/ul/li[1]/a
Scroll page tbb sign up
        execute javascript   window.scrollTo(500,500)
Click on sign me up for free club
        click element   //div[@class='btn_signup_text_1 top_btn_signup_text_1']/a
Enter value of first name and last name
        input text   ${free_User_First_Name}     ${firstname}
        input text   ${free_user_last_name}       ${lastname}
Enter value of email and password
        ${screenname}    Create random mail id
        ${emailIdconfirm}           Catenate              SEPARATOR=@       ${screenname}    beachbodytest.com
        input text    ${free_user_email}          ${emailIdconfirm}
        input text   ${free_user_confirm_email}    ${emailIdconfirm}
        input text   ${free_user_screen_name}    ${screenname}
        input text   ${free_user_password}             ${password}
        input text   ${free_user_confirm_password}          ${confirm_password}

Enter Date of Birth
        select from list by label   ${DATE_OF_BIRTH_MONTH_DROPDOWN_ID}     January
        select from list by label   ${DATE_OF_BIRTH_DAY_DROPDOWN_ID}    12
        select from list by label   ${DATE_OF_BIRTH_YEAR_DROPDOWN_ID}   1980
fill phone and Gender Value
        select from list by label      ${free_user_GENDER}      Female
        input text      ${free_phone}      ${free_phone_value}
Fill Address
     Input Text     ${SHIPPING_ADDRESS_1}      ${SHIPPING_ADDRESS1_VALUE}
     Input Text     ${SHIPPING_ADDRESS_2}      ${SHIPPING_ADDRESS2_VALUE}
     Input Text     ${SHIPPING_ADDRESS_CITY}    ${SHIPPING_CITY_VALUE}
     select from list by label     ${SHIPPING_ADDRESS_STATE}      ${SHIPPING_STATE_VALUE}
     Input Text     ${SHIPPING_ADDRESS_ZIP}      ${SHIPPING_ZIP_VALUE}
     select from list by label         ${SHIPPING_ADDRESS_COUNTRY}     ${SHIPPING_COUNTRY_VALUE}
fill Coach reffered by
     select from list by label    ${Coach_Reffered_Type}     	Coach I.D.
     input text     ${Coach_value}      994
     click element   ${confirm_your_coach}
Click on term and condition and captcha
         Click Element        ${TERMS_AND_CONDITIONS}
            input text   ${captcha}   1111
Click on submit form
       click button      ${click_free_submit_button}


