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

  @IS-353
  Scenario: TC:IS-353 Ana Sayfa'dan Twitter Hesabina Gitme
    When kullanici Twitter iconuna tiklar
    Then Twitter sayfasi acildigini dogrular

  @IS-354
  Scenario: TC:IS-354 Ana Sayfadan Instagram Hesabina Gitme
    When kullanici  instagram iconuna tiklar
    Then Instagram sayfasi acildigini dogrular

  @IS-355
  Scenario: TC:IS-355 Ana Sayfadan Facebook Hesabina Gitme
    When kullanici facebook iconuna tiklar
    Then facebook sayfasi acildigini dogrular

  @IS-356
  Scenario: TC:IS-356 Valid Degerlerle Uye Girisi
    When kullanici Uye Ol Veya Giris Yap'a tiklar
    When kullanici valid email adresi yazar
    And kullanici valid sifre yazar
    And kullanici Giris Yap'a tiklar
    Then kullanici siteye giris yaptigini dogrular

  @IS-357
  Scenario: TC:IS-357 Bos Sifre Ile Uye Girisi
    When kullanici Uye Ol Veya Giris Yap'a tiklar
    When kullanici valid email adresi yazar
    And kullanici Giris Yap'a tiklar
    Then kullanici siteye giris yapamadigini dogrular

  @IS-360
  Scenario Outline:
    When kullanici Uye Ol Veya Giris Yap'a tiklar
    When kullanici valid email adresi yazar
    And kullanici <"invalid"> sifre yazar
    And kullanici Giris Yap'a tiklar
    Then kullanici invalid sifre ile siteye giris yapamadigini dogrular
    Examples:
      | invalid |
      | 111aaaa |
      | asdfgha |
      | #$%^&*  |
      | 123456  |
      | :-)     |
      | 🙂🙂    |






