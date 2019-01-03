@samplefeature
Feature: As a user i want login yahoo.com


 Scenario: as user i want go login yahoo page
 
 Given As a user i want to login yahoo.com
 When i enter user id and valid password
 And i click on submit button
 Then  i login succesfully
 