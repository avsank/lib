@US1
Feature:verify both Students and Librarians login

	Scenario Outline: As a user, I should be able to login to the library app
		Given the user login as a "<userName>" and "<password>"
		When user click on submit button
		Then the user on "<page>"

		Examples:
			| userName  | password  | page      |
			| student   | password  | books     |
			| librarian | password2 | dashboard |