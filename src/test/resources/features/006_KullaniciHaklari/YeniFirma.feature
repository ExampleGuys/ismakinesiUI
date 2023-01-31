@yeniFirma

  Feature: Kullanici yeni firma ekleyebilir, firma bilgilerini duzeltebilir

    Background:
      Given Kullanici ismakinesi.com adresine gider
      And kullanici uye olarak giris yapar
      When kullanici Hesabim buttonuna tiklar
      When kullanici Aldiklarima tiklar
      Then Aldiklarim sayfasi acilir
      When kullanici bu sayfadaki Teklif Haklarim'a tiklar
      And kullanici Teklif Hakki Al'a tiklar
      Then Teklif Hakki sayfasi acilir
      When kullanici Baslangic yada Avantaj teklif hakkini secer
      And kullanici Teklif Hakki Al buttonuna tiklar

    @IS-364
    Scenario: TC:IS-364 Teklif Verme Hakki sayfasindaki Yeni Firma iconu gorulebilir ve tiklanabilir
    Then yeni firma iconu gorulebilir
    Then yeni firma iconuna tiklanabilir
