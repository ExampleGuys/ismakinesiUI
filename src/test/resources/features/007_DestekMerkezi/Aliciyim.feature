
@Aliciyim
Feature: IS-213 TC
Background:
Given Kullanici ismakinesi.com adresine gider

  @IS-213
  Scenario:
    
    When Kullanici Yardim Merkezine Git buttonuna tiklar
    And Kullanici  Aliciyim buttonuna tiklar
    Then Kullanici What is a pickup document? tiklar gorur
