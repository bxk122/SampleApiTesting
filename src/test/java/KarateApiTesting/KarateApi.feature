Feature: Test User API

  Background:
    * def link = 'http://v2eok.mocklab.io/customer/a'

  Scenario: Get customer info
    Given url link
    When method GET
    Then status 200
    * print response
    * def checkResponse = read("classpath:KarateApiTesting/checkResponseValues.js")
    * def failCount = call checkResponse response
    * match failCount == 0
    * print 'Response time is: ' + responseTime
    * def checkTime = read("classpath:KarateApiTesting/checkResponseTime.js")
    * def isTimeLess = call checkTime responseTime
    * assert isTimeLess == true
