Feature: MoneyGaming

As a new moneygaming.com player

I want to be able to register using my full details
So that I can play online casino games

Acceptance Criteria: (not complete list):
•	Title, First Name, Surname, Date of Birth are mandatory
•	Player  must be over 18
•	Terms and Conditions should be accepted


  @runMoneyGAMing

Scenario:


Given  I am on the MoneyGaming website

When I select a title value from the dropdown as "Mr",

And I enter my first name as "Anakin" and surname as "Skywalker" in the form

And I check the tickbox with text 'I accept the Terms and Conditions and certify that I am over the age of 18.'

And Submit the form by clicking the  JOIN NOW button

Then A validation message with text "This field is required" should appears under the date of birth box
