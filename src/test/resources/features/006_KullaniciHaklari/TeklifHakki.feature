@teklifhakki
Feature: Teklif haklari

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

  @IS-101
  Scenario:TC:IS-101 Kullanici Teklif Haklarim sayfasindaki Suresi Bitenlere tiklayinca, Odemede Kullanildi durumundaki teklif haklarini gorur
    And kullanici Suresi bitenler'e tiklar
    Then kullanici  suresi biten teklif haklarini gorur

  @IS-102
  Scenario:TC:IS-102 Tekif Haklarimdaki Teklif Hakki Al 'a tiklaynca Teklif Hakki sayfasi acilir
    And kullanici Teklif Hakki Al'a tiklar
    Then Teklif Hakki sayfasi acilir

  @IS-103
  Scenario:TC:IS-103 Kullanici Baslangic yada Avantaj teklif haklarindan birini secer
    And kullanici Teklif Hakki Al'a tiklar
    Then Teklif Hakki sayfasi acilir
    When kullanici Baslangic yada Avantaj teklif hakkini secer
    And kullanici Teklif Hakki Al buttonuna tiklar
    Then "Ödeme Yap" in gorunundugu sayfa acilir

  @IS-105
  Scenario:TC:IS-105 Kullanici Fatura adresini secer, Kart sahibinin adini, Kart numarasini yazar Odeme yap'a tiklarsa Aldiklarim sayfasi acilir ve "Odeme islemi basari ile tamamlandi" mesaji cikar
    And kullanici Teklif Hakki Al'a tiklar
    Then Teklif Hakki sayfasi acilir
    When kullanici Baslangic yada Avantaj teklif hakkini secer
    And kullanici Teklif Hakki Al buttonuna tiklar
    Then "Ödeme Yap" in gorunundugu sayfa acilir
    When kullanici Odeme Yap'a tiklar
    When kullanici kart sahibinin adini yazar
    And kullanici kart numarsini yazar
    When kullanici Odeme Yap'a tiklar
    Then aldiklarim sayfasi acilir
    Then "Ödeme işlemi başarılı. Teklif hakkınız sisteme tanımlandı." mesaji cikar
