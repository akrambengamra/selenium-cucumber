@login
Feature: Je souhaite tester la connexion à l application Swag Lab
  En tant qu utilisateur je souhaite tester la connexion de l application Swag Labs

  @login_casPassant
  Scenario: Je souhaite tester la page connexion avec un cas passant 
    Given Je me connecte a l application Swag Labs
    When Je saisis le username "standard_user"
    And Je saisis le password "secret_sauce"
    And Je clique sur le bouton login
    Then Je me redidirige vers la page home Products
