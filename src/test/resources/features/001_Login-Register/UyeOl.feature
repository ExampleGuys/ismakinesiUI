@register @smoke @uyeOl
Feature: Uye Ol / Register

  Background: AnaSayfa Acilis
    Given Kullanici ismakinesi.com adresine gider

  @IS-363
  Scenario: TC:IS-363 Valid Degerler Ile Register Olurken Telefon Kodu Alma
    When kullanici Uye Ol Veya Giris Yap'a tiklar
    When kullanici Uye Ol'a tiklar
    And kullanici adini soyadini yazar
    And kullanici emailini yazar
    And kullanici telefon numarasini yazar
    And kullanici sifre yazar
    And kullanici Register Uye Ol'a tiklar
    Then kullanici Telefon Kodu Dogrulama sayfasinin acildigini dogrular
