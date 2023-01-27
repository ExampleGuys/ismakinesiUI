Feature:

  Background:
    Given Kullanici ismakinesi.com adresine gider
    And kullanici uye olarak giris yapar
    When kullanici Hesabim buttonuna tiklar
    When kullanici Aldiklarima tiklar
    Then Aldiklarim sayfasi acilir
    When kullanici bu sayfadaki Teklif Haklarim'a tiklar

  @IS-98
  Scenario:TC:IS-98 Kullanici Aldiklarim sayfasindaki Teklif Haklarima tiklayinca Aktif, Suresi Bitenler, Teklif Hakki Satin Al basliklarini gorur
    Then kullanici  Aktif, Suresi Bitenler, Teklif Hakki Satin Al basliklarini gorur
      | Aktif           |
      | Süresi Bitenler |
      | Teklif Hakkı Al |

  @IS-99
  Scenario:TC:IS-99 Kullanici Teklif Haklarim sayfasindaki Aktif'e tiklayinca kullanilabilir teklif haklarini gorur
    And kullanici Aktif buttonuna tiklar
    Then kullanici  kullanilabilir durumdaki teklif haklarini gorur

  @IS-99
  Scenario:TC:IS-99 Kullanici Teklif Haklarim sayfasindaki Aktif'e tiklayinca kullanilabilir teklif haklarini gorur
    And kullanici Aktif buttonuna tiklar
    Then kullanici  kullanilabilir durumdaki teklif haklarini gorur