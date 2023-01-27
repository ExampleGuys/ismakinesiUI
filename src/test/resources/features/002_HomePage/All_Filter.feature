Feature: All Filters

  Background:
    Given Kullanici ismakinesi.com adresine gider
    When Forkliftler'e tıklar
    And Tüm Filtreler e tıklar


  @IS-41
    Scenario:TC:IS-41 Kullanici Katagori  yazısı doğrulanmalı.
     Then "Katagori" başlığını doğrular
