*** Variables ***

${free_User_First_Name}    id=loginForm.firstName
${free_User_last_name}     id=loginForm.lastName
${free_user_email}         id=emailForm.email
${free_user_confirm_email}      id=emailForm.confirmEmail
${free_user_password}           name=passwordScreennameForm.password
${free_user_confirm_password}   name=passwordScreennameForm.confirmPassword
${free_user_screen_name}        id=screenName
${DATE_OF_BIRTH_MONTH_DROPDOWN_ID}   id=_TBBSIGNUP_WAR_signuprefactorportlet_birthdayMonth
${DATE_OF_BIRTH_DAY_DROPDOWN_ID}     id=_TBBSIGNUP_WAR_signuprefactorportlet_birthdayDay
${DATE_OF_BIRTH_YEAR_DROPDOWN_ID}    id=_TBBSIGNUP_WAR_signuprefactorportlet_birthdayYear
${free_user_GENDER}         id=gender
${free_phone}      id=phone
${SHIPPING_ADDRESS_1}     id=shippingAddressForm.street1
${SHIPPING_ADDRESS_2}     id=shippingAddressForm.street2
${SHIPPING_ADDRESS_CITY}      id=shippingAddressForm.city
${SHIPPING_ADDRESS_STATE}     id=addressRegionId
${SHIPPING_ADDRESS_ZIP}     id=shippingAddressForm.postalCode
${SHIPPING_ADDRESS_COUNTRY}    id=addressCountryId
${Coach_Reffered_Type}     id=coachLookupType
${Coach_value}      id=coachSearchField
${confirm_your_coach}     //a[@id='_TBBSIGNUP_WAR_signuprefactorportlet_lookupCoachBtn']/span
${TERMS_AND_CONDITIONS}    id=termsAndConditionsForm.termsAndConditionsAgree1
${captcha}      name=_TBBSIGNUP_WAR_signuprefactorportlet_captchaText
${click_free_submit_button}    id=free_submit
${I_HAVE_A_COACH_SELECT}      //span[@id='_TBBSIGNUP_WAR_signuprefactorportlet_selectMyCoachMessage']
${yes_i_want_corporate}       //span[@id='_TBBSIGNUP_WAR_signuprefactorportlet_coachSelectedMessage']/span
${Confirm_sign_up_as_free_user}     //div[@id='p_p_id_TBBSIGNUP_WAR_signuprefactorportlet_']/div/div/div/div/h3

# for bodybeast

${navifation_shop_page}   //div[@id='navigation']/ul/li[9]/a
${select_all_product_in_shop_page}     //div[@id='navigation']/ul/li[9]/ul/li[1]/a
${Click_View_Details_Bodybeast_Product}     //td[@id='381734_ViewDetailsTD']/a/span
${Select_body_beast_product_addTocart}     .//*[@id='productDetailContent']/table/tbody/tr[3]/td/table/tbody/tr/td[2]/table/tbody/tr[6]/td/div/a/span
${click_checkout_for_bodybeast_product}     //table[@id='Table1']/tbody/tr[3]/td/button[1]
${click_continue_after_filled_weight}       //div[@id='continueButton']/p
${huge_beast_bodybeast}        //div[@id='HugeBeast']/div[1][@class='boxheader']/div[1][@class='startButtonDiv yellowButtonGradient']/div[1][@class='startButton']/img



# p90x Certification site
${get_qualified_now_p90x}              //ul[@id='nav']/li[2]/a
${qualification_get_started_button}    //div[@id='role-based']/div[3]/a[@id='qual-buy-now-track']
 ${emai_for_checkout_p90x}        //div[@class='signfull flt-lft signfullAligned']/input
 ${Click_continue_after_enter_new_email_p90x}      id=non-member-submit-track
 ${new_user_first_name_p90x}     name=firstName
 ${new_user_last_name_p90x}       name=lastName
 ${new_user_Address1_p90x}         name=addressLine1
 ${new_user_Address2_p90x}           name=addressLine2
 ${new_user_City_p90x}             name=city
 ${new_user_state_p90x}             name=stateId
 ${new_user_zip_code_p90x}         name=zipCode
 ${new_user_phone_no_p90x}          name=phoneNumber
 ${continue_after_fill_shipping_info}   id=qual-ship-info-cont
 ${screen_name_new_user_p90x}          //input[@id='screenName']
 ${Password_new_user_p90x}              //input[@id='password']
 ${reenter_password_name_new_user_p90x}     //input[@id='repeatPassword']
 ${Reffered_coach_rep_no_new_user_p90x}     //select[@id='coach-search-criteria-type']
 ${Reffered_coach_filled_rep_no_new_user_p90x}      //input[@id='coach-search-criteria-value']
 ${Reffered_confirm_coach_new_user_p90x}            //a[contains(text(),'Confirm Coach')]
 ${Reffered_confirm_coach_text_new_user_p90x}           //span[@id='find-coach-success-message'][contains(text(),'Yes')]
${term_and_condition_p90x}              //input[@id='termsAndConditionsAcceptedChkBox']
${click_continue_Create_account_page_p90x}          //input[@id='qual-updateAccountProfileBtn']
${credit_card_no_p90x_payment_page}                        id=creditCardNumber
${credit_Card_security_pin_p90x}            //input[@name='securityCode']
${credit_Card_month_p90x}               //select[@id='monthpicker']
${credit_Card_year_p90x}                //select[@id='yearpicker']
${term_and_condition_payment_info_page}     id=paymentTermsAndConditionsChkBox
${click_purchase_on_payment_page_p90x}          id=qual-purchaseBtn
${verify_qualification_confirmation_page_p90x}      //a[@id='confirmation-qual-home-track']
${shop_button_global_navigation_p90x}               //ul[@id='nav']/li[4]/a
${shop_page_verification_text}              //h2[contains(@text='Shop all P90X Products')]
${select_a_product_on_p90x_shop}            //img[@title='P90X Colin Sleeveless Crew']
${select_size_on_p90x_shop_page}            //select[@id='attributes']
