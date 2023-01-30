Feature: Bilgilerim

  Background:
    Given Kullanici ismakinesi.com adresine gider
    When Kullanici uye olarak giris yapar
    And Kullanici Hesabim butonuna tiklar
    And Kullanici Bilgilerim butonuna tiklar

  @IS-327
  Scenario: TC:IS-327 Kullanici Bilgilerim butonuna tiklandigini dogrular
    Then Kullanici Bilgilerim butonuna tiklandigini dogrular