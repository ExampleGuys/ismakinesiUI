@allFilters @regression
Feature: All Filters

  Background:
    Given Kullanici ismakinesi.com adresine gider
    When Forkliftler'e tiklar
    And Tum Filtreler e tiklar


  @IS-47
  Scenario: TC:IS-47 Kullanici Katagori  yazisi dogrulanmali.
    Then "Katagori" basligini dogrular

  @IS-48
  Scenario: TC:IS-48 Katagori  serch box dogrulanmali
    Then Katagori  serch box dogrulanmali

  @IS-49
  Scenario: TC:IS-49 Katagori  serch box kutusuna Model yilini girerek Arama yapar
    Then Katagori  serch box a model yili girer

  @IS-50
  Scenario: TC:IS-50 Katagori serch box a Model adi girerek Arama yapar
    When Katagori  serch box a model adi girer

  @IS-52
  Scenario: TC:IS-52 Kullanici arama sonucunda sectigi urunleri görur
    When Kullanici Radio Button kullanarak urun secer

  @IS-53
  Scenario: TC:IS-53 Arama basliklari yazisi dogrulanmali
    Then Marka,Sinirli Servis Garantisi,uretim Yili,Calisma Saati ve Fiyat basligini kullanici dogrular
      | Marka                    |
      | Sınırlı Servis Garantisi |
      | Üretim Yılı              |
      | Çalışma Saati            |
      | Fiyat                    |

  @IS-62
  Scenario: TC:IS-62 Kullanici Forkliftleri  marka secerek arama yapar
    And Kullanici kategori olarak Dizel Forklift Radio buttonunu secer
    And Kullanici Marka olarak Caterpillar Radio buttonunu secer.
    Then secilen ilanin filitrelendigini dogrular.

  @IS-63
  Scenario: TC:IS-63 Kullanici Forkliftler ilanlarini tum arama secereklerini kullanir.
    And Kullanici kategori olarak Dizel Forklift Radio buttonunu secer
    And Kullanici Marka olarak Caterpillar Radio buttonunu secer.
    And Sinirli Servis Garantisi secer
    And Uretim yili araligi  girer
    And calisma saati araligi girer
    And fiyat araligi girer
    Then secilen ilanin filitrelendigini dogrular.

  @IS-54
  Scenario: TC:IS-54 "Sinirli Servis Garantisi" yazisi dogrulanmali.
    Then Kullanici Sinirli Servis Garantisi basligini dogrular