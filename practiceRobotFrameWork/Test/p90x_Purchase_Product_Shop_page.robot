*** Settings ***
Documentation    Suite description
Library  Selenium2Library
Resource  ../Keyword/Keywords.robot
*** Test Cases ***
Test P90x Certification site
    open P90x site on browser
    maximize browser window
   Click on shop in the global navigation p90x
   Verify that shop page is open and select a product
   On the checkout page, enter a new email address to enroll a new customer P90x
   fill shiping information page in p90x
   fill create account page in p90x
   fill payment Information in P90x
  [Teardown]