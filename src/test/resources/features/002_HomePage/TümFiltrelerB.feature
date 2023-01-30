@tümFilitreler
Feature: Tüm Filitreler

  Background:
    Given Kullanici ismakinesi.com adresine gider
    When Ekskavatörler e tiklar
    And Tum Filtreler e tiklar

  @IS-64
  Scenario: TC:IS-64 Kullanici "Ekskavatörler" ilanlarini marka secerek secebilmelidir
    And Kullanici kategori olarak Paletli Ekskavator Radio buttonunu secer
    And Kullanici Marka olarak Caterpillar Radio buttonunu secer.
    Then secilen ilanin filitrelendigini dogrular.