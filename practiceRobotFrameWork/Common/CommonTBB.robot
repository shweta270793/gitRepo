*** Settings ***
Documentation    Suite description
Library  Selenium2Library
Resource  ../Keyword/Keywords.robot

*** Keywords ***
TBB Free Sign Up Flow
    Open Browser And Hit the URL of Tbb
    maximize browser window
    Click on Not a Member button on Tbb
    Scroll page tbb sign up
    Click on sign me up for free club
    Enter value of first name and last name
    Enter value of email and password
    Enter Date of Birth
    fill phone and Gender Value
    Fill Address
    fill Coach reffered by
    Click on term and condition and captcha
    Click on submit form
    Verify free user title

Body Beast Common Flows
    Click on shop and select bodybeast product


