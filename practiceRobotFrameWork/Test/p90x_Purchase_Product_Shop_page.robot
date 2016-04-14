*** Settings ***
Documentation    Suite description
Library  Selenium2Library
Resource  ../Keyword/Keywords.robot
*** Test Cases ***
Test P90x shop
   open P90x site on browser
   maximize browser window
   Click on shop in the global navigation p90x
   Verify that shop page is open and select a product
   Verify that mini cart is open in p90x shop page
   On the checkout page, enter a new email address to enroll a new customer P90x
   fill shiping information page in p90x
   Click continue button in P90x shop shipping info Page
   fill create account page in p90x
   Click continue button in P90x shop account Page
   fill payment Information in P90x
   Click continue button in p90x payment imfo page
    Verify product is purchased on P90X
  [Teardown]