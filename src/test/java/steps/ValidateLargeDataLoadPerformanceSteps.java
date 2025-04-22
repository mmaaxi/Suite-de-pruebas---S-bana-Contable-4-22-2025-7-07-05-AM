import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.ValidateLargeDataLoadPerformancePage;

public class ValidateLargeDataLoadPerformanceSteps {

    WebDriver driver;
    ValidateLargeDataLoadPerformancePage dataLoadPerformancePage;

    @Given("I have a large accounting file ready for upload")
    public void i_have_a_large_accounting_file_ready_for_upload() {
        // Assume the file is ready in a specific location
        dataLoadPerformancePage = new ValidateLargeDataLoadPerformancePage(driver);
    }

    @When("I upload the large accounting file")
    public void i_upload_the_large_accounting_file() {
        dataLoadPerformancePage.uploadLargeFile();
    }

    @Then("the system should start processing the file without blocking")
    public void the_system_should_start_processing_the_file_without_blocking() {
        dataLoadPerformancePage.verifyProcessingStartsWithoutBlocking();
    }

    @When("I monitor the load and processing time")
    public void i_monitor_the_load_and_processing_time() {
        dataLoadPerformancePage.monitorLoadAndProcessingTime();
    }

    @Then("the system should load and process the data within an acceptable time without failures")
    public void the_system_should_load_and_process_the_data_within_an_acceptable_time_without_failures() {
        dataLoadPerformancePage.verifyProcessingTimeIsAcceptable();
    }

    @When("I verify the interface stability during the process")
    public void i_verify_the_interface_stability_during_the_process() {
        dataLoadPerformancePage.verifyInterfaceStability();
    }

    @Then("the application should not freeze and allow interaction without issues")
    public void the_application_should_not_freeze_and_allow_interaction_without_issues() {
        dataLoadPerformancePage.verifyApplicationStability();
    }
}