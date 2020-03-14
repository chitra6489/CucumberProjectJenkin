Feature: Verify the Facebook Detail
Scenario Outline: Veifying the login Details
Given User in on Facebook page
When User enter "<username>" and "<password>"
Then User should click login button

Examples:
|username|password|
|hello1|23454|
|heloo23|3454745|
|kjdhgfsdfb|21453456|