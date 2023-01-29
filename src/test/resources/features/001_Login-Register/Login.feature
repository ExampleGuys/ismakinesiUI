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















    @IS-355
    Scenario: TC:IS-355 Ana Sayfadan Facebook Hesabina Gitme
      When kullanici facebook iconuna tiklar
      Then facebook sayfasi acildigini dogrular









