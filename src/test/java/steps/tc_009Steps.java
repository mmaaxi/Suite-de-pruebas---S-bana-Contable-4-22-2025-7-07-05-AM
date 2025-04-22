package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.Tc_009Page;

public class Tc_009Steps {

    WebDriver driver;
    Tc_009Page tc_009Page = new Tc_009Page(driver);
  
    @Given("^el usuario está en la página de login$")
    public void el_usuario_esta_en_la_pagina_de_login() {
        // Navegar a la página de login
        driver.get("https://ejemplo.com/login");
    }

    @When("^ingresa las credenciales de usuario sin permisos$")
    public void ingresa_las_credenciales_de_usuario_sin_permisos() {
        tc_009Page.login("usuarioSinPermisos", "contraseñaInvalida");
    }

    @Then("^el sistema deniega el acceso y muestra un mensaje de error de autorización$")
    public void el_sistema_deniega_acceso_y_muestra_mensaje_de_error() {
        Assert.assertTrue(tc_009Page.isAccessDeniedMessageDisplayed());
    }

    @When("^ingresa las credenciales válidas de usuario autorizado$")
    public void ingresa_las_credenciales_validas_de_usuario_autorizado() {
        tc_009Page.login("usuarioAutorizado", "contraseñaValida");
    }

    @Then("^el usuario ingresa correctamente$")
    public void el_usuario_ingresa_correctamente() {
        Assert.assertTrue(tc_009Page.isUserLoggedIn());
    }

    @Then("^tiene acceso a la información$")
    public void tiene_acceso_a_la_informacion() {
        Assert.assertTrue(tc_009Page.hasAccessToAccountInformation());
    }
  
    @Given("^el usuario autorizado tiene acceso a la sábana contable$")
    public void el_usuario_autorizado_tiene_acceso_a_la_sabana_contable() {
        Assert.assertTrue(tc_009Page.isUserLoggedIn());
    }
  
    @When("^intenta realizar una operación no permitida$")
    public void intenta_realizar_una_operacion_no_permitida() {
        tc_009Page.attemptUnauthorizedOperation();
    }

    @Then("^el sistema impide la acción$")
    public void el_sistema_impide_la_accion() {
        Assert.assertTrue(tc_009Page.isOperationBlocked());
    }

    @Then("^registra el incumplimiento en el log de seguridad$")
    public void registra_el_incumplimiento_en_el_log_de_seguridad() {
        Assert.assertTrue(tc_009Page.isSecurityLogUpdated());
    }
}