package tests;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.AutomationPracticeFormPage;

public class AutomationPracticeFormTest extends BaseTest {
    @Test
    public void testFormSubmission() {
        test = extent.createTest("Form Submission Test");

        try {
            AutomationPracticeFormPage formPage = new AutomationPracticeFormPage(driver);

            formPage.enterFirstName("Ranjit");
            formPage.enterLastName("Bachute");
            formPage.enterEmail("ranjit@example.com");
            formPage.selectGender();
            formPage.enterPhoneNumber("1234567890");
            formPage.clickSubmit();

            test.pass("Form submitted successfully");
        } catch (Exception e) {
            test.fail("Test execution failed: " + e.getMessage());
        }
    }
}