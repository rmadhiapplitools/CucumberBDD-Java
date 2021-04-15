Feature: As a user, I want to Navigate to url and test applitools check

  @test
  Scenario: Successful Navigate to the Page
    Given I am on "TestPage" page
    Then I will take visual screenshot "MyTestPageCheckpoint"
 
#
#  @test
#  Scenario: Successful login using valid account
#    Given I am on "TestPage" page
