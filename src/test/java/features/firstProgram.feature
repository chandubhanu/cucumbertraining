

Feature: Application Login
Background:
 Given setup the entries in database
 And launch the browser from config variables
 And Hit the home page url of banking site


 @Regression
 Scenario: Admin Page default login
 Given User is on NetBanking landing page
 When User login into application with "admin" and password "1234"
 Then Home Page is displayed
 And Cards are displayed
#Resusable
  @Mobile
 Scenario: User Page default login
 
 Given User is on NetBanking landing page
 When User login into application with user and password "1234"
 Then Home Page is displayed
 And Cards are displayed
@SmokeTest @Regression
 Scenario Outline: User Page default login
 
 Given User is on NetBanking landing page
 When User login into application with "<Username>" and password "<password>" 
 Then Home Page is displayed
 And Cards are displayed
 
Examples:
  | Username   | password |
  | debituser  | hello12  |
  | credituser | hello13  |
 
 @SmokeTest
 Scenario Outline: User Page default Sign up
 
 Given User is on Practice landing page
 When User Signup into application
 | Bhanu |
 | Prakash |
 | Bhanu123@gmail.com |
 | 9999999999|
 Then Home Page is displayed
 And Cards are displayed