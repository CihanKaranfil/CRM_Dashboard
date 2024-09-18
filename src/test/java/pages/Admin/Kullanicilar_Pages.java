package pages.Admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Kullanicilar_Pages {

    public Kullanicilar_Pages(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "(//*[@class='flex-1 truncate'])[1]") public WebElement kullanicilar ;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/main/div/div[1]/div[1]/button[1]") public WebElement yeniKullaniciEkle ;
    @FindBy(xpath = "//*[@placeholder='Tam Adı']") public WebElement kullaniciAdi ;
    @FindBy(xpath = "//*[@type='submit']") public WebElement kaydetButton ;
    @FindBy(xpath = "//*[@role='menuitem'][2]") public WebElement silButton ;
    @FindBy(xpath = "inline-flex items-center justify-center text-sm font-semibold ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-0 disabled:opacity-50 whitespace-nowrap disabled:pointer-events-none text-success-foreground h-8 px-4 py-[10px] bg-destructive border border-destructive rounded hover:bg-destructive-200") public WebElement silButton2 ;




    @FindBy(xpath = "//*[@class='items-center justify-center rounded-md text-sm font-semibold ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-0 disabled:opacity-50 whitespace-nowrap disabled:pointer-events-none hover:bg-primary/80 bg-transparent hover:text-primary-foreground text-primary flex h-8 w-8 p-0 data-[state=open]:bg-muted']") public List<WebElement> kullaniciList ;







}
