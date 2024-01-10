@Career
Feature: Career

  @Negative
  As a User i want to career page
  Scenario: User apply job without fill birth date field
    Given user is on the landing page
    When user clicks the Career button menu
    And user clicks the Apply Job on selected job
    And user click the Apply Now on job page
    When user input "Alfian Saputra" as a name, "alfiansaputra@example.com" as a email, "088888888" as a phone, "Freelancer UI/UX" as a Current Company, "Universitas XXX" as a University,"Depok, Jawa Barat" as a birth place, "Jalan Perjuangan No 18" as a current address, "I want to apply this job" as a about
    And user select Gender option in Gender dropdown menu
    And user select Last Education option in Last Education dropdown menu
    And user select Join Date option in Join Date dropdown menu
    And user select Which Do You Prefer? option in Which Do You Prefer? dropdown menu
    And user select How do you know opportuny? option in How do you know opportuny? dropdown menu
    And user select Are you a smoker? option in Are you a smoker? dropdown menu
    And user upload valid file "TemuBakat-AlfianAditya.pdf"
    And user clicks Apply Now button
    Then user sees notification error "Field is required"


  @Negative
  Scenario: User apply job with large file
    Given user is on the landing page
    When user clicks the Career button menu
    And user clicks the Apply Job on selected job
    When user input "Full name" as a name, "Email Address" as a email, "Phone" as a phone, "Current Company" as a Current Company, "University Education" as a University,"Birth Place" as a birth place, "Current Address" as a current address, "About" as a about
    And user select Gender option in Gender dropdown menu
    And user select Last Education option in Last Education dropdown menu
    And user select Join Date option in Join Date dropdown menu
    And user select Which Do You Prefer? option in Which Do You Prefer? dropdown menu
    And user select How do you know opportuny? option in How do you know opportuny? dropdown menu
    And user select Are you a smoker? option in Are you a smoker? dropdown menu
    And user upload invalid file "LargeFile.pdf"
    And user clicks Apply Now button
    Then user sees notification error "File to large"