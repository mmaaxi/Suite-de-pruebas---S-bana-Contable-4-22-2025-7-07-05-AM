package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_001Page;

public class tc_001Steps {

    tc_001Page page = new tc_001Page();

    @Given("Accedo a la opción 'Cargar Sábana Contable' en el sistema")
    public void accedoAOpcionCargarSabanaContable() {
        page.navigateToCargaSabanaContable();
        Assert.assertTrue("No se muestra el formulario de carga", page.isCargaFormDisplayed());
    }

    @When("Selecciono un archivo contable válido")
    public void seleccionoArchivoContableValido() {
        page.selectValidContableFile("valid_contable_file.xlsx");
        Assert.assertTrue("El archivo no fue reconocido", page.isFileRecognized());
    }

    @Then("El archivo es reconocido y se muestran sus datos en la interfaz")
    public void archivoReconocido() {
        Assert.assertTrue("Los datos del archivo no se muestran", page.areFileDataDisplayed());
    }

    @When("Confirmo la carga de datos")
    public void confirmoCargaDeDatos() {
        page.confirmDataUpload();
    }

    @Then("El sistema procesa y guarda la información correctamente")
    public void sistemaProcesaInformacion() {
        Assert.assertTrue("La información no fue procesada correctamente", page.isDataProcessed());
    }
}