package stepDefination.SuperAdmin;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.SuperAdmin.SuperAdminParaBirimi_Pages;

public class ParaBirimiStepdefs {
    SuperAdminParaBirimi_Pages superAdminParaBirimi = new SuperAdminParaBirimi_Pages();
    Faker faker = new Faker();

    @And("Kullanici para birimleri menusune tıklar")
    public void kullaniciParaBirimleriMenusuneTıklar() {
        superAdminParaBirimi.paraBirimleri.click();
    }

    @Then("Kullanici Yeni para birimi ekle butonuna tıklar")
    public void kullaniciYeniParaBirimiEkleButonunaTıklar() {
        superAdminParaBirimi.yeniParaBirimleri.click();
    }

    @And("Kullanici para birimi bilgilerini doldurur")
    public void kullaniciParaBirimiBilgileriniDoldurur() {
        superAdminParaBirimi.isim.sendKeys("PARA" + faker.number().digits(2),
                Keys.TAB, faker.number().digits(4), Keys.TAB, faker.name().lastName());
    }

    @And("Kullanici para birimini Kaydet butona tıklar")
    public void kullaniciParaBiriminiKaydetButonaTıklar() throws InterruptedException {
        superAdminParaBirimi.kaydetButton.click();
        Thread.sleep(1000);
    }

    @Given("Kullanici en son olusturulan para birimini siler")
    public void kullaniciEnSonOlusturulanParaBiriminiSiler() throws InterruptedException {
        superAdminParaBirimi.paraBirimleriList.getLast().click();
        Thread.sleep(500);
        superAdminParaBirimi.silButton.click();
        superAdminParaBirimi.silButton2.click();
    }
}
