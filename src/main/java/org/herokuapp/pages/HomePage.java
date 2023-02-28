package org.herokuapp.pages;

import org.apache.logging.log4j.Logger;
import org.herokuapp.base.PropertiesHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage  extends BasePageObject{

    By userName = By.xpath("//input[@name='username']"),
    userPass = By.xpath("//input[@name='password']"),
    userComment = By.xpath("//textarea[@name='comments']"),
    box1 = By.xpath("//input[@value='cb1']"),
    box3 = By.xpath("//input[@value='cb3']"),
    radioItem3 = By.cssSelector("//input[@value='rd3']"),
    selectValue1 = By.xpath("//option[@value='ms1']"),
    buttonSubmit = By.xpath("//input[@value='submit']"),
    dropdownSelector = By.xpath("//select[@name='dropdown']"),
    userNameAssert = By.id("_valueusername"),
    userPassAssert = By.id("_valuepassword"),
    dropdownItemAssert = By.id("_valuedropdown"),
    backBtn = By.id("back_to_form");
    final String sectionItem = "Drop Down Item 4";

    public HomePage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void loadPageUrl() {
        PropertiesHelper properties = new PropertiesHelper();
        driver.get(properties.baseUrl);
    }

    public void sendNameToField(String name) {
        WebElement element = waitUntilPresenceOfElement(userName, 15);
        element.sendKeys(name);
    }

    public void sendPasswordToField(String pass) {
        WebElement element = waitUntilPresenceOfElement(userPass, 15);
        element.sendKeys(pass);
    }
    public void commentField(String comment) {
        WebElement element = waitUntilPresenceOfElement(userComment, 15);
        element.clear();
        element.sendKeys(comment);
    }
    public void fieldCheckBox1() {
        WebElement element = waitUntilItemToBeClickable(box1, 15);
        element.click();
    }
    public void fieldCheckBox3() {
        WebElement element = waitUntilItemToBeClickable(box3, 15);
        element.click();
    }
    public void fieldRadioItem3() {
        WebElement element = waitUntilItemToBeClickable(radioItem3, 15);
        element.click();
    }
    public void fieldSelectValue1() {
        WebElement element = waitUntilItemToBeClickable(selectValue1, 15);
        element.click();
    }
    public void btnSubmit() {
        driver.findElement(buttonSubmit).click();
    }
    public void newSelectText() {
        Select dropdownSelect = new Select(driver.findElement(dropdownSelector));
        //Select from items by visible text marker
        dropdownSelect.selectByVisibleText(sectionItem);
    }
    public String assertName() {
        WebElement element = waitUntilPresenceOfElement(userNameAssert, 15);
        return element.getText();
    }
    public String assertPass() {
        return driver.findElement(userPassAssert).getText();
    }
    public String assertDropdownItemSelected() {
        return driver.findElement(dropdownItemAssert).getText();
    }
    public boolean backBtnIsDisplayed() {
        WebElement btn = waitUntilPresenceOfElement(backBtn, 15);
        return btn.isDisplayed();
    }
}
