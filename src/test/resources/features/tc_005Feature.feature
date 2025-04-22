Feature: Edit and update data in the accounting sheet

  Scenario: Validate editing and updating of data in the accounting sheet
    Given I have opened the accounting sheet application
    When I select a record from the accounting sheet
    Then the record should be selected and editable
    When I modify one or more data fields
    Then the fields should allow editing without errors
    When I save the changes made
    Then the system should update and show the modified information in real-time