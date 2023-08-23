
@tag
Feature: création facebook
  

  @tag1
  Scenario: créer un compte facebook 
    Given ouvrir le navig
    And taper URl "https://www.facebook.com/"
    When cliquer sur le boutton
    And saisir Firstname "Elaa"
    And saisir lastname "LANDARI"
    And saisir email "mariemyoussef@hotamil.fr"
    And confirmer "mariemyoussef@hotamil.fr"
    And saisir mdp "1254fgh"
    And selectionner day "19"
    And selectionner month "sep"
    And selectionner year "1982"
    And seletionner genre "femme"
    And cliquer sur inscrir
    Then vérifier la création de compte par l'affichage de mot "test ok"
  

