Feature: Validar sumatorias y cálculos en la sábana contable

  Scenario: Validar cálculos en un archivo contable
    Given el usuario carga un archivo contable con columnas de montos
    When el usuario ejecuta la función de cálculo automático
    Then el sistema muestra sumatorias calculadas en las columnas correspondientes
    And las sumatorias coinciden con los valores calculados manualmente