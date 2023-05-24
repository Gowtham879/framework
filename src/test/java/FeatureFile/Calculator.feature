Feature: Automate Calculator Using WinAppDriver
  @ArithmeticOperation
  Scenario Outline:  calculate the Arithmetic Operations
    Given User is able to Open the  Windows Calculator
    When  User is able Select the two Number "<Digits1>" and "<Digits2>" perform the "<operation>"
    When get the operation results of "<Digits1>" and "<Digits2>" "<operation>"
    Then Verify the Results
    Examples:
      | operation      | Digits1|Digits2|
      | Addition       | 234    | 126   |
      | Subtraction    | 654    | 345   |
      | Multiplication | 247    | 375   |
      | Division       | 596    | 896   |


  @Tempreature
  Scenario Outline: calculate the tempreature
    Given User is able to Open the  Windows Calculator
    When User is able Select the Celsius "<Digits1>" do operation
    When get the Fehrenheit results of "<Digits1>"
    Then Verify the Results
    Examples:
      |Digits1|
      |    215|

  @Length
  Scenario Outline: calculate the length
    Given User is able to Open the  Windows Calculator
    When User is able Select the Centimeter "<Digits1>" do operation
    When get the Inches results of "<Digits1>"
    Then Verify the Results
    Examples:
      |Digits1|
      |    19 |
  @Currency
  Scenario Outline: calculate the currency
    Given User is able to Open the  Windows Calculator
    When User is able Select the US doller "<Digits1>" convert to Indian rupes
    When get the results of Indian rupes "<Digits1>"
    Then Verify the Results
    Examples:
      |Digits1|
      |    100|