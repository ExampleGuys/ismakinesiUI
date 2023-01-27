Feature:

  Background:
    Given Kullanici ismakinesi.com adresine gider
    And kullanici uye olarak giris yapar
    When kullanici Hesabim buttonuna tiklar
    When kullanici Aldiklarima tiklar
    Then Aldiklarim sayfasi acilir


  @IS-95
  Scenario: Adiklarim sayfasinda Aldiklarim, Tekliflerim, Teklif Haklarim basliklari bulunur
    Then Aldiklarim, Tekliflerim,Teklif Haklarim basliklari visible olur
      | Aldıklarım      |
      | Tekliflerim     |
      | Teklif Haklarım |



