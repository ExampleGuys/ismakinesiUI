Feature: Favorilerim

  Background:
    Given Kullanici ismakinesi.com adresine gider
    When Kullanici uye olarak giris yapar
    And Kullanici Hesabim butonuna tiklar
    And Kullanici Favorilerim butonuna tiklar

  @IS-348
  Scenario: TC:IS-348 Kullanici urun bilgileri sayfasina gider
    And Kullanici Favori olarak secilen urunlere tiklar
    Then Kullanici urun bilgileri sayfasina gider
