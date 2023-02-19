@SearchBox @regression
Feature: SearchBox

  Background:
    Given Kullanici ismakinesi.com adresine gider


  @IS-152
  Scenario: IS-152 TC: IS-152 Search Box'da istenilen kelime aranabilmeli
    When ismakinesi.com'da ara butonuna tiklar
    And Aramak istenilen kelimeyi girer
    Then Aradigi kelimenin arandigini dogrular


  Scenario Outline: aranan kelimeleri dogrular
    When ismakinesi.com'da ara butonuna tiklar
    And "<Text>" girilir
    Then "<Text>" bulundugunu dogrular

    Examples:
      | Text          |
      | Forkliftler   |
      | kepce         |
      | forklift      |
      | ekskavator    |
      | ekskavatorler |

