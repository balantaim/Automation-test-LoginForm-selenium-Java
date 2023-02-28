package org.herokuapp.tests;

import org.herokuapp.base.TestUtilities;
import org.herokuapp.pages.HomePage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class HomeTests  extends TestUtilities {

    //Test data
    final String uName = "Ivan Ivanov", uPass = "Password9876543210",
            uComment = "Ivan Kamenov Ivanov is a Bulgarian former professional "
                    + "footballer who played as a centre-back and now a manager of Slavia Sofia II "
                    + "and assistant to Bulgaria national team.";

    @Test(description = "Test: Login to herokuapp webpage", priority = 1)
    public void myLoginTest(){
        HomePage homePage = new HomePage(driver, log);
        //Load home page
        homePage.loadPageUrl();
        //Send data for username
        homePage.sendNameToField(uName);
        //Send data for password
        homePage.sendPasswordToField(uPass);
        //Clear the comment field and write new comment
        homePage.commentField(uComment);
        //manage new checkbox, radio button, multiple choice selection
        homePage.fieldCheckBox1();
        homePage.fieldCheckBox3();
        homePage.fieldSelectValue1();
        homePage.newSelectText();
        //Submit the data
        homePage.btnSubmit();
        //Compare the date with softAssert
        SoftAssert softAssert = new SoftAssert();
        //Check username and password
        softAssert.assertEquals(homePage.assertName(), uName, "User name is incorrect!");
        softAssert.assertEquals(homePage.assertPass(), uPass, "Password is incorrect!");
        softAssert.assertEquals(homePage.assertDropdownItemSelected(), "dd4", "Dropdown item is incorrect!");
        //Check if the back button is displayed
        softAssert.assertTrue(homePage.backBtnIsDisplayed(), "Back button is not displayed!");

        softAssert.assertAll();
    }

}
