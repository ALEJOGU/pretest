Feature:  user
  Scenario: Create user
    Given url 'http://localhost:8080/user'
    And request {username: "faraon", password: "faraonloveshady"}
    When method post
    Then status 200


  Scenario: Login user
    Given url 'http://localhost:8080/user/login'
    And param username = 'faraon'
    And param password = 'faraonloveshady'
    When method get
    Then status 200

