@Aliciyim
Feature: Aliciyim butonu

    Background:
    Given Kullanici ismakinesi.com adresine gider
    When Kullanici Yardim Merkezine Git buttonuna tiklar
    And Kullanici  Aliciyim buttonuna tiklar

  @IS-213
  Scenario:
    Then Kullanici What is a pickup document? tiklar gorur


  @IS-216
  Scenario:TC:IS-216 Aliciyim kisminin tamamina erisebilmeli3
    Then kullanici Tumunu gor tiklanabilir oldugunu dogrular
