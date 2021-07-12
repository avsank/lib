@us2
Feature: As a user
	I should be able to logout from the library app.

	Scenario Outline:verify both Students and librarians  login

		Given the user login as a "<userName>" and "<password>"
		When user click on submit button
		And user clicks on userName
		Then users click to logout button

		Examples:
			| userName  | password  |
			| student   | password  |
			| librarian | password2 |
