package pages.SuperAdmin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SuperAdminSirketler_Pages {

    public SuperAdminSirketler_Pages(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/div/div/ul/li[3]/a/div/div") public WebElement sirketler ;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/main/div/div[1]/div[1]/button[1]") public WebElement yeniSirket ;
    @FindBy(xpath = "//*[@placeholder='Şirket Adı']") public WebElement sirketAdi ;
    @FindBy(xpath = "//*[@id=\"isActive\"]") public WebElement aktifDurumu ;
    @FindBy(xpath = "//*[@placeholder ='Kısa Şirket Adı']") public WebElement kısaSirketAdi ;
    @FindBy(xpath = "//*[@placeholder ='Vergi No']") public WebElement vergiNo ;


}
