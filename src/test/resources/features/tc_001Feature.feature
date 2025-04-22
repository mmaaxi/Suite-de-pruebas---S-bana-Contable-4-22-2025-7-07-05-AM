Feature: Carga de Datos Contables

  Scenario: Validar carga de datos contables
    Given Accedo a la opción 'Cargar Sábana Contable' en el sistema
    When Selecciono un archivo contable válido
    Then El archivo es reconocido y se muestran sus datos en la interfaz
    And Confirmo la carga de datos
    Then El sistema procesa y guarda la información correctamente