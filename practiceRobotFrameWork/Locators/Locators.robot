*** Variables ***
${BodybeastURL}  http://wave1bodybeastdevint.productpartners.com/
${TbbMainSiteUrl}   http://wave1tbbdevint.productpartners.com/home
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
${Click_View_Details_Bodybeast_Product}     //td[@id='573305_ViewDetailsTD']/a/span
${Select_body_beast_product}     //td[@id='573305_AddToCardTD']/a/span