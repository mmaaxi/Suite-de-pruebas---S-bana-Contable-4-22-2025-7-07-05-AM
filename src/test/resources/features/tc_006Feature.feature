Feature: Validar eliminación de registros en la sábana contable

  Scenario: Eliminar registros en la sábana contable
    Given que el usuario ha iniciado sesión y está en la página de sábana contable
    When el usuario selecciona múltiples registros
    Then el sistema permite la selección de múltiples registros
    When el usuario ejecuta la opción 'Eliminar'
    Then el sistema solicita confirmación para eliminar los registros
    When el usuario confirma la eliminación
    Then los registros son eliminados de la base de datos y no son visibles en la interfaz