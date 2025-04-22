package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_006Page {
    WebDriver driver;

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id='select-records']")
    private WebElement selectRecordsCheckbox;

    @FindBy(xpath = "//*[@id='delete-button']")
    private WebElement deleteButton;

    @FindBy(id = "confirmation-dialog")
    private WebElement confirmationDialog;

    public void navigateToContablePage() {
        driver.get("https://example.com/contablePage");
    }

    public void selectMultipleRecords() {
        selectRecordsCheckbox.click(); // Logic to select multiple checkboxes
    }

    public void verifyMultipleSelection() {
        // Implement verification that multiple records are selected
    }

    public void clickDeleteOption() {
        deleteButton.click();
    }

    public void verifyDeleteConfirmationPrompt() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(confirmationDialog));
    }

    public void confirmDeletion() {
        // Logic to confirm deletion
    }

    public void verifyRecordsDeleted() {
        // Verify records are no longer visible and removed from the database
    }
}