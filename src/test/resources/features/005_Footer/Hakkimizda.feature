
@hakkimizda @regression
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

  @IS-153
  Scenario: IS-153 TC:IS-153 Kullanici sozlesmesi butonuna tiklandigi gorulebilmeli

    And Kullanici Kullanici sozlesmesi butonuna tiklar
    Then Acilan sayfada Mesafeli Satis Sozlesmesi oldugu dogrulanmali

  @IS-154
  Scenario:IS-154 TC:IS-154 Gizlilik sozlesmesi butonuna tiklandigi gorulebilmeli
    And Kullanici Gizlilik Merkezi butonuna tiklar
    Then acilan sayfada Gizlilik Sözleşmesi oldugu dogrulanir
