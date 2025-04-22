package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_005Page {

    WebDriver driver;

    // Define locators for the elements
    By recordLocator = By.id("recordId");
    By editableField = By.className("editableField");
    By saveButton = By.id("saveButton");
    By updatedInfo = By.id("updatedInfo");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void selectRecord() {
        driver.findElement(recordLocator).click();
    }

    public boolean isRecordEditable() {
        return driver.findElement(editableField).isEnabled();
    }

    public void modifyDataFields(String newValue) {
        driver.findElement(editableField).clear();
        driver.findElement(editableField).sendKeys(newValue);
    }

    public boolean areFieldsEditable() {
        try {
            driver.findElement(editableField).sendKeys("test");
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void saveChanges() {
        driver.findElement(saveButton).click();
    }

    public boolean isInformationUpdated() {
        return driver.findElement(updatedInfo).isDisplayed();
    }
}