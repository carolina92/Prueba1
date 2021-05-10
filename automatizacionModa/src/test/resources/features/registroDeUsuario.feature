Feature: Registro de usuario en pagina de compras

  Scenario: Validar que al no tener registro en la pagina web, se permita la creacion de la cuenta
  Given Ingresar a la pagina de registro de cuenta
    When : Registrar los datos del usuario
    Then : El sistema debe de notificarme que quedo listo el registro