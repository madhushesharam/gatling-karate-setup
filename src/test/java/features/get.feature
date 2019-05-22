Feature: cats crud

  Background:
    * url karate.properties['mock.cats.url']

  Scenario:Get Call Test Google
    Given url 'https://www.google.com'
    When method Get
    Then status 200
