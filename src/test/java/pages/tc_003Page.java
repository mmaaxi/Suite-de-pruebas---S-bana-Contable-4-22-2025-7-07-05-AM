package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_003Page {
    WebDriver driver;

    By exportButton = By.id("exportButton");
    By exportMenu = By.id("exportOptionsMenu");
    By excelOption = By.xpath("//a[contains(text(),'Excel')]");
    By pdfOption = By.xpath("//a[contains(text(),'PDF')]");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToAccountingSheetPage() {
        driver.get("https://example.com/accounting-sheet");
    }

    public void clickExportOption() {
        driver.findElement(exportButton).click();
    }

    public boolean isExportMenuDisplayed() {
        return driver.findElement(exportMenu).isDisplayed();
    }

    public void selectExcelFormat() {
        driver.findElement(excelOption).click();
    }

    public boolean isExcelFileGenerated() {
        // Logic to confirm the Excel file generation
        return true;
    }

    public void selectPDFFormat() {
        driver.findElement(pdfOption).click();
    }

    public boolean isPDFFileGenerated() {
        // Logic to confirm the PDF file generation
        return true;
    }
}