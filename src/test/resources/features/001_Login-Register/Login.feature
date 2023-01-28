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






















    @IS-354
    Scenario: TC:IS-354 Ana Sayfadan Instagram Hesabina Gitme
      When kullanici  instagram iconuna tiklar
      Then Instagram sayfasi acildigini dogrular
