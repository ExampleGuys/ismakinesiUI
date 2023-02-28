
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
    Then acilan sayfada Gizlilik Sozlesmesi oldugu dogrulanir

  @TicaretNasilGerceklesiyo

  @IS-159
  Scenario: IS-159 TC:IS-159 Teklif sistemi butonuna tiklandigi gorulebilmeli

    And Kullanici Teklif sistemi butonuna tiklar
    Then acilan sayfada Teklif Hakki Planlari  sayfasinin oldugu dogrulanir

  @IS-160
  Scenario: IS-160 TC:IS-160 Sinirli Servis Garantisi butonuna tiklandigi dogrulanmali
    And Kullanici Sinirli Servis Garantisi butonuna tiklar
    Then acilan sayfada Sinirli Servis Garantili is ve tarim makinelerini ismakinesi.com dan satin alin sayfasinin oldugu dogrulanir

  @IS-161

  Scenario: IS-161 TC: IS-161 Nasil Satarim butonuna tiklandigi gorulebilmeli
    And Kullanici Nasil Satarim butonuna tiklar
    Then acilan sayfada Nasil Satarim  sayfasinin oldugu dogrulanir

  @IS-162
  Scenario: IS-162 TC:IS-162 Nasil Alirıim butonuna tiklandigi gorulebilmeli
    And Kullanici Nasil Alirim butonuna tiklar
    Then acilan sayfada Nasil Alirim sayfasinin oldugu dogrulanir

  @Destek

  @IS-164
  Scenario: IS-164 TC:IS-164 Sik sorulan sorular butonuna tiklandigi gorulebilmeli
    And Kullanici Sik sorulan sorular butonuna tiklar
    Then acilan sayfada Cozum Merkezi sayfasinin oldugu dogrulanir

  @IS-165
  Scenario: IS-165 TC:IS-165 Destek Merkezi butonuna tiklandigi gorulebilmeli
    And Kullanici Destek merkezi butonuna tiklar
    Then acilan sayfada Destek merkezi sayfasinin oldugu dogrulanir

  @IS165
  Scenario:IS-165

    And Kullanici Bize Ulasin butonuna tiklar
    And acilan sayfada Adiniz Soyadiniz kismi doldurulur
    And  acilan sayfada E-Mail kismi doldurulur
    And  acilan sayfada Telefon numaraniz kismi doldurulur
    And  acilan sayfada Firma adi kismi doldurulur
    And  acilan sayfada Ulke kismi doldurulur
    And  acilan sayfada Mesajiniz kismi doldurulur
    Then Gonder butonuna tiklanir

  @IS-27
  Scenario: Kullanici bir ilan sayfasinda "Teklif Ver" butonuna tiklandiginda, Oturum Ac bolmesi acilmalidir
    When Kullanici Son Ilanlar bolmesindeki bir ilana tiklar
    And Kullanici Teklif Ver butonuna tiklar
    Then Giris Yap sayfasi acilir