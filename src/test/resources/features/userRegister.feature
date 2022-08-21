#Autor: Jose Luis
@stories
Feature: User registration in Utest
  As a user I want to enter the Utest page and be able to fill out the form in order to create a new user
  @scenario1
  Scenario: User registration in Utest
    Given than Jose Luis wishes to register on the Utest page
    When the user enters the data required by the system
      |strNombre | strApellido | strEmail            | strMesNacimiento | strDiaNacimiento | strAnoNacimiento | strCiudad | strCodigoPostal | strPais  | strDispositivoMovil | strModelo | strSistemaOperativo | strPassword |
      | Jose     | Luis        | correo@utest.com | July             | 23               | 1992             |  Cali     | 760034          | Colombia | Apple               | iPhone 3G | iOS 4.1             | R0jasC42023_  |
    Then the registration is completed when you see the Complete Setup button
      | strTextoFinal  |
      | Complete Setup |




