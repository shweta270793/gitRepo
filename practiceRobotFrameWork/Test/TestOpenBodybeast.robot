*** Settings ***
Documentation    Suite description
Library  Selenium2Library
Resource  ../Keyword/Keywords.robot

*** Test Cases ***
Test Open BodyBeast
   Open Browser And Hit the URL of Bodybeast
   maximize browser window
   Scroll page
   Enter UserName and password for bodybeast user
   Verify title of bodybeast first page.
   #Click on OK on GetStarted page and also verify title
   #Fill details of step one of 2 in body beast App
   Click continue after fill weight and all
   Click on hugebeast start button.
   [Teardown]
