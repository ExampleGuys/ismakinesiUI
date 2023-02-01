
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

  @TicaretNasilGerceklesiyor

  @IS-159
  Scenario: IS-159 TC:IS-159 Teklif sistemi butonuna tiklandigi gorulebilmeli

    And Kullanici Teklif sistemi butonuna tiklar
    Then acilan sayfada Teklif Hakki Planlari  sayfasinin oldugu dogrulanir

  @IS-160
  Scenario: IS-160 TC:IS-160 Sinirli Servis Garantisi butonuna tiklandigi dogrulanmali
    And Kullanici Sinirli Servis Garantisi butonuna tiklar
    Then acilan sayfada Sinirli Servis Garantili is ve tarim makinelerini ismakinesi.com dan satin alin sayfasinin oldugu dogrulanir