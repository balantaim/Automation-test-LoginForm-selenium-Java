package com.herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
	
	By userName = By.cssSelector("#HTMLFormElements > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > input:nth-child(2)");
	By userPass = By.xpath("/html/body/div/div[3]/form/table/tbody/tr[2]/td/input");
	By userComm = By.cssSelector("html body div.page-body div.centered form#HTMLFormElements table tbody tr td textarea");
	By box1 = By.xpath("/html/body/div/div[3]/form/table/tbody/tr[5]/td/input[1]");
	By box3 = By.xpath("/html/body/div/div[3]/form/table/tbody/tr[5]/td/input[3]");
	By radioItem3 = By.cssSelector("#HTMLFormElements > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(6) > td:nth-child(1) > input:nth-child(4)");
	By selectValue1 = By.xpath("/html/body/div/div[3]/form/table/tbody/tr[7]/td/select/option[1]");
	By buttonSubmit = By.cssSelector("input.styled-click-button:nth-child(2)");
	By selectName = By.name("dropdown");
	
	By userNameAssert = By.id("_valueusername");
	
	public WebElement nameField() {
		return driver.findElement(userName);
	}
	public WebElement passField() {
		return driver.findElement(userPass);
	}
	public WebElement commendField() {
		return driver.findElement(userComm);
	}
	public WebElement fieldCheckBox1() {
		return driver.findElement(box1);
	}
	public WebElement FieldCheckBox3() {
		return driver.findElement(box3);
	}
	public WebElement fieldRadioItem3() {
		return driver.findElement(radioItem3);
	}
	public WebElement fieldSelectValue1() {
		return driver.findElement(selectValue1);
	}
	public WebElement btnSubmit() {
		return driver.findElement(buttonSubmit);
	}
	public WebElement newSelectText() {
		return driver.findElement(buttonSubmit);
	}
	public String SelectTextBox() {
		return "Drop Down Item 4";
	}


	public String assertName() {
		return driver.findElement(userNameAssert).getText();
	}
}
