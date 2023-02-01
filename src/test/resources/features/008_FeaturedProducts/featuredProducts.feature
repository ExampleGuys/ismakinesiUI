@FeaturedProducts
Feature: FeaturedProducts
  Background:
    Given Kullanici ismakinesi.com adresine gider

  @IS-144

  Scenario: TC: IS-144 Ana Sayfadaki Forkliftler butonu tiklanabilmeli
    When Uye Ol veya GirisYap boxuna tiklar
    When e-mail bilgileri girilir
    When sifre bilgileri girilir
    And Anasayfadaki Forkliftler boxina tiklar
    And En ustteki ilana tiklanir
    And Teklif Ver boxuna tiklanir
    And Teklif verecegimiz ucret girilmeli
    And Devam butonuna basilir
    When Teklifi Gonder boxuna tiklanir
    When Basariyla yapildi yazisini dogrula
    Then Hemen Al butonuna tiklanir


  @IS-149

  Scenario: TC: IS-149 Ana Sayfadaki Ekskavatörler butonu tiklanabilmeli

    When Uye Ol veya GirisYap boxuna tiklar
    When e-mail bilgileri girilir
    When sifre bilgileri girilir
    And Anasayfadaki Ekskavatorler boxina tiklar
    And En ustteki ilana tiklanir
    And Teklif Ver boxuna tiklanir
    And Teklif verecegimiz ucret girilmeli
    And Devam butonuna basilir
    When Teklifi Gonder boxuna tiklanir
    When Basariyla yapildi yazisini dogrula
    Then Hemen Al butonuna tiklanir


  @IS-141

  Scenario: TC: IS-141 Ana Sayfadaki Kazici Yukleyici butonu tiklanabilmeli

    When Uye Ol veya GirisYap boxuna tiklar
    When e-mail bilgileri girilir
    When sifre bilgileri girilir
    And Anasayfadaki Kazici Yukleyici boxina tiklar
    And En ustteki ilana tiklanir
    And Teklif Ver boxuna tiklanir
    And Teklif verecegimiz ucret girilmeli
    And Devam butonuna basilir
    When Teklifi Gonder boxuna tiklanir
    When Basariyla yapildi yazisini dogrula
    Then Hemen Al butonuna tiklanir

  @IS-147

  Scenario: TC: IS-147 Ana Sayfadaki Yükleyiciler butonu tiklanabilmeli

    When Uye Ol veya GirisYap boxuna tiklar
    When e-mail bilgileri girilir
    When sifre bilgileri girilir
    And Anasayfadaki Yukleyiciler boxina tiklar
    And En ustteki ilana tiklanir
    And Teklif Ver boxuna tiklanir
    And Teklif verecegimiz ucret girilmeli
    And Devam butonuna basilir
    When Teklifi Gonder boxuna tiklanir
    When Basariyla yapildi yazisini dogrula
    Then Hemen Al butonuna tiklanir
