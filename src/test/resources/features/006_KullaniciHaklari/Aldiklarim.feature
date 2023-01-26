Feature:
  Background:
    Given Kullanici ismakinesi.com adresine gider
    When kullanici uye olarak giris yapar
    And kullanici Hesabim buttonuna tiklar
    And kullanici Aldiklarima tiklar
    Then Aldiklarim sayfasi acilir

  @IS_95
  Scenario: Adiklarim sayfasinda Aldiklarim, Tekliflerim, Teklif Haklarim basliklari bulunur
    Then "Aldiklarim", "Tekliflerim","Teklif Haklarim" basliklari cikar