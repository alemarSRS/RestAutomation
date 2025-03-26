Feature: Validating Place API's

  @AddPlace @Regression
  Scenario Outline: Verify if place is being Succesfully added using AddPlaceAPI
    Given Add Place Payload with "<name>" "<language>" "<address>"
    When user calls "ADDPLACEAPI" with "POST" http request
    Then the API call is success with status code 200
    And "status" in response body is "OK"
    And "scope" in response body is "APP"
    And verify place_id created maps to "<name>" using "GETPLACEAPI"


    Examples:
      | name              | language | address      |
      | CyberCoffee       | Romana   | Strada Palat |
      | Neon Vibes Coffee | English  |Palace Street |

@DeletePlace @Regression
    Scenario: Verify if Delete Place functionality is working
      Given DeletePlace Payload
      When user calls "DELETEPLACEAPI" with "POST" http request
      Then the API call is success with status code 200
      And "status" in response body is "OK"