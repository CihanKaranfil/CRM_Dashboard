package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Kullanicilar_Pages {

    public Kullanicilar_Pages(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[@id=\"radix-:rh:\"]/ul/li[1]/a/div/span") public WebElement kullanicilar ;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/main/div/div[1]/div[1]/button[1]") public WebElement yeniKullaniciEkle ;
    @FindBy(xpath = "//*[@placeholder='Tam Adı']") public WebElement kullaniciAdi ;
    @FindBy(xpath = "//*[@type='submit']") public WebElement kaydetButton ;




}
