*** Settings ***
Documentation    Suite description
Library  Selenium2Library
Resource  ../Keyword/Keywords.robot

*** Test Cases ***
Test Open BodyBeast
   Open Browser And Hit the URL of Bodybeast
   maximize browser window
   Scroll page
   Enter UserName
   Enter Password
   Click Login button
   Verify title of bodybeast first page.
   [Teardown]
