package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_004Page;

public class tc_004Steps {

    tc_004Page contablePage = new tc_004Page();

    @Given("el usuario carga un archivo contable con columnas de montos")
    public void cargarArchivoContable() {
        contablePage.cargarArchivo();
        Assert.assertTrue(contablePage.isArchivoProcesado());
    }

    @When("el usuario ejecuta la función de cálculo automático")
    public void ejecutarCalculoAutomatico() {
        contablePage.ejecutarCalculo();
        Assert.assertTrue(contablePage.isCalculoEjecutado());
    }

    @Then("el sistema muestra sumatorias calculadas en las columnas correspondientes")
    public void validarSumatoriasCorrectas() {
        Assert.assertTrue(contablePage.isSumatoriaCorrecta());
    }

    @Then("las sumatorias coinciden con los valores calculados manualmente")
    public void validarSumatoriasConCalculosManuales() {
        Assert.assertTrue(contablePage.compararConCalculosManuales());
    }
}