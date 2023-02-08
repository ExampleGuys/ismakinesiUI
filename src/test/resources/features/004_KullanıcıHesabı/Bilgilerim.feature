@regression
Feature: Bilgilerim

  Background:
    Given Kullanici ismakinesi.com adresine gider
    When Kullanici uye olarak giris yapar
    And Kullanici Hesabim butonuna tiklar
    And Kullanici Bilgilerim butonuna tiklar

  @IS-327
  Scenario: TC:IS-327 Kullanici Bilgilerim butonuna tiklandigini dogrular
    Then Kullanici Bilgilerim butonuna tiklandigini dogrular

  @IS-328
  Scenario: TC:IS-328 Kullanici Kisisel Bilgilerim, Adreslerim, Firma Bilgilerim, Banka Bilgilerim, Sifre Degistir butonlarina tiklar
    Then Kullanici Kisisel Bilgilerim, Adreslerim, Firma Bilgilerim, Banka Bilgilerim, Sifre Degistir butonlarina tiklar

  @IS-329
  Scenario: TC:IS-329 Kullanici Adiniz, E-Postaniz, Telefon Numarasi metin kutularina tiklar, karakter siler ve karakter girer
    Then Kullanici Adiniz, E-Postaniz, Telefon Numarasi metin kutularina tiklar karakter siler ve karakter girer

  @IS-345
  Scenario: TC:IS-345 Kullanici Adres Duzenle ve Yeni Adres butonlarina tiklar
    And Kullanici Adreslerim butonuna tiklar
    Then Kullanici Adres Duzenle ve Yeni Adres butonlarina tiklar ve dogrular

  @IS-334
  Scenario: TC:IS-334 Kullanici Firma Duzenle ve Yeni Firma butonlarina tiklar ve dogrular
    And Kullanici Firma Bilgilerim butonuna tiklar
    Then Kullanici Firma Duzenle ve Yeni Firma butonlarina tiklar ve dogrular

  @IS-338
  Scenario: TC:IS-338 Kullanici Yeni Banka Bilgisi Ekle butonuna tiklar ve dogrular
    And Kullanici Banka Bilgilerim butonuna tiklar
    Then Kullanici Yeni Banka Bilgisi Ekle butonuna tiklar ve dogrular

  @IS-343
  Scenario: TC:IS-343 Kullanici Eski Sifre, Yeni Sifre ve Yeni Sifre (Tekrar) adli metin kutularina tiklar ve karakter girer
    And Kullanici Sifre Degistir butonuna tiklar
    Then Kullanici Eski Sifre, Yeni Sifre ve Yeni Sifre (Tekrar) adli metin kutularina tiklar ve karakter girer

  @IS-344
  Scenario: TC:IS-344 Kullanici Sifremi Degistir butonunu tiklar ve dogrular
    And Kullanici Sifre Degistir butonuna tiklar
    Then Kullanici Sifremi Degistir butonunu tiklar ve dogrular

  @IS-330
  Scenario: TC:IS-330 Kullanici E-mail Adresini Onayla butonuna tiklar
    Then Kullanici E-mail Adresini Onayla butonuna tiklar