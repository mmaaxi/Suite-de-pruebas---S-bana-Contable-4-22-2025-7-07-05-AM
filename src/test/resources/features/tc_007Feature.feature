Feature: Validar integración con sistema de contabilización

  Scenario: Verificar consistencia y sincronización de operaciones contables
    Given que he realizado una operación contable desde el sistema principal
    When sincronizo la sábana contable con el sistema de contabilización
    Then los registros contables deben coincidir en ambos sistemas sin discrepancias