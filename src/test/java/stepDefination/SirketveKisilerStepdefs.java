package stepDefination;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.SirketveKisiler_Pages;
import utilities.ReusableMethods;

public class SirketveKisilerStepdefs extends ReusableMethods {

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


    @Then("Kullanici Sirket bilgilerini girer")
    public void kullaniciSirketBilgileriniGirer() throws InterruptedException {
        sirketveKisiler.sirketAdi.click();
        sirketveKisiler.sirketAdi.sendKeys("tester");
       // sirketveKisiler.sirketAdi.sendKeys(faker.name().name() + "(TEST)",
       //         Keys.TAB, faker.phoneNumber().phoneNumber());

       // Thread.sleep(5500);
       // sirketveKisiler.durum.sendKeys("Müşteri");
       // // web sitesi, sektör, segment  ekleme
//
       // sirketveKisiler.webSitesi.sendKeys("https://" + faker.internet().url(), Keys.TAB, "Giyim", Keys.TAB, "Segment1");
//
       // sirketveKisiler.ilgiliKullanici.click();
       // Thread.sleep(1500);
       // sirketveKisiler.ilgiliKullanici.sendKeys("n");


        sirketveKisiler.ticariUnvan.sendKeys("Ticari Unvan", Keys.TAB, "Battalgazi", Keys.TAB, "44170");
        //ülke, sehir, ilce, adres, posta kodu, e mail ekleme
        sirketveKisiler.ulke.sendKeys("Türkiye", Keys.TAB, "Malatya", Keys.TAB, "Battalgazi", Keys.TAB,
                "Adres", Keys.TAB, "44170", Keys.TAB, faker.internet().emailAddress());
    }

    @And("Kullanici Kaydet butonuna tıklar")
    public void kullaniciKaydetButonunaTıklar() {
        sirketveKisiler.kaydetButton.click();

    }
}
