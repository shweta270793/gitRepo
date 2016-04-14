*** Settings ***
Documentation    Suite description
Library  Selenium2Library
Resource  ../Keyword/Keywords.robot
*** Test Cases ***
Test P90x Certification site
    open P90x site on browser
    maximize browser window
    Click the Find An Instructor Workshop button in the global navigation
   On the checkout page, enter a new email address to enroll a new customer P90x
   fill shiping information page in p90x
   Click continue button in P90x certification shipping info Page
   fill create account page in p90x
   Click continue button in P90x certtification account Page
   fill payment Information in P90x
   Click continue button in p90x certification imfo page
   Verify certification is purchased on P90X