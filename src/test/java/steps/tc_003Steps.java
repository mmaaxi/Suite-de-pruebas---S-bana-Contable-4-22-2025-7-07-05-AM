package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_003Page;
import org.junit.Assert;

public class tc_003Steps {
    tc_003Page exportPage = new tc_003Page();

    @Given("el usuario está en la página de la sábana contable")
    public void el_usuario_está_en_la_página_de_la_sábana_contable() {
        exportPage.navigateToAccountingSheetPage();
    }

    @When("el usuario selecciona la opción de exportar los datos")
    public void el_usuario_selecciona_la_opción_de_exportar_los_datos() {
        exportPage.clickExportOption();
    }

    @Then("se despliega un menú con las opciones de exportación: Excel y PDF")
    public void se_despliega_un_menú_con_las_opciones_de_exportación_Excel_y_PDF() {
        Assert.assertTrue("El menú de opciones de exportación no está desplegado",
                exportPage.isExportMenuDisplayed());
    }

    @When("el usuario elige el formato Excel")
    public void el_usuario_elige_el_formato_Excel() {
        exportPage.selectExcelFormat();
    }

    @Then("el sistema genera un archivo Excel con la información detallada")
    public void el_sistema_genera_un_archivo_Excel_con_la_información_detallada() {
        Assert.assertTrue("El archivo Excel no fue generado",
                exportPage.isExcelFileGenerated());
    }

    @When("el usuario elige el formato PDF")
    public void el_usuario_elige_el_formato_PDF() {
        exportPage.selectPDFFormat();
    }

    @Then("el sistema genera un archivo PDF con la información detallada")
    public void el_sistema_genera_un_archivo_PDF_con_la_información_detallada() {
        Assert.assertTrue("El archivo PDF no fue generado",
                exportPage.isPDFFileGenerated());
    }
}