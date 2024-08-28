package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SirketveKisiler_Pages {

    public SirketveKisiler_Pages(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/div/div/ul/li[3]/div[1]/div[1]/div") public WebElement sirketveKisiler ;
    @FindBy(xpath = "//*[@id=\"radix-:rh:\"]/ul/li[2]/a/div/span") public WebElement sirketler ;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/main/div/div[1]/div[1]/button[1]") public WebElement yeniSirket ;
    @FindBy(xpath = "//*[@id=\"radix-:r1q:\"]/div[2]/div[1]/div[1]/div") public WebElement sirketAdi ;
    @FindBy(xpath = "//*[@placeholder=\"Şirket Adı\"]") public WebElement sirketAdi2 ;
    @FindBy(xpath = "//*[@id=\"radix-:r1q:\"]/div[2]/div[1]/div[3]/button/svg") public WebElement durum ;
    @FindBy(xpath = "//*[@placeholder='Web Sitesi']") public WebElement webSitesi ;
    @FindBy(xpath = "//*[@placeholder='Ülke']") public WebElement ulke ;
    @FindBy(xpath = "//*[@id=\"radix-:r1c:\"]/div[2]/div[3]/div[3]/button") public WebElement ilgiliKullanici ;
    @FindBy(xpath = "//*[@placeholder='Ticaret Ünvanı']") public WebElement ticariUnvan ;
    @FindBy(xpath = "//*[@type='submit']") public WebElement kaydetButton ;



   // @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/main/div/div[1]/div[2]/div/table/tbody/tr[6]/td[9]") public List<WebElement> sirketlerList ;


}
