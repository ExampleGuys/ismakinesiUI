@regression @aldiklarim
Feature: aldiklarim

  Background:
    Given Kullanici ismakinesi.com adresine gider
    And kullanici uye olarak giris yapar
    When kullanici Hesabim buttonuna tiklar
    When kullanici Aldiklarima tiklar
    Then Aldiklarim sayfasi acilir


  @IS-95
  Scenario: TC:IS-95 Adiklarim sayfasinda Aldiklarim, Tekliflerim, Teklif Haklarim basliklari bulunur
    Then Aldiklarim, Tekliflerim,Teklif Haklarim basliklari visible olur
      | Aldıklarım      |
      | Tekliflerim     |
      | Teklif Haklarım |


  @IS-96
  Scenario: TC:IS-96 Kullanici Aldiklarim sayfasindaki Aldiklarim'a tiklayinca onceden satin almis oldugu urunleri gorur.

    Then kullanici onceden almis oldugu urunleri gorur

  @IS-97
  Scenario: TC:IS-97 Kullanici Aldiklarim sayfasindaki Tekliflerim'e tiklayinca teklif vermis oldugu urunleri gorur
    And kullanici bu sayfadaki Tekliflerim'e tiklar
    Then kullanici  teklif vermis oldugu urunleri gorur

