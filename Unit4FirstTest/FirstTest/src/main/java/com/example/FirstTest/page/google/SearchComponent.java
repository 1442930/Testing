package com.example.FirstTest.page.google;

import com.example.FirstTest.page.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class SearchComponent extends Base {

    @FindBy(xpath = "//*[@id=\"i15\"]/div[4]/div/div/div[1]/div/div/input")
    private WebElement searchBox;

    @FindBy(xpath = "//*[@id=\"yDmH0d\"]/c-wiz[2]/div/div[2]/c-wiz/div/c-wiz/c-wiz/div[2]/div[1]/div[1]/div[2]/div/button")
    //*[@id="yDmH0d"]/c-wiz[2]/div/div[2]/c-wiz/div/c-wiz/c-wiz/div[2]/div[1]/div[1]/div[2]/div/button

    private WebElement searchButton;

    public void search(final String destination){
        this.searchBox.sendKeys(destination);
        this.searchButton.click();
    }

    @Override
    public boolean isAt(){
        return this.wait.until((d) -> this.searchBox.isDisplayed());
    }
}
