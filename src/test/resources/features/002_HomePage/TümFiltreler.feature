@allFilters
Feature: All Filters

  Background:
    Given Kullanici ismakinesi.com adresine gider
    When Forkliftler'e tıklar
    And Tüm Filtreler e tıklar


  @IS-47
  Scenario: TC:IS-47 Kullanici Katagori  yazısı doğrulanmalı.
    Then "Katagori" başlığını doğrular

  @IS-48
  Scenario: TC:IS-48 Katagori  serch box doğrulanmalı
    Then Katagori  serch box doğrulanmalı

  @IS-49
  Scenario: TC:IS-49 Katagori  serch box kutusuna Model yılını girerek Arama yapar
    Then Katagori  serch box a model yılı girer

  @IS-50
  Scenario: TC:IS-50 Katagori serch box a Model adı girerek Arama yapar
    When Katagori  serch box a model adı girer

    @IS-52
    Scenario: TC:IS-51 Kullanıcı arama sonucunda seçtiği ürünleri görür
      When Kullanıcı "Radio Button" kullanarak ürün secer
  @IS-53
  Scenario: TC:IS-53 Arama başlıkları yazısı doğrulanmalı
    Then Marka,Sınırlı Servis Garantisi,üretim Yılı,Çalışma Saati ve Fiyat başlığını kullanıcı doğrular
      | Marka                    |
      | Sınırlı Servis Garantisi |
      | Üretim Yılı              |
      | Çalışma Saati            |
      | Fiyat                    |

    @IS-62
    Scenario: TC:IS-62 Kullanıcı Forkliftleri  marka secerek arama yapar
      And Kullanıcı kategori olarak Dizel Forklift Radio buttonunu secer
      And Kullanıcı Marka olarak Caterpillar Radio buttonunu secer.
      Then secilen ilanın filitrelendiğini dogrular.

      @IS-63
      Scenario: TC:IS-63 Kullanıcı Forkliftler ilanlarını tüm arama secereklerini kullanır.
        And Kullanıcı kategori olarak Dizel Forklift Radio buttonunu secer
        And Kullanıcı Marka olarak Caterpillar Radio buttonunu secer.
        And Sınırlı Servis Garantisi secer
        And Üretim yılı aralığı  girer
        And çalışma saati aralığı girer
        And fiyat aralığı girer
        Then secilen ilanın filitrelendiğini dogrular.
