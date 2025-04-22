Feature: Exportación de Sábana Contable

  Scenario: Validar exportación de la sábana contable a formatos Excel y PDF
    Given el usuario está en la página de la sábana contable
    When el usuario selecciona la opción de exportar los datos
    Then se despliega un menú con las opciones de exportación: Excel y PDF
    When el usuario elige el formato Excel
    Then el sistema genera un archivo Excel con la información detallada
    When el usuario elige el formato PDF
    Then el sistema genera un archivo PDF con la información detallada