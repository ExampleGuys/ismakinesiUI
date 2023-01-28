Feature:


  @Scenario: IS-226 Alıcıyım kısmının tamamına erişebilmeli13

    Given Kullanici https://ismakinesi.com/ gider
    When Kullanici Yardım Merkezine Git buttonuna tıklar
    And Kullanici  Alıcıyım buttonuna tıklar
    Then Kullanici How do I arranged pickup? tıklar görür
@hakkimizda
Feature: ismakinasi.com hakkinda

  Background:
    Given Kullanici ismakinesi.com adresine gider
    When Kullanici hakkimizda yazisinin oldugu gorulur

  @IS-148
  Scenario: TC:IS-148 Kullanici Hakkimizda basligi altindaki "ismakinesi.com Hakkında""butonuna tiklandigi gorulebilmeli
    And  Kullanici ismakinesi.com Hakkinda yazisina tiklar
    Then Kullanici acilan sayfada hakkimizda kisminin oldugunu dogrular


    @IS-146
    Scenario:

    And  Kullanici Kariyer butonuna tiklar
    Then "https://machinerymarket.zohorecruit.com/jobs/Careers" sayfasina gittigi dogrulanir

