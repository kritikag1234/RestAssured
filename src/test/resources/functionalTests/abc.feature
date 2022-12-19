#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file


  @tag2
  Scenario Outline: Find about your pets
    Given user wants to know the "<status>" of the pet
    When Get api is called using "<URI>" with  "<status>"
    Then I verify the <code> in step

    Examples: 
      | status  | URI | code  |
      | available |     /pet/findByStatus  | 200 |
  
