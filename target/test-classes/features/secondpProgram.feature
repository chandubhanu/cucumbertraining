

Feature: Application Login

  @Mobile @Netbanking
 Scenario: User Page default login
 
 Given User is on NetBanking landing page
 When User login into application with user and password "1234"
 Then Home Page is displayed
 And Cards are displayed
@SmokeTest @Regression @Mortgage
 Scenario Outline: Mortgage Page  default login
 
 Given User is on NetBanking landing page
 When User login into application with "<Username>" and password "<password>" 
 Then Home Page is displayed
 And Cards are displayed
 
Examples:
  | Username   | password |
  | debituser  | hello12  |
  | credituser | hello13  |
 
 