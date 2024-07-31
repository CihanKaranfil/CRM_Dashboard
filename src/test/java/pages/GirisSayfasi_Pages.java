package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GirisSayfasi_Pages {

    public GirisSayfasi_Pages(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[@id=\"email\"]") public WebElement email ;
    @FindBy(xpath = "//*[@id=\"password\"]") public WebElement sifre ;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div/div/form/button") public WebElement girisyap ;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/main/div/div[1]/div") public WebElement anaSayfa ;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]") public WebElement hataMesaji ;

}
