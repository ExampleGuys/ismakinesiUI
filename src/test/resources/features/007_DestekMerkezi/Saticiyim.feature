
@Saticiyim @regression
Feature: Saticiyim
  Background:
    Given Kullanici ismakinesi.com adresine gider
    When Kullanici Yardim Merkezine Git buttonuna tiklar

  @IS-177
  Scenario: TC:IS-177 Saticiyim kisminin tamamina erisebilmeli1
    And kullanici sayfadakı saticiyim buttonuna tıklar
    Then kullanici "ismakinesi.com'a nasıl ürün eklerim?" yazisini gorur
    Then kullanici "ismakinesi.com'a nasıl ürün eklerim?" tiklanabilir oldugunu dogrular

  @IS-183
  Scenario: TC:IS-183 Saticiyim kisminin tamamina erisilebilmeli7
    And kullanici saticiyim butonuna tiklar
    Then kullanici Hemen al ve teklif sistemi nedir? tiklar gorur

    @IS-187
    Scenario: TC:IS-187 Alicinin teklifini onayla
      Then kullanici Alicinin teklifini onayladim.Satis sureci nasil gerceklesiyor? tiklar gorur


