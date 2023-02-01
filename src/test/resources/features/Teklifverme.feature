Feature: Teklif ver

  Background:
    Given Kullanici ismakinesi.com adresine gider
    When kullanici Uye Ol Veya Giris Yapa tiklar
    When kullanici valid email adresi yazar
    And kullanici valid sifre yazar
    And kullanici Giris Yap'a tiklar


  Scenario: Bir makineye teklif verilebilir
    And forkliftlere gider
    And son ilanlardan birine girer
    And teklif ver butona tiklar
    And yeni bir teklif verir


