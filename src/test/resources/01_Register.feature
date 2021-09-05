@register
Feature: Register

  @valid
  Scenario Outline: User should register successfully
    Given I open website
    When I open Register page
    When I fill in first name text box with value "<firstName>"
    When I fill in last name text box with value "<lastName>"
    When I fill in email text box
    When I fill in company name text box
      | companyName |
      | ABC company |
    When I fill in Password text box with value "<passWord>"
    When I fill in Confirm Password text box with value "<passWord>"
    Examples:
      | firstName | lastName | passWord |
      | Kili      | Nguyen   | 123456   |

  @invalid
  Scenario Outline: User shouldn't register successfully without password
    Given I open website
    When I open Register page
    When I fill in first name text box with value "<firstName>"
    When I fill in last name text box with value "<lastName>"
    When I fill in email text box
    Examples:
      | firstName | lastName |
      | Kili      | Nguyen   |