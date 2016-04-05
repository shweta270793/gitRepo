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
   fill create account page in p90x
   fill payment Information in P90x
