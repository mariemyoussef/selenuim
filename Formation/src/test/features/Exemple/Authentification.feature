
@tag
Feature: Authentification
  
  @tag1
  Scenario: Authentification valide
    Given ouvrir navigateur
    And ouvrir url
    When saisir user name
    And saisir mdp
    And cliquer sur le boutton Login
    Then vérifier le nom de profil
   

 