
@tag
Feature: recherche google
 

  @tag1
  Scenario: recherche pays
    Given ouvrir le nnavigateur
    And taper url "https://www.google.com/"
    When taper le nom du pays "Tunisie" dans le barre de recherche
    And cliquer entrer
    
    Then vérifier que la phrase contient le mot "réuslats"
  

 