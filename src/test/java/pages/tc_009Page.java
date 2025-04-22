package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tc_009Page {

    WebDriver driver;

    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login");
    private By accessDeniedMessage = By.id("accessDenied");
    private By accountInfo = By.id("accountInfo");
    private By operationErrorMessage = By.id("operationError");
  
    public Tc_009Page(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }
  
    public boolean isAccessDeniedMessageDisplayed() {
        return driver.findElement(accessDeniedMessage).isDisplayed();
    }
  
    public boolean isUserLoggedIn() {
        return driver.findElement(accountInfo).isDisplayed();
    }
  
    public boolean hasAccessToAccountInformation() {
        return driver.findElement(accountInfo).isDisplayed();
    }
  
    public void attemptUnauthorizedOperation() {
        // Implementar el código para realizar una operación no permitida
        driver.findElement(By.id("unauthorizedAction")).click();
    }
  
    public boolean isOperationBlocked() {
        return driver.findElement(operationErrorMessage).isDisplayed();
    }
  
    public boolean isSecurityLogUpdated() {
        // Implementar la verificación de la actualización del registro de seguridad
        return true;
    }
}