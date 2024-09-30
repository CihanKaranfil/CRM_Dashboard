@Ortaktag
Feature: Super Admin Yeni kullanıcı eklemeli
  Scenario: Super Admin yeni kullanıcı ekler
    Given Kullanici "crmUrl" sayfasına gider
    When Kullanici crm Superadmin için kullanici adi ve parola girer
    And Kullanici Giris Yap butonuna tıklar
    When Kullanici Kullanıcılar menusune tıklar
    Then Kullanici eklenen son kullaniciyi siler