package StepsDefination;

import PageObjects.ArthematicOperations;
import PageObjects.Calculator;
import PageObjects.ExpectedResults;
import Utilities.BaseClass;
import WinCommands.winCommands;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class CalsiSteps extends  winCommands {
    winCommands commands = new winCommands();
    BaseClass baseClass = new BaseClass();
    Calculator calsi = new Calculator();
    ArthematicOperations op=new ArthematicOperations();
    ExpectedResults results=new ExpectedResults();
    @Given("User is able to Open the  Windows Calculator")
    public void user_is_able_to_Open_the_Windows_Calculator() throws IOException {
        baseClass.OpenApplication();
    }
    // ------------------------------ArthematicOperations-------------------------------------------
    @When("User is able Select the two Number {string} and {string} perform the {string}")
    public void user_is_able_Select_the_two_Number_and_perform_the(String Digits1, String Digits2, String operation) {
       calsi.navigation();
       calsi.standard( );
//        op.DecimalArithmeticOperation(Digits1,Digits2,operation);
        op.arthematicOperation(Digits1,Digits2, operation);
    }
    @When("get the operation results of {string} and {string} {string}")
    public void get_the_operation_results_of_and(String Digits1, String Digits2, String operations) {
        results.verification(Digits1,Digits2,operations);
    }

    //  ----------------------------Tempreature------------------------------------------------------
    @When("User is able Select the Celsius {string} do operation")
    public void user_is_able_Select_the_Celsius_do_operation(String Digit1) {
        calsi.tempreature(Digit1);
    }
    @When("get the Fehrenheit results of {string}")
    public void get_the_Fehrenheit_results_of(String Digits1) {
        results.tempreresults(Digits1);
    }
//  -----------------------------Length--------------------------------------------------
    @When("User is able Select the Centimeter {string} do operation")
    public void user_is_able_Select_the_Centimeter_do_operation(String Digits1) {
        calsi.Length(Digits1);
    }
    @When("get the Inches results of {string}")
    public void get_the_Inches_results_of(String Digits1) {
        results.lengthresults(Digits1);
    }
    @When("User is able Select the US doller {string} convert to Indian rupes")
    public void user_is_able_Select_the_US_doller_convert_to_Indian_rupes(String Digits1) {
        calsi.Currency(Digits1);
    }

    @When("get the results of Indian rupes {string}")
    public void get_the_results_of_Indian_rupes(String string) {

    }

    @Then("Verify the Results")
    public void verify_the_Results() throws IOException {

        baseClass.CloseApplication();
    }
//----------------------------------Bug-ScreenShot---------------------------------------------------
    @AfterStep
    public void takeScreenshot(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            byte[] scrennshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(scrennshot,"image/png","Bug-Screenshot");
//            Allure.addAttachment("ScreenShot", new ByteArrayInputStream(scrennshot));
        }
    }
}