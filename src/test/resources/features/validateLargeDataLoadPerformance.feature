Feature: Validate performance when loading large volumes of data

  Scenario: Load a large accounting file and monitor processing
    Given I have a large accounting file ready for upload
    When I upload the large accounting file
    Then the system should start processing the file without blocking

    When I monitor the load and processing time
    Then the system should load and process the data within an acceptable time without failures

    When I verify the interface stability during the process
    Then the application should not freeze and allow interaction without issues