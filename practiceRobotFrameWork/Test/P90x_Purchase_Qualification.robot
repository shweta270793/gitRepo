*** Settings ***
Documentation    Suite description
Library  Selenium2Library
Resource  ../Keyword/Keywords.robot
*** Test Cases ***
Test P90x Certification site
    open P90x site on browser
    maximize browser window
   Click the GET CERTIFIED NOW button in the global navigation
   On the checkout page, enter a new email address to enroll a new customer P90x
   fill shiping information page in p90x
   Click continue button in P90x Qualification shipping information Page
   fill create account page in p90x
   Click continue button in P90x Qualification account Page
   fill payment Information in P90x
   Click continue button in P90x Qualification payment information Page
   Verify qualification is purchased on P90X
