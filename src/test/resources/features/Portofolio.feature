@Portofolio
Feature: Portofolio

  As a User i want to portofolio page

  @Positive
  Scenario: User wants to portofolio list page and see the list existing institutions
    Given user is on the landing page
    When user clicks the Portfolio icon button menu
    And user clicks the Portfolio list button in the dropdown menu
    And user searches for the institution field
    Then user sees the "Perbankan" institution
