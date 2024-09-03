package stepDefination.SuperAdmin;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.SuperAdmin.SuperAdminSirketler_Pages;

public class SuperAdminSirketlerDefs {
    SuperAdminSirketler_Pages superAdminSirketler = new SuperAdminSirketler_Pages();
    Faker faker = new Faker();

    @Then("Kullanici Sirketler menusune tıklar")
    public void kullaniciSirketlerMenusuneTıklar() {
        superAdminSirketler.sirketler.click();
    }

    @And("Kullanici Yeni Sirket Ekle butonuna tıklar")
    public void kullaniciYeniSirketEkleButonunaTıklar() {
        superAdminSirketler.yeniSirket.click();

    }

    @And("Kullanici Sirket bilgilerini doldurur")
    public void kullaniciSirketBilgileriniDoldurur() {
        superAdminSirketler.sirketAdi.sendKeys(faker.company().name(), Keys.TAB,faker.phoneNumber().phoneNumber(), Keys.TAB,
                faker.internet().emailAddress(), Keys.TAB, faker.name().firstName());
        superAdminSirketler.aktifDurumu.click();
        superAdminSirketler.kısaSirketAdi.sendKeys(faker.company().name(), Keys.TAB, faker.number().digits(2),Keys.TAB,
                faker.phoneNumber().cellPhone(),Keys.TAB,faker.phoneNumber().cellPhone(),Keys.TAB, faker.internet().url(),Keys.TAB,
                faker.address().country(), Keys.TAB);
        superAdminSirketler.vergiNo.sendKeys(faker.number().digits(7));

    }
}
