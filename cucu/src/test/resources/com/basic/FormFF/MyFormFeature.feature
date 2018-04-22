Feature: Fill the Registration Form
As  an user u need to open the registration form and do the validation

Scenario: Validate create user multiple fields31
Given User need to be on Registration form page
When Enter followind data
	|FirstName	|LastName	  |Address  |EmailAddress             |phone|Gender|Hobbies|Languages|Skills           |
	|Tom			  |Hanks			|abscjdjds|shree.dey136@gmail.com	  |1234	|Female|Cricket###Hockey|Dutch    |Content Managment|
	|Jack			  |Danial			|hgygftfg |	 palashghosh13@gmail.com|5678 |Male  |Hockey |English  |C++              |