Feature: Zigwheels Application Testing
	
  Scenario: Google Login
    Given user launches the application
    When user performs google login
    Then login should be successful
