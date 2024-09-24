@Ortaktag
Feature: SuperAdmin yeni sirket olusturmalı
  Scenario: SuperAdmin yeni sirket olusturur
    Given Kullanici "crmUrl" sayfasına gider
    When Kullanici crm Superadmin için kullanici adi ve parola girer
    And Kullanici Giris Yap butonuna tıklar
    And Kullanici para birimleri menusune tıklar
    Then Kullanici Yeni para birimi ekle butonuna tıklar
    And Kullanici para birimi bilgilerini doldurur
    And Kullanici para birimini Kaydet butona tıklar

    Scenario: SuperAdmin olusturdugu para birimi siler
      Given Kullanici en son olusturulan para birimini siler
