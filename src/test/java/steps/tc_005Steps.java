package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_005Page;

public class tc_005Steps {

    WebDriver driver;
    tc_005Page accountingSheetPage;

    @Given("I have opened the accounting sheet application")
    public void openAccountingSheetApplication() {
        // Initialization of WebDriver and Page Object
        driver = // WebDriver initialization code
        accountingSheetPage = new tc_005Page(driver);
        driver.get("URL of the accounting sheet application");
    }

    @When("I select a record from the accounting sheet")
    public void selectRecordFromAccountingSheet() {
        accountingSheetPage.selectRecord();
    }

    @Then("the record should be selected and editable")
    public void verifyRecordIsSelectableAndEditable() {
        Assert.assertTrue(accountingSheetPage.isRecordEditable());
    }

    @When("I modify one or more data fields")
    public void modifyDataFields() {
        accountingSheetPage.modifyDataFields("new value");
    }

    @Then("the fields should allow editing without errors")
    public void verifyFieldsAllowEditing() {
        Assert.assertTrue(accountingSheetPage.areFieldsEditable());
    }

    @When("I save the changes made")
    public void saveChanges() {
        accountingSheetPage.saveChanges();
    }

    @Then("the system should update and show the modified information in real-time")
    public void verifySystemUpdatesInformation() {
        Assert.assertTrue(accountingSheetPage.isInformationUpdated());
    }

    // Add any necessary @After scenario code to close resources
}