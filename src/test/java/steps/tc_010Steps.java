package steps;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_010Page;

public class tc_010Steps {
    
    WebDriver driver;
    tc_010Page page;

    @Given("^el usuario está en la página principal$")
    public void usuarioEnPaginaPrincipal() {
        page = new tc_010Page(driver);
        page.navigateToHomePage();
    }

    @When("^interactúa con diferentes elementos de la interfaz$")
    public void interactuarElementosInterfaz() {
        assertTrue(page.checkElementsInteractivity());
    }

    @Then("^los elementos responden de forma intuitiva y consistente$")
    public void verificarRespuestaElementos() {
        assertTrue(page.verifyElementsResponse());
    }

    @When("^el usuario introduce datos inválidos en los formularios de la sábana contable$")
    public void introducirDatosInvalidos() {
        page.enterInvalidData();
    }

    @Then("^el sistema muestra mensajes de error precisos y amigables para el usuario$")
    public void verificarMensajesError() {
        assertTrue(page.verifyErrorMessages());
    }

    @When("^el usuario valida la presentación visual y accesibilidad de la interfaz$")
    public void validarPresentacionYAccesibilidad() {
        assertTrue(page.checkVisualPresentationAndAccessibility());
    }

    @Then("^la interfaz cumple con estándares de accesibilidad y usabilidad$")
    public void verificarEstándaresAccesibilidadYUsabilidad() {
        assertTrue(page.verifyAccessibilityAndUsabilityStandards());
    }
}