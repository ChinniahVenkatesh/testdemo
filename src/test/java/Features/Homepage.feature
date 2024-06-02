#Author: your.email@your.domain.com

Feature: Validating the Home-page 



Scenario: Validating the product logo is displayed 

Given User is on the greenkart homepage "https://rahulshettyacademy.com/seleniumPractise/#/"
When Maximize the home_page
Then Validate the greenkart logo is displayed or not 
And Validate the greenkart logo is clickable 



Scenario: Validating the search-box
When User locates the searchbox field
Then Enter the product name "Tomato"




