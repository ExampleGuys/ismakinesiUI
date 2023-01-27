Feature:

  Background:
    Given Kullanici ismakinesi.com adresine gider
    And kullanici uye olarak giris yapar
    When kullanici Hesabim buttonuna tiklar
    When kullanici Aldiklarima tiklar
    Then Aldiklarim sayfasi acilir

  @IS-98
  Scenario:TC:IS-98 Kullanici Aldiklarim sayfasindaki Teklif Haklarima tiklayinca Aktif, Suresi Bitenler, Teklif Hakki Satin Al basliklarini gorur
    When kullanici bu sayfadaki Teklif Haklarim'a tiklar
    Then kullanici  Aktif, Suresi Bitenler, Teklif Hakki Satin Al basliklarini gorur
      | Aktif           |
      | Süresi Bitenler |
      | Teklif Hakkı Al |