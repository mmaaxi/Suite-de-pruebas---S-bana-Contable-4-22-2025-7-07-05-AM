package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_004Page {

    WebDriver driver;

    private By archivoProcesadoIndicator = By.id("archivo-indicator");
    private By botonCalculo = By.id("btn-calculo");
    private By calculoEjecucionIndicator = By.id("calculo-indicator");
    private By sumaCorrectaIndicator = By.id("suma-indicator");

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void cargarArchivo() {
       // Lógica para cargar archivo contable
    }

    public boolean isArchivoProcesado() {
        return driver.findElement(archivoProcesadoIndicator).isDisplayed();
    }

    public void ejecutarCalculo() {
        driver.findElement(botonCalculo).click();
    }

    public boolean isCalculoEjecutado() {
        return driver.findElement(calculoEjecucionIndicator).isDisplayed();
    }

    public boolean isSumatoriaCorrecta() {
        return driver.findElement(sumaCorrectaIndicator).isDisplayed();
    }

    public boolean compararConCalculosManuales() {
        // Lógica para comparar sumatoria con cálculos manuales
        return true;
    }
}