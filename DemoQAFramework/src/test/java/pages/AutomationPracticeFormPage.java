package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ElementUtils;

public class AutomationPracticeFormPage {
    WebDriver driver;

    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By email = By.id("userEmail");
    private By genderMale = By.xpath("(.//label[@class='custom-control-label'])[1]");
    private By phoneNumber = By.id("userNumber");
    private By submitButton = By.id("submit");
    private By dateofbirth = By.xpath(".//input[@id='dateOfBirthInput']");
    private By subject=By.xpath(".//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']");

    public AutomationPracticeFormPage(WebDriver driver) {
        this.driver = driver;
    }

   
    
    public void enterFirstName(String fname) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.elementToBeClickable(firstName));
        ElementUtils.enterText(driver, firstName, fname);
    }

    public void enterLastName(String lname) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.elementToBeClickable(lastName));
        ElementUtils.enterText(driver, lastName, lname);
    }

    public void enterEmail(String emailText) {
        ElementUtils.enterText(driver, email, emailText);
    }

    public void selectGender() {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.elementToBeClickable(genderMale));
        ElementUtils.clickElement(driver, genderMale);
    }

    public void enterPhoneNumber(String phone) {
        ElementUtils.enterText(driver, phoneNumber, phone);
    }
   
    public void clickOnDateOfBirth()
    {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.elementToBeClickable(dateofbirth));
    	ElementUtils.clickElement(driver, dateofbirth);
    }
    public void enterSubject(String subjectText)
    {
    	 ElementUtils.enterText(driver, subject, subjectText);
    }
   
    public void clickSubmit() {
        ElementUtils.clickElement(driver, submitButton);
    }
}