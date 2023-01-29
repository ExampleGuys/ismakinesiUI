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
