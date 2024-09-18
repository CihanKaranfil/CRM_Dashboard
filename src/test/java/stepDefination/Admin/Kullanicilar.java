package stepDefination.Admin;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;

import pages.Admin.Kullanicilar_Pages;
import utilities.ReusableMethods;

public class Kullanicilar  extends ReusableMethods {
    Kullanicilar_Pages kullanicilar = new Kullanicilar_Pages();
    Faker faker = new Faker();

    @And("Kullanici Kullanicilara tıklar")
    public void kullaniciKullanicilaraTıklar() {
        click(kullanicilar.kullanicilar);

    }

    @And("Kullanici Yeni Kullanici ekle butonuna tıklar")
    public void kullaniciYeniKullaniciEkleButonunaTıklar() {
        kullanicilar.yeniKullaniciEkle.click();
    }


    @Then("Kullanici Kullanici bilgilerini girer")
    public void kullaniciKullaniciBilgileriniGirer() {
        kullanicilar.kullaniciAdi.sendKeys(faker.name().username(), Keys.TAB,faker.internet().emailAddress(),
                Keys.TAB,faker.name().firstName(),Keys.TAB,"t",Keys.TAB,"c");
    }

    @And("Kullanici Kaydet butona tıklar")
    public void kullaniciKaydetButonaTıklar() throws InterruptedException {
        kullanicilar.kaydetButton.click(); Thread.sleep(2000);


    }

    @Then("Kullanici ekledigi kullaniciyi siler")
    public void kullaniciEkledigiKullaniciyiSiler() {
        kullanicilar.kullaniciList.get(0).click();
        kullanicilar.silButton.click();
        kullanicilar.silButton2.click();

    }
}
