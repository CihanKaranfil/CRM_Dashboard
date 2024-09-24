@Ortaktag
Feature: SuperAdmin yeni sirket olusturmalı
  Scenario: SuperAdmin yeni sirket olusturur
    Given Kullanici "crmUrl" sayfasına gider
    When Kullanici crm Superadmin için kullanici adi ve parola girer
    And Kullanici Giris Yap butonuna tıklar
      #//assertion ekle
    Then Kullanici Sirketler menusune tıklar
    And Kullanici Yeni Sirket Ekle butonuna tıklar
    And Kullanici Sirket bilgilerini doldurur
    And Kullanici Kaydet butona tıklar

    Scenario:SuperAdmin olusturdugu sirketi siler
      Given Kullanici sirketi siler





