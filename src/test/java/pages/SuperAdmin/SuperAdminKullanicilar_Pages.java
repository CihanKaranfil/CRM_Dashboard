package pages.SuperAdmin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SuperAdminKullanicilar_Pages {

    public SuperAdminKullanicilar_Pages(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/div/div/ul/li[4]/a/div") public WebElement kullanicilarMenu; ;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/main/div/div[1]/div[1]/button[1]") public WebElement yeniKullanici; ;
    @FindBy(xpath = "//*[@id=\"radix-:r13:\"]/div[2]/div[1]/div/input") public WebElement kullaniciAdi; ;
    @FindBy(xpath = "//*[@id=\"radix-:r13:\"]/div[3]/button[2]") public WebElement kaydetButton; ;


}
