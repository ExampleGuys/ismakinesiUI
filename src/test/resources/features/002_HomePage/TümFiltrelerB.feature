@tümFilitreler @regression
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
  Scenario: TC:IS-67 Kullanici "Kazici Yükleyici" ilanlarini marka secerek secebilmelidir
    Given Kullanici ismakinesi.com adresine gider
    When Kazici Yükleyici e tiklar
    And Tum Filtreler e tiklar
    And Kullanici Marka olarak New Holland Radio buttonunu secer.
    And Sinirli Servis Garantisi secer
    And Uretim yili araligi  girer
    And calisma saati araligi girer
    And fiyat araligi girer
    Then secilen ilanin filitrelendigini dogrular.

  @IS-68
  Scenario: TC:IS-68 Kullanici "Yükleyiciler" ilanlarini marka secerek secebilmelidir
    Given Kullanici ismakinesi.com adresine gider
    When Yükleyiciler e tiklar
    And Tum Filtreler e tiklar
    And Kullanici kategori olarak Paletli Yükleyici Radio buttonunu secer
    And Kullanici Marka olarak Caterpillar Radio buttonunu secer.
    Then secilen ilanin filitrelendigini dogrular.

  @IS-69
  Scenario: TC:IS-69 Kullanici "Yükleyiciler" ilanlarini marka secerek secebilmelidir
    Given Kullanici ismakinesi.com adresine gider
    When Yükleyici e tiklar
    And Tum Filtreler e tiklar
    And Kullanici kategori olarak Lastik Tekerlekli Yükleyici Radio buttonunu secer
    And Kullanici Marka olarak New Holland Radio buttonunu secer.
    And Sinirli Servis Garantisi secer
    And Uretim yili araligi  girer
    And calisma saati araligi girer
    And fiyat araligi girer
    Then secilen ilanin filitrelendigini dogrular.

  @IS-70
  Scenario: TC:IS 70 Kullanici "Personel Yükselticiler" ilanlarini marka secerek görebilmelidir.
    Given Kullanici ismakinesi.com adresine gider
    When Personel Yukselticiler e tiklar
    And Tum Filtreler e tiklar
    And Kullanici kategori olarak Akülü Makasli Platform Radio buttonunu secer
    And Kullanici Marka olarak Genie Radio buttonunu secer.
    Then secilen ilanin filitrelendigini dogrular.

  @IS-71
  Scenario: TC:IS 71 Kullanici "Personel Yükselticiler" ilanlarini marka secerek görebilmelidir.
    Given Kullanici ismakinesi.com adresine gider
    When Personel Yukselticiler e tiklar
    And Tum Filtreler e tiklar
    And Kullanici kategori olarak Dizel akulu platform Radio buttonunu secer
    And Kullanici Marka olarak Skyjack Radio buttonunu secer.
    And  Sinirli Servis Garantisi secer
    And Uretim yili araligi  girer
    And calisma saati araligi girer
    And fiyat araligi girer
    Then secilen ilanin filitrelendigini dogrular.

  @IS-72
  Scenario: TC:IS-72 Kullanici "Teleskopik Yükleyici" ilanlarini marka secerek görebilmelidir
    Given Kullanici ismakinesi.com adresine gider
    When Teleskopik Yukleyici e tiklar
    And Tum Filtreler e tiklar
    And Kullanici Marka olarak Bobcat Radio buttonunu secer.
    Then secilen ilanin filitrelendigini dogrular.