package steps;

import pages.tc_007Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class tc_007Steps {

    tc_007Page page = new tc_007Page();

    @Given("que he realizado una operación contable desde el sistema principal")
    public void realizarOperacionContable() {
        page.realizarOperacionContable();
    }

    @When("sincronizo la sábana contable con el sistema de contabilización")
    public void sincronizarSabanaContable() {
        page.sincronizarSabanaContable();
    }

    @Then("los registros contables deben coincidir en ambos sistemas sin discrepancias")
    public void verificarConsistenciaDatos() {
        assertTrue(page.verificarConsistenciaDatos());
    }
}