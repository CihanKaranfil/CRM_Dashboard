@crm1
Feature: Kullanıcı Hesap Bilgilerini Girerek Login Olmalı
  Scenario: Kullanıcı CRM sayfasına giriş yapamaz
    Given Kullanici "crmUrl" sayfasına gider
    When Kullanıcı crm admin için kullanıcı yanlıs ad ve parola girer
    And Kullanici Giris Yap butonuna tıklar
    And Bir hata oluştu yazısını dogrular