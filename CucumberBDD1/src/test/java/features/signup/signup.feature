Feature: TalentTEK sign up feature test suite
  Scenario: User should be able to sign up with valid email address
    Given I am at TalentTEK home page
    And I click on Create My Account button
    And I enter student information with valid email address
#    And  I enter student dob
#    And I enter student gender as male
#    And I agree with from
#    When I click Create My  Account button
#    Then I should be able to get my student id




  Scenario: User should not be able to sign up with  invalid email address
    Given I am at TalentTEK home page
    And I click on Create My Account button
    And I enter student information with invalid email address
#    And  I enter student dob
#    And I enter student gender as male
#    And I agree with from
#    When I click Create My  Account button
#    Then I should not be able to get my student id
