@sec_opi
Feature: Second Opinion

  @SmokeTest
  Scenario: To validate the second opinion 
    Given open the browser, enter the sparsh hospital url
    And select yashwanthpur hospital from the hospital dropdown
    When users clicks the second opinion link
    And user enters the firstname,lastname,phonno, email
    And upload the report and enter a message and clicks the send button
    Then Thankyou message should be displayed
    And bank info should be available in the page

#  @tag2
 # Scenario Outline: Title of your scenario outline
  #  Given I want to write a step with <name>
   # When I check for the <value> in step
   # Then I verify the <status> in step

    #Examples: 
     # | name  | value | status  |
     # | name1 |     5 | success |
     # | name2 |     7 | Fail    |
