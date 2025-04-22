Feature: Validar seguridad y acceso a la sábana contable

  Scenario: Usuario sin permisos intenta acceder
    Given el usuario está en la página de login
    When ingresa las credenciales de usuario sin permisos
    Then el sistema deniega el acceso y muestra un mensaje de error de autorización

  Scenario: Usuario autorizado accede correctamente
    Given el usuario está en la página de login
    When ingresa las credenciales válidas de usuario autorizado
    Then el usuario ingresa correctamente 
    And tiene acceso a la información

  Scenario: Operación no permitida por el usuario
    Given el usuario autorizado tiene acceso a la sábana contable
    When intenta realizar una operación no permitida
    Then el sistema impide la acción
    And registra el incumplimiento en el log de seguridad