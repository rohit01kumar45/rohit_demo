Feature: Login process automation of Gravityer web
Scenario Outline: To check login is successful using valid credentials
Given User is on login page "<login page>"
When Users enters valid "<username>" amd "<password>"
And Clicks on Login button on Gravityer login page
Then User should be navigated to Next page
And User closes the browser

Examples:
|        login page        |        username        |        password        |
|        https://talent.gravityer.com/login        |        rohit01kumar45@gmail.com        |        R@hitk#09        |
