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
    ${emailidram}       Catenate    SEPARATOR=_      ${email}  ${date}
    ${emailid}       Catenate    SEPARATOR=_      ${emailidram}   ${randomEmail}

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
        ${generatedMAilId}    Create random mail id
        ${emailIdconfirm}           Catenate              SEPARATOR=@      ${generatedMAilId}   beachbodytest.com
        input text    ${free_user_email}          ${emailIdconfirm}
        input text   ${free_user_confirm_email}    ${emailIdconfirm}
        input text   ${free_user_password}             ${password}
        input text   ${free_user_confirm_password}          ${confirm_password}
        ${screenname}    generate random string    15    [LETTERS][NUMBERS]
        input text   ${free_user_screen_name}    ${screenname}

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
    wait until element is enabled     ${I_HAVE_A_COACH_SELECT}
     select from list by label    ${Coach_Reffered_Type}     	Coach I.D.
     input text     ${Coach_value}      994
     wait until element is enabled     ${confirm_your_coach}
     click element   ${confirm_your_coach}
     wait until element is enabled      ${yes_i_want_corporate}

Click on term and condition and captcha
         Click Element        ${TERMS_AND_CONDITIONS}
            input text   ${captcha}   1111
Click on submit form
       click button      ${click_free_submit_button}

Verify free user title
        wait until element is visible     ${Confirm_sign_up_as_free_user}



#  Bodybeast keywords
Click on shop and select bodybeast product
    MOUSE OVER     ${navifation_shop_page}
    wait until element is visible       ${select_all_product_in_shop_page}
    click element    ${select_all_product_in_shop_page}
    execute javascript   window.scrollTo(1000,3200)
    click element      ${Click_View_Details_Bodybeast_Product}
    click element      ${Select_body_beast_product_addTocart}

Click on checkout to purchase bodybeast
    click element     ${click_checkout_for_bodybeast_product}
Enter UserName and password for bodybeast user
        input text     xpath=//input[@class='email_field']    ${UserName}
        input password   //input[@id='_58_password']    ${Password}
        click button   //input[@id='continueButton']


Click on OK on GetStarted page and also verify title
        Title Should Be    Body Beast
        click element       //div[@id='okButton']/p
Fill details of step one of 2 in body beast App
        click element    //a[contains (text(),'Female')]
        clear element text      id=weightId
        input text     id=weightId      31
        clear element text     id=bodyFatId
        input text      id=bodyFatId      38
        click element    //div[@id='continueButton']/p
Click continue after fill weight and all
        click element    ${click_continue_after_filled_weight}
Click on hugebeast start button.
        click element     ${huge_beast_bodybeast}


#P90x Certification Site

open P90x site on browser
    open browser  ${p90x_Certification_URL}    firefox
Click the GET CERTIFIED NOW button in the global navigation
        click element     ${get_qualified_now_p90x}
        wait until element is visible     ${qualification_get_started_button}
        click element      ${qualification_get_started_button}

Click the Find An Instructor Workshop button in the global navigation
     click element      ${instructor_workshop_p90x}
     click element      ${register_instructor_workshop_p90x}
     click element      ${enrol_button_p90x}

On the checkout page, enter a new email address to enroll a new customer P90x
        ${generatedMAilId}    Create random mail id
        ${emailIdconfirm}           Catenate              SEPARATOR=@      ${generatedMAilId}   beachbodytest.com
        input text    ${emai_for_checkout_p90x}          ${emailIdconfirm}
        click button    ${Click_continue_after_enter_new_email_p90x}

fill shiping information page in p90x
        input text          ${new_user_first_name_p90x}       ${firstname}
        input text          ${new_user_last_name_p90x}        ${lastname}
        input text          ${new_user_Address1_p90x}         ${shipping_address1_value}
        input text          ${new_user_Address2_p90x}          ${shipping_address2_value}
        input text          ${new_user_City_p90x}            ${shipping_city_value}
        select from list by label          ${new_user_state_p90x}             ${shipping_state_value}
        input text          ${new_user_zip_code_p90x}         ${shipping_zip_value}
        input text          ${new_user_phone_no_p90x}          ${free_phone_value}


Click continue button in P90x Qualification shipping information Page
        click button        ${continue_after_fill_shipping_info}


fill create account page in p90x
        ${screenname_p90x}    generate random string    15    [LETTERS][NUMBERS]
        input text           ${screen_name_new_user_p90x}      ${screenname_p90x}
        input text             ${Password_new_user_p90x}        ${Password}
        input text              ${reenter_password_name_new_user_p90x}           ${Password}
        select from list by label       ${Reffered_coach_rep_no_new_user_p90x}          Rep Number
        input text               ${Reffered_coach_filled_rep_no_new_user_p90x}          ${reffering_coach_id}
        wait until element is visible           ${Reffered_confirm_coach_new_user_p90x}
        click element             ${Reffered_confirm_coach_new_user_p90x}
        wait until element is visible        ${Reffered_confirm_coach_text_new_user_p90x}
        click element           ${term_and_condition_p90x}


Click continue button in P90x Qualification account Page
        click button        ${click_continue_Create_account_page_p90x}

fill payment Information in P90x
        input text        ${credit_card_no_p90x_payment_page}      ${credit_card_no}
        input text          ${credit_Card_security_pin_p90x}        ${credit_Card_pin}
        select from list by label           ${credit_Card_month_p90x}           Jun
         select from list by label          ${credit_Card_year_p90x}            2020
       #  click element          ${term_and_condition_payment_info_page}


Click continue button in P90x Qualification payment information Page
        click button         ${click_purchase_on_payment_page_p90x}

Verify qualification is purchased on P90X
        wait until element is visible     ${verify_qualification_confirmation_page_p90x}        timeout=40s

Click on shop in the global navigation p90x
        click element       ${shop_button_global_navigation_p90x}
Verify that shop page is open and select a product
        wait until element is visible           ${shop_page_verification_text}
        click element                ${select_a_product_on_p90x_shop}
        select from list by label       ${select_size_on_p90x_shop_page}        M-purple
        click element           ${add_to_cart_p90x_Shop_page}

Verify that mini cart is open in p90x shop page
        wait until element is visible           ${view_mini_cart_p90x_shop_page}
        click element                            ${view_mini_cart_p90x_shop_page}
        click element                        ${click_chackout_on_cart_page_p90x}

Click continue button in P90x shop shipping info Page
        click button        ${click_continue_shipping_Info_shop_page_p90x}

Click continue button in P90x shop account Page
        click button        ${click_continue_shop_page_p90x}
Click continue button in p90x payment imfo page
        click button       ${click_purchase_on_payment_page_p90x}