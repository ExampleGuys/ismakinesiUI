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


  @IS-65
  Scenario: TC:IS-65 Kullanici "Ekskavatörler " ilanlarini marka secerek secebilmelidir

    And Kullanici kategori olarak Lastik Tekerlekli Ekskavatör Radio buttonunu secer
    And Kullanici Marka olarak Volvo Radio buttonunu secer.
    And Sinirli Servis Garantisi secer
    And Uretim yili araligi  girer
    And calisma saati araligi girer
    And fiyat araligi girer
    Then secilen ilanin filitrelendigini dogrular.

  @IS-66
  Scenario: TC:IS-66 Kullanici "Kazici Yükleyici" ilanlarini marka secerek secebilmelidir
    Given Kullanici ismakinesi.com adresine gider
    When Kazici Yükleyici e tiklar
    And Tum Filtreler e tiklar
    And Kullanici Marka olarak Case Radio buttonunu secer.
    Then secilen ilanin filitrelendigini dogrular.

  @IS-67
  Scenario:TC:IS-67 Kullanici "Kazici Yükleyici" ilanlarini marka secerek secebilmelidir
    Given Kullanici ismakinesi.com adresine gider
    When Kazici Yükleyici e tiklar
    And Tum Filtreler e tiklar
    And Kullanici Marka olarak New Holland Radio buttonunu secer.
    And Sinirli Servis Garantisi secer
    And Uretim yili araligi  girer
    And calisma saati araligi girer
    And fiyat araligi girer
    Then secilen ilanin filitrelendigini dogrular.