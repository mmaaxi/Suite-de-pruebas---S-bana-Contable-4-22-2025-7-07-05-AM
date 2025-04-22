package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_001Page {

    WebDriver driver;

    By cargaForm = By.id("cargaForm");
    By fileInput = By.id("fileInput");
    By dataDisplay = By.id("dataDisplay");
    By confirmButton = By.id("confirmButton");
    By successMessage = By.id("successMessage");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToCargaSabanaContable() {
        driver.get("https://example.com/cargar-sabana-contable");
    }

    public boolean isCargaFormDisplayed() {
        return driver.findElement(cargaForm).isDisplayed();
    }

    public void selectValidContableFile(String filePath) {
        driver.findElement(fileInput).sendKeys(filePath);
    }

    public boolean isFileRecognized() {
        return driver.findElement(dataDisplay).isDisplayed();
    }

    public boolean areFileDataDisplayed() {
        return driver.findElement(dataDisplay).isDisplayed();
    }

    public void confirmDataUpload() {
        driver.findElement(confirmButton).click();
    }

    public boolean isDataProcessed() {
        return driver.findElement(successMessage).isDisplayed();
    }
}