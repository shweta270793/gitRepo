*** Settings ***
Documentation    Suite description
Library  Selenium2Library
Resource  ../Locators/LocatorsBodybeast.robot

*** Keywords ***
Open Browser And Hit the URL of Bodybeast
       open browser  ${BodybeastURL}   firefox
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