package pages.Admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Sirketler_Pages {

    public Sirketler_Pages(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/div/div/ul/li[3]/div[1]/div[1]/div") public WebElement sirketveKisiler ;
    @FindBy(xpath = "//*[@class='block pl-9 first:pt-4 last:pb-4 relative before:absolute first:before:top-4 before:top-0 before:left-4 before:w-[3px] kk'][2]") public WebElement sirketler ;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/main/div/div[1]/div[1]/button[1]") public WebElement yeniSirket ;
    @FindBy(xpath = "//*[@id=\"radix-:r1q:\"]/div[2]/div[1]/div[1]/div") public WebElement sirketAdi ;
    @FindBy(xpath = "//*[@placeholder=\"Şirket Adı\"]") public WebElement sirketAdi2 ;
    @FindBy(xpath = "//*[@id=\"radix-:r1q:\"]/div[2]/div[1]/div[3]/button/svg") public WebElement durum ;
    @FindBy(xpath = "//*[@placeholder='Web Sitesi']") public WebElement webSitesi ;
    @FindBy(xpath = "//*[@placeholder='Ülke']") public WebElement ulke ;
    @FindBy(xpath = "//*[@id=\"radix-:r1c:\"]/div[2]/div[3]/div[3]/button") public WebElement ilgiliKullanici ;
    @FindBy(xpath = "//*[@placeholder='Ticaret Ünvanı']") public WebElement ticariUnvan ;
    @FindBy(xpath = "//*[@type='submit']") public WebElement kaydetButton ;
    @FindBy(xpath = "//*[@role='menuitem'][4]") public WebElement silButton ;
    @FindBy(xpath = "(//*[@type='button'])[27]") public WebElement silButton2 ;
    @FindBy(xpath = "//*[@id=\"radix-:rb0:\"]/div[2]/button[2]") public WebElement silButton3 ;
    @FindBy(xpath = "//*[@class='inline-flex items-center justify-center text-sm font-semibold ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-0 disabled:opacity-50 whitespace-nowrap disabled:pointer-events-none text-success-foreground h-8 px-4 py-[10px] bg-destructive border border-destructive rounded hover:bg-destructive-200']") public WebElement silButton4 ;





    @FindBy(xpath = "//*[@class='items-center justify-center rounded-md text-sm font-semibold ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-0 disabled:opacity-50 whitespace-nowrap disabled:pointer-events-none hover:bg-primary/80 bg-transparent hover:text-primary-foreground text-primary flex h-8 w-8 p-0 data-[state=open]:bg-muted']") public List<WebElement> sirketlerList ;


}
