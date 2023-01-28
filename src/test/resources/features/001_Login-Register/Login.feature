@login
Feature: Giris

  Background:
    Given Kullanici ismakinesi.com adresine gider

  @IS-89
  Scenario: TC:IS-89 Kullanici Sign-in sayfasina yazdigi email adresi ve valid sifre ile siteye uye olarak girebilir.
    When kullanici Uye Ol Veya Giris Yapa tiklar
    Then Uye Girisi sayfasi acilir
    When kullanici valid email adresi yazar
    And kullanici valid sifre yazar
    And kullanici Giris Yap'a tiklar
    Then kullanici siteye giris yapar

  @IS-352
    Scenario: TC:IS-352 Ana Sayfada'dan Youtube Hesabi Gitme
    When kullanici Youtube iconuna tiklar
    Then Kullanici Youtube sayfasinin acildigini dogrular