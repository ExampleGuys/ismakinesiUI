@login @smoke @regression
Feature: Giris

  Background:
    Given Kullanici ismakinesi.com adresine gider

  @IS-366
  Scenario: TC:IS-366 Kullanici Sign-in sayfasina yazdigi email adresi ve valid sifre ile siteye uye olarak girebilir.
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
  Scenario Outline: TC:IS-360 Invalid Sifre Ile Login
    When kullanici Uye Ol Veya Giris Yap'a tiklar
    When kullanici valid email adresi yazar
    And kullanici "<invalid>" sifre yazar
    And kullanici Giris Yap'a tiklar
    Then kullanici invalid sifre ile siteye giris yapamadigini dogrular
    Examples:
      | invalid      |
      | 111aaaa      |
      | asdfgha      |
      | #$%^&*       |
      | 123456       |
      | :-)          |
      | !@#$$%09bacs |

  @IS-362
  Scenario Outline:  TC:IS-362 Invalid Mail Ile Login
    When kullanici Uye Ol Veya Giris Yap'a tiklar
    When kullanici "<invalid>" mail yazar
    And kullanici valid sifre yazar
    And kullanici Giris Yap'a tiklar
    Then Kullanici invalid email giris yapamadigini dogrular
    Examples:
      | invalid                           |
      | Software@test.com                 |
      | softwareengineer00090@hotmail.com |
      | softwareengineer0009@gmail.com    |
      | softwareengineer090@gmail.com     |
      | softwareengineer0000@gmail.com    |
      | softwareengineer00090@mail.com    |

  @IS-371
  Scenario: TC:IS-371 Kullanici Uye Girisi sekmesindeyken herhangi bir yere tiklandiginda sekme kapanmamalidir
    When kullanici Uye Ol Veya Giris Yap'a tiklar
    Then Kullanici Uye Ol Veya Giris Yap sekmesindeyken sayfanin herhangi bir yerine tiklar

  @IS-381
  Scenario: TC:IS-381 Kullanici 8 karekterden az sifre girdiyse uyari mesaji gelir
    When kullanici Uye Ol Veya Giris Yap'a tiklar
    And Kullanici Giris Yap sekmesindeki Uye Ol’a tiklar
    And kullanici adini soyadini yazar
    And kullanici emailini yazar
    And kullanici telefon numarasini yazar
    And kullanici eksik sifre yazar
    And Kullanici Uye Ol'a tiklar
    Then Sifre en az 8 karekter olmalidir mesaji geldigini dogrular