Feature: Validate Amazon search

Scenario Outline: Validate Amazon search

Given user visit amazon homepage
When user types "<productname>" and click search icon
Then user should be able to see the expected product

Examples:
|productname|
| iphone 14 promax |
