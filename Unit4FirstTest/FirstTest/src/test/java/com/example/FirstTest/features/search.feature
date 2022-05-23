Feature: Google search

  Scenario Outline: I want to search on google site
    Given I am on the google flight site
    When I enter my "<destination>" as a keyword
    Then I should see search results page

    Examples:
    | destination     |
    | Cape Town    |
