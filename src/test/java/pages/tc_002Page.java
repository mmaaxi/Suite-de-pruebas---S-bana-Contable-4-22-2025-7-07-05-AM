package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_002Page {
    WebDriver driver;

    By searchField = By.id("search-field");
    By searchButton = By.id("search-button");
    By resultsTable = By.id("results-table");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void enterSearchCriteria(String criteria) {
        WebElement searchElement = driver.findElement(searchField);
        searchElement.clear();
        searchElement.sendKeys(criteria);
    }

    public void executeSearch() {
        driver.findElement(searchButton).click();
    }

    public boolean isResultFilteredCorrectly(String expectedCriteria) {
        // Logic to verify the results table only contains the filtered results
        // Placeholder for demonstration
        return true;
    }

    public boolean areResultsAccurate() {
        // Logic to check if the results match expected accounting sheet data
        // Placeholder for demonstration
        return true;
    }
}