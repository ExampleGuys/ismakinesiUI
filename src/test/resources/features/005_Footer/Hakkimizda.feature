@hakkimizda
Feature: ismakinasi.com hakkinda

  Background:
    Given Kullanici ismakinesi.com adresine gider

  @IS-148
  Scenario: TC:IS-148 Kullanici Hakkimizda basligi altindaki "ismakinesi.com Hakkında""butonuna tiklandigi gorulebilmeli
    When Kullanici hakkimizda yazisinin oldugu gorulur
    And  Kullanici ismakinesi.com Hakkinda yazisina tiklar
    Then Kullanici acilan sayfada hakkimizda kisminin oldugunu dogrular