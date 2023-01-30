Feature: Mesajlarım

  Background:
    Given Kullanici ismakinesi.com adresine gider
    When Kullanici uye olarak giris yapar
    And Kullanici Hesabim butonuna tiklar
    And Kullanici Mesajlarim butonuna tiklar

  @IS-324
  Scenario: TC:IS-324 Kullanici Mesajlarim butonuna tiklandigini dogrular
    Then Kullanici Mesajlarim butonuna tiklandigini dogrular

  @IS-326
  Scenario: TC:IS-326 Kullanici Mesajlar ve Bildirimler butonlarinin calistigini dogrular ve tiklar
    Then Kullanici Mesajlar ve Bildirimler butonlarinin calistigini dogrular ve tiklar