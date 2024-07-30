package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.GirisSayfasi_Pages;
import utilities.ConfigReader;
import utilities.Driver;

public class GirisSayfası_StepDef {
    GirisSayfasi_Pages girisSayfasi = new GirisSayfasi_Pages();

    @Given("Kullanici {string} sayfasına gider")
    public void kullaniciSayfasınaGider(String crmUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(crmUrl));
    }


    @And("Kullanici Giris Yap butonuna tıklar")
    public void kullaniciGirisYapButonunaTıklar() {
        girisSayfasi.girisyap.click();
    }
    @And("Basarili giris yapildigini dogrular")
    public void basariliGirisYapildiginiDogrular() {
        girisSayfasi.anaSayfa.isDisplayed();
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

    }
}
