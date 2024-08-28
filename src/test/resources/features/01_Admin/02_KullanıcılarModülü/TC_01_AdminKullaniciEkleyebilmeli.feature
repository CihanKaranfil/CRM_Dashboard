
Feature: Admin  yeni kullanici ekleyebilmeli
  Scenario: Admin yeni kullanici ekler
    Given Kullanici "crmUrl" sayfasına gider
    When Kullanıcı crm admin için kullanıcı adi ve parola girer
    And Kullanici Giris Yap butonuna tıklar
    #And Basarili giris yapildigini dogrular
    Then Kullanici Sirketler ve Kisilere tıklar
    And  Kullanici Kullanicilara tıklar
    And Kullanici Yeni Kullanici ekle butonuna tıklar
    Then Kullanici Kullanici bilgilerini girer
    And Kullanici Kaydet butona tıklar