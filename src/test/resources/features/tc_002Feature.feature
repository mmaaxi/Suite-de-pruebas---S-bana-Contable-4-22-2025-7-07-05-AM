Feature: Validar filtrado y búsqueda de información en la sábana

  Scenario: Búsqueda efectiva con filtrado de resultados
    Given Los criterios de búsqueda son ingresados en el campo de filtro
    When El usuario ejecuta la búsqueda
    Then El sistema muestra únicamente los registros que cumplen con el criterio
    And Los resultados corresponden a los datos esperados en la sábana contable