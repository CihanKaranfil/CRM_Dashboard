@Kullanıcı1
Feature: Admin  yeni ekledigi kullanıcıyı silebilmeli
  Scenario: Admin yeni ekledigi kullanıcıyı siler
    Given Kullanici "crmUrl" sayfasına gider
    When Kullanıcı crm admin için kullanıcı adi ve parola girer
    And Kullanici Giris Yap butonuna tıklar
    #And Basarili giris yapildigini dogrular
    Then Kullanici Sirketler ve Kisilere tıklar
    And  Kullanici Kullanicilara tıklar
    Then Kullanici ekledigi kullaniciyi siler
