@regression
Feature: Sattıklarım

  Background:
    Given Kullanici ismakinesi.com adresine gider
    When Kullanici uye olarak giris yapar
    And Kullanici Hesabim butonuna tiklar
    And Kullanici Sattiklarim butonuna tiklar

  @IS-321
  Scenario: TC:IS-321 Kullanici Sattiklarim butonuna tiklar
    Then Kullanici Sattiklarim butonuna tiklandigini dogrular

  @IS-322
  Scenario: TC:IS-322 Kullanici Sattiklarim sayfasinda Yayindaki İlanlar, Sattiklarim ve Yayinda Olmayanlar başlıklarını görür ve tıklar
    Then Kullanici Yayindaki İlanlar, Sattiklarim ve Yayinda Olmayanlar başlıklarının görünürlüğünü ve tıklanabilirliğini doğrular
      | Yayındaki İlanlar  |
      | Sattıklarım        |
      | Yayında Olmayanlar |

  @IS-323
  Scenario: TC:IS-323 Tumu ve Teklif Gelenler basliklarina tiklar ve dogrular
    Then Kullanici Tumu ve Teklif Gelenler basliklarina tiklar ve dogrular
