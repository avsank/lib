@US_3
Feature:As a user, I should be able to  see several modules once I login.

  Scenario Outline :        Students should have access to 2 modules
    Given the user login as a "<userName>" and "<password>"
    When user click on submit button
    Then the user should see following modules
      | Books           |
      | Borrowing Books |

    Examples:
      | userName | password |
      | student  | password |


  Scenario Outline:    Librarians  should have access to 3 modules
    Given the user login as a "<userName>" and "<password>"
    When user click on submit button
    Then the librarian should see following modules
      | Dashboard       |
      | Books           |
      | Borrowing Books |


    Examples:
      | userName  | password  |
      | librarian | password2 |