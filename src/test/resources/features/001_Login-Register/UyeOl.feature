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

  @IS-365
    Scenario Outline: TC:IS-365 Sekiz(8) Karakterden Az Sifre Ile Register Olma
    When kullanici Uye Ol Veya Giris Yap'a tiklar
    When kullanici Uye Ol'a tiklar
    When kullanici adini soyadini yazar
    And kullanici emailini yazar
    And kullanici telefon numarasini yazar
    And kullanici "<eksikSifre>" eksik sifre yazar
    And kullanici Register Uye Ol'a tiklar
    Then Sifre en az sekiz karekter olmalidir mesaji geldigini dogrular
    Examples:
    |eksikSifre|
    |a|
    |ab|
    |abc|
    |abc1|
    |abc12|
    |abc123|
    |abc123*|

