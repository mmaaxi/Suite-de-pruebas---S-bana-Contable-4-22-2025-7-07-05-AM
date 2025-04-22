package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_006Page;

public class tc_006Steps {

    WebDriver driver;
    tc_006Page contablePage = PageFactory.initElements(driver, tc_006Page.class);

    @Given("que el usuario ha iniciado sesión y está en la página de sábana contable")
    public void que_el_usuario_ha_iniciado_sesión_y_está_en_la_página_de_sábana_contable() {
        contablePage.navigateToContablePage();
    }

    @When("el usuario selecciona múltiples registros")
    public void el_usuario_selecciona_múltiples_registros() {
        contablePage.selectMultipleRecords();
    }

    @Then("el sistema permite la selección de múltiples registros")
    public void el_sistema_permite_la_selección_de_múltiples_registros() {
        contablePage.verifyMultipleSelection();
    }

    @When("el usuario ejecuta la opción 'Eliminar'")
    public void el_usuario_ejecuta_la_opción_Eliminar() {
        contablePage.clickDeleteOption();
    }

    @Then("el sistema solicita confirmación para eliminar los registros")
    public void el_sistema_solicita_confirmación_para_eliminar_los_registros() {
        contablePage.verifyDeleteConfirmationPrompt();
    }

    @When("el usuario confirma la eliminación")
    public void el_usuario_confirma_la_eliminación() {
        contablePage.confirmDeletion();
    }

    @Then("los registros son eliminados de la base de datos y no son visibles en la interfaz")
    public void los_registros_son_eliminados_de_la_base_de_datos_y_no_son_visibles_en_la_interfaz() {
        contablePage.verifyRecordsDeleted();
    }
}