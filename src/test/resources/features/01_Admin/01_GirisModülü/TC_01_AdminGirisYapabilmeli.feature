@crm
  Feature: Kullanıcı Hesap Bilgilerini Girerek Login Olmalı
    Scenario: Kullanıcı CRM sayfasına giriş yapar
      Given Kullanici "crmUrl" sayfasına gider
      When Kullanıcı crm admin için kullanıcı adi ve parola girer
      And Kullanici Giris Yap butonuna tıklar
      And Basarili giris yapildigini dogrular

