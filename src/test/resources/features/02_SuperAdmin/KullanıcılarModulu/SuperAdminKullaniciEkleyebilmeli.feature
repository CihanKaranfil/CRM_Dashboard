@Kullanici
Feature: Super Admin Yeni kullanıcı eklemeli
  Scenario: Super Admin yeni kullanıcı ekler
    Given Kullanici "crmUrl" sayfasına gider
    When Kullanici crm Superadmin için kullanici adi ve parola girer
    And Kullanici Giris Yap butonuna tıklar
    When Kullanici Kullanıcılar menusune tıklar
    And Kullanici Yeni Kullanıcı ekle butonuna tıklar
    Then Yeni kullanici bilgileri girilir
    And Yeni Kullanici Kaydet butonuna tıklar


