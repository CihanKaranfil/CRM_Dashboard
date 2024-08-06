package stepDefination;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.SirketveKisiler_Pages;

public class SirketveKisilerStepdefs {

    SirketveKisiler_Pages sirketveKisiler = new SirketveKisiler_Pages();
    Faker faker = new Faker();

    @Then("Kullanici Sirketler ve Kisilere tıklar")
    public void kullaniciSirketlerVeKisilereTıklar() {
        sirketveKisiler.sirketveKisiler.click();

    }

    @And("Kullanici Sirketlere tıklar")
    public void kullaniciSirketlereTıklar() {
        sirketveKisiler.sirketler.click();
    }

    @And("Kullanici Yeni Sirket ekle butonuna tıklar")
    public void kullaniciYeniSirketEkleButonunaTıklar() {
        sirketveKisiler.yeniSirket.click();
    }

    @Then("Kullanici Sirket adini girer")
    public void kullaniciSirketAdiniGirer() {
        sirketveKisiler.sirketAdi.sendKeys(faker.name().name() + "(TEST)",
                Keys.TAB,faker.phoneNumber().phoneNumber());
    }
}
