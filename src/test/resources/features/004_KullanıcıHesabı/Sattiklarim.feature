Feature: Sattıklarım

  Background:
    Given Kullanici ismakinesi.com adresine gider
    When kullanici uye olarak giris yapar
    And kullanici Hesabim buttonuna tiklar

  @IS-321
  Scenario: TC:IS-321 Kullanici Sattiklarim butonuna tiklar
    Then kullanici Sattiklarim butonuna tiklar



