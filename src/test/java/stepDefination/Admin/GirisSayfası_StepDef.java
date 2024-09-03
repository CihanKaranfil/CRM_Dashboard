package stepDefination.Admin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.Admin.GirisSayfasi_Pages;
import utilities.ConfigReader;
import utilities.Driver;

public class GirisSayfası_StepDef {
    GirisSayfasi_Pages girisSayfasi = new GirisSayfasi_Pages();

    @Given("Kullanici {string} sayfasına gider")
    public void kullaniciSayfasınaGider(String crmUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(crmUrl));
    }


    @And("Kullanici Giris Yap butonuna tıklar")
    public void kullaniciGirisYapButonunaTıklar() throws InterruptedException {
        girisSayfasi.girisyap.click();
        Thread.sleep(1200);
    }

    @And("Basarili giris yapildigini dogrular")
    public void basariliGirisYapildiginiDogrular() {
       // girisSayfasi.anaSayfa.isDisplayed();
    }

    @When("Kullanıcı crm admin için kullanıcı adi ve parola girer")
    public void kullanıcıCrmAdminIçinKullanıcıAdiVeParolaGirer() {
        girisSayfasi.email.sendKeys(ConfigReader.getProperty("eposta"));
        girisSayfasi.sifre.sendKeys(ConfigReader.getProperty("sifre"));
    }

    @When("Kullanici crm Superadmin için kullanici adi ve parola girer")
    public void kullaniciCrmSuperadminIçinKullaniciAdiVeParolaGirer() {
        girisSayfasi.email.sendKeys(ConfigReader.getProperty("eposta2"));
        girisSayfasi.sifre.sendKeys(ConfigReader.getProperty("sifre2"));
        //Driver.getDriver().navigate().refresh();

    }

    @When("Kullanıcı crm admin için kullanıcı yanlıs ad ve parola girer")
    public void kullanıcıCrmAdminIçinKullanıcıYanlısAdVeParolaGirer() {
        girisSayfasi.email.sendKeys(ConfigReader.getProperty("eposta3"));
        girisSayfasi.sifre.sendKeys(ConfigReader.getProperty("sifre"));
    }

    @And("Bir hata oluştu yazısını dogrular")
    public void birHataOluştuYazısınıDogrular() {
        girisSayfasi.hataMesaji.isDisplayed();
    }

    @When("Kullanici crm Superadmin için yanlis kullanici adi ve parola girer")
    public void kullaniciCrmSuperadminIçinYanlisKullaniciAdiVeParolaGirer() {

        girisSayfasi.email.sendKeys(ConfigReader.getProperty("eposta3"));
        girisSayfasi.sifre.sendKeys(ConfigReader.getProperty("sifre2"));
    }
}