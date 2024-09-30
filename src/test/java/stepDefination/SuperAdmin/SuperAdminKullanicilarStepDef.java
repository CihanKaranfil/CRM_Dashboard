package stepDefination.SuperAdmin;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import pages.SuperAdmin.SuperAdminKullanicilar_Pages;
import utilities.ReusableMethods;

public class SuperAdminKullanicilarStepDef extends ReusableMethods {
    SuperAdminKullanicilar_Pages superAdminKullanicilar = new SuperAdminKullanicilar_Pages();
    Faker faker = new Faker();

    @When("Kullanici Kullanıcılar menusune tıklar")
    public void kullanici_kullanıcılar_menusune_tıklar() throws InterruptedException {
        superAdminKullanicilar.kullanicilarMenu.click();
        Thread.sleep(1500);

    }

    @When("Kullanici Yeni Kullanıcı ekle butonuna tıklar")
    public void kullanici_yeni_kullanıcı_ekle_butonuna_tıklar() {
        superAdminKullanicilar.yeniKullanici.click();

    }

    @Then("Yeni kullanici bilgileri girilir")
    public void yeni_kullanici_bilgileri_girilir() throws InterruptedException {
        superAdminKullanicilar.kullaniciAdi.sendKeys("TEST" + faker.number().digits(3), Keys.TAB,
                faker.internet().emailAddress(), Keys.TAB,faker.name().firstName(), Keys.TAB,faker.internet().password(5,7));
        Thread.sleep(1000);
    }

    @Then("Yeni Kullanici Kaydet butonuna tıklar")
    public void yeni_kullanici_kaydet_butonuna_tıklar() {
        superAdminKullanicilar.kaydetButton.click();

    }

    @Then("Kullanici eklenen son kullaniciyi siler")
    public void kullaniciEklenenSonKullaniciyiSiler() {
      click(superAdminKullanicilar.kullanicilarList.getLast());
      superAdminKullanicilar.silButton.click();
      superAdminKullanicilar.silButton2.click();

    }
}
