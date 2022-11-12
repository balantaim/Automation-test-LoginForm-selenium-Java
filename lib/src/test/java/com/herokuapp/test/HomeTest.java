package com.herokuapp.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.herokuapp.pages.HomePage;

public class HomeTest extends BaseTest{
	
	HomePage homePage = new HomePage();
	
	final static String uName = "Ivan Ivanov", uPass = "Password9876543210", 
			uComment = "Ivan Kamenov Ivanov is a Bulgarian former professional "
					+ "footballer who played as a centre-back and now a manager of Slavia Sofia II "
					+ "and assistant to Bulgaria national team.";
	

	@Test(description = "Fill the data to the fields and submit")
	public void fillTheData() {
		//Find the element by css selector
		WebElement userNameElement = driver.findElement((By) homePage.nameField());
		//send data to the field
		userNameElement.sendKeys(uName);
		//Find the element by xPath
		WebElement userPassElement = driver.findElement((By) homePage.passField());
		userPassElement.sendKeys(uPass);
		//Find the element with css path
		WebElement userCommentElement = driver.findElement((By) homePage.commendField());
		//Clear the old string
		userCommentElement.clear();
		userCommentElement.sendKeys(uComment);
		//manage new checkbox, radio button, multiple choice selection
		WebElement checkBox1 = driver.findElement((By) homePage.fieldCheckBox1());
		checkBox1.click();
		WebElement checkBox3 = driver.findElement((By) homePage.FieldCheckBox3());
		checkBox3.click();
		WebElement radioItem3 = driver.findElement((By) homePage.fieldRadioItem3());
		radioItem3.click();
		WebElement multySelectValue1 = driver.findElement((By) homePage.fieldSelectValue1());
		multySelectValue1.click();
		//Create new select element
		Select dropdownSelect = new Select(driver.findElement((By) homePage.newSelectText()));
		//Select from items by visible text marker
		dropdownSelect.selectByVisibleText(homePage.SelectTextBox());
		//Submit the data
		WebElement btnSubmit = driver.findElement((By) homePage.btnSubmit());
		btnSubmit.click();	
	}
//	This should be executed in the new Class, because the page is different.
	@Test(description = "Check if the name value is correct")
	public void CheckTheName() {
		String checkNameData= homePage.assertName();
		//This is example how to check if the input is correct 
				Assert.assertEquals(uName, checkNameData);
	}

}
