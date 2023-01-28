@allFilters
Feature: All Filters

  Background:
    Given Kullanici ismakinesi.com adresine gider
    When Forkliftler'e tıklar
    And Tüm Filtreler e tıklar


  @IS-47
    Scenario:TC:IS-47 Kullanici Katagori  yazısı doğrulanmalı.
     Then "Katagori" başlığını doğrular

    @IS-48
    Scenario:TC:IS-48 Katagori  serch box doğrulanmalı
      Then Katagori  serch box doğrulanmalı