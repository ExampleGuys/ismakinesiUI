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
  Scenario: TC:IS-328 Kullanıcı Kişisel Bilgilerim, Adreslerim, Firma Bilgilerim, Banka Bilgilerim, Şifre Değiştir butonlarına tıklar
    Then Kullanici Kullanıcı Kişisel Bilgilerim, Adreslerim, Firma Bilgilerim, Banka Bilgilerim, Şifre Değiştir butonlarına tıklar

  @IS-329
  Scenario: TC:IS-329 Kullanıcı Adınız, E-Postanız, Telefon Numarası metin kutularına tıklar, karakter siler ve karakter girer
    Then Kullanici Adiniz, E-Postaniz, Telefon Numarasi metin kutularına tiklar karakter siler ve karakter girer