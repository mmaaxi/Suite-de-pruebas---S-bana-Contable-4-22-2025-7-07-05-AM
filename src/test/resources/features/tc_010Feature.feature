Feature: Validar interfaz de usuario y mensajes de error

  Scenario: Verificar comportamiento de la interfaz y mensajes de error

    Given el usuario está en la página principal
    When interactúa con diferentes elementos de la interfaz
    Then los elementos responden de forma intuitiva y consistente

    When el usuario introduce datos inválidos en los formularios de la sábana contable
    Then el sistema muestra mensajes de error precisos y amigables para el usuario

    When el usuario valida la presentación visual y accesibilidad de la interfaz
    Then la interfaz cumple con estándares de accesibilidad y usabilidad