Feature: Sattıklarım

  Background:
    Given Kullanici ismakinesi.com adresine gider
    When Kullanici uye olarak giris yapar
    And Kullanici Hesabim buttonuna tiklar
    And Kullanici Sattiklarim butonuna tiklar

  @IS-321
  Scenario: TC:IS-321 Kullanici Sattiklarim butonuna tiklar
    Then kullanici Sattiklarim butonuna tiklandigini dogrular


