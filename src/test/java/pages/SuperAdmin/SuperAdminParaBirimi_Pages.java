package pages.SuperAdmin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SuperAdminParaBirimi_Pages {

    public SuperAdminParaBirimi_Pages(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/div/div/ul/li[5]/a/div/div") public WebElement paraBirimleri ;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/main/div/div[1]/div[1]/button[1]") public WebElement yeniParaBirimleri ;
    @FindBy(xpath = "//*[@id=\"name\"]") public WebElement isim   ;
    @FindBy(xpath = "//*[@class='inline-flex items-center justify-center rounded-md text-sm font-semibold ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-0 disabled:opacity-50 whitespace-nowrap disabled:pointer-events-none bg-primary text-primary-foreground hover:bg-primary/80 h-8 px-4 py-[10px]']") public WebElement kaydetButton  ;



}
