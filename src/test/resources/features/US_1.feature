
@US1
Feature:verify both Students and Librarians login

	Scenario Outline: As a user, I should be able to login to the library app
		Given the user login as a <role>
		Then the user on <page>

		Examples:
		|role|page|
		|student|books|
		|librarian|Dashboard|