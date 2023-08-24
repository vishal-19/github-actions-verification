Feature: Test Github Actions

  Scenario: Validate github action is able to run tests

    Given url "https://reqres.in/api/users?page=2"
    When method GET
    Then status 200