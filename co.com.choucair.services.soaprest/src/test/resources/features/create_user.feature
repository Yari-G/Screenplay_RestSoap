#Author: ygonzalezg@choucairtesting.com

Feature: Create an user on Regres.in
  I want to want to create an user

  Scenario: Creation an user
    When you create an user
      |name     |job	|
      |brandon	|java	|
    Then I should see the user created
