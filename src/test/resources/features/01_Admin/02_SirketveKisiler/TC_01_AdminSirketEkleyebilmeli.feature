@Sirket
Feature: Admin yeni sirket ekleyebilmeli
  Scenario: Admin yeni sirket ekler
    Given Kullanici "crmUrl" sayfasına gider
    When Kullanıcı crm admin için kullanıcı adi ve parola girer
    And Kullanici Giris Yap butonuna tıklar
    And Basarili giris yapildigini dogrular
    Then Kullanici Sirketler ve Kisilere tıklar
    And Kullanici Sirketlere tıklar
    And Kullanici Yeni Sirket ekle butonuna tıklar
    Then Kullanici Sirket adini girer