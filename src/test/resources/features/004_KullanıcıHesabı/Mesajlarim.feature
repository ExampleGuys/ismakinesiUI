Feature: Mesajlarım

  Background:
    Given Kullanici ismakinesi.com adresine gider
    When Kullanici uye olarak giris yapar
    And Kullanici Hesabim butonuna tiklar

  @IS-324
  Scenario: TC:IS-324 Then Kullanici Mesajlarim butonuna tiklar ve dogrular
    Then Kullanici Mesajlarim butonuna tiklar ve dogrular