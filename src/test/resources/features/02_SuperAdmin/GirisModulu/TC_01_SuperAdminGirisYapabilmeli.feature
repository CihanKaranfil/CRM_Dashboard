@Superadmin
  Feature: Kullanıcı Hesap Bilgilerini Girerek Login Olmalı
    Scenario: Kullanıcı CRM sayfasına giriş yapar
      Given Kullanici "crmUrl" sayfasına gider
      When Kullanici crm Superadmin için kullanici adi ve parola girer
      And Kullanici Giris Yap butonuna tıklar
      #//assertion ekle

