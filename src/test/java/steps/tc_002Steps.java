package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_002Page;
import static org.junit.Assert.assertTrue;

public class tc_002Steps {
    tc_002Page page = new tc_002Page();

    @Given("Los criterios de búsqueda son ingresados en el campo de filtro")
    public void enterSearchCriteria() {
        page.enterSearchCriteria("criterio de ejemplo");
    }

    @When("El usuario ejecuta la búsqueda")
    public void executeSearch() {
        page.executeSearch();
    }

    @Then("El sistema muestra únicamente los registros que cumplen con el criterio")
    public void verifyFilteredResults() {
        assertTrue(page.isResultFilteredCorrectly("criterio de ejemplo"));
    }

    @Then("Los resultados corresponden a los datos esperados en la sábana contable")
    public void verifyResultAccuracy() {
        assertTrue(page.areResultsAccurate());
    }
}