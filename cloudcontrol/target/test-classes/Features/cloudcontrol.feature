Feature: CloudControl

  Scenario Outline: To get the App Names without version number which is specified by the user
    Given the user is in the cloud control page
    And the user chooses the Environment <string>
    And the user searches for the App Names without versions
    Then the App Names are filtered out
    Examples:
      | string |
      | "Qa1"  |
