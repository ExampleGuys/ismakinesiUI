@tümFilitreler
Feature: Tüm Filitreler

  Background:
    Given Kullanici ismakinesi.com adresine gider
    When Ekskavatörler e tıklar
    And Tüm Filtreler e tıklar

  @IS-64
  Scenario: TC:IS-64 Kullanıcı "Ekskavatörler" ilanlarını marka secerek secebilmelidir
    And Kullanıcı kategori olarak Paletli Ekskavatör Radio buttonunu secer
    And Kullanıcı Marka olarak Caterpillar Radio buttonunu secer.
    Then secilen ilanın filitrelendiğini dogrular.