Feature: Изтриване на тема
  
  Background:
  Given потребителят отваря тема, която иска да изтрие

  Scenario: администраторът иска да изтрие темата   
    When потребителят е администратор
    And натиснете бутона за изчистване
    Then вижда съобщение за успешно изтриване.
    
  Scenario:  обикновеният потребител иска да изтрие темата    
    When потребителят не администратор
    And натиснете бутона за изчистване
    Then вижда съобщение за неуспешно изтриване.
