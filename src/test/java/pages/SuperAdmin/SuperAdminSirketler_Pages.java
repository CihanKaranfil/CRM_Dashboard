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
    @FindBy(xpath = "//*[@role='menuitem'][3]") public WebElement silButton ;
    @FindBy(xpath = "//*[@class='inline-flex items-center justify-center text-sm font-semibold ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-0 disabled:opacity-50 whitespace-nowrap disabled:pointer-events-none text-success-foreground h-8 px-4 py-[10px] bg-destructive border border-destructive rounded hover:bg-destructive-200']") public WebElement silButton2 ;

    @FindBy(xpath = "//*[@class='items-center justify-center rounded-md text-sm font-semibold ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-0 disabled:opacity-50 whitespace-nowrap disabled:pointer-events-none hover:bg-primary/80 bg-transparent hover:text-primary-foreground text-primary flex h-8 w-8 p-0 data-[state=open]:bg-muted']") public List<WebElement> sirketList ;


}
