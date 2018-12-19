$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ExecuteTheOrder.feature");
formatter.feature({
  "line": 3,
  "name": "Testing the order execution flow",
  "description": "",
  "id": "testing-the-order-execution-flow",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@mainTests"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Send the order for \u0027100\u0027 Eggs",
  "description": "",
  "id": "testing-the-order-execution-flow;send-the-order-for-\u0027100\u0027-eggs",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I have launched the app",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "the count of eggs is positive",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I pick the option \"Y\" to buy eggs",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I provide the number of eggs equal to \u002710\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I provide the size of eggs equal to \"L\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I pick the delivery date as \"20190101\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I see the confirmation that my order has been executed successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs.i_have_launched_the_app()"
});
formatter.result({
  "duration": 168981466,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat StepDefinitions.StepDefs.i_have_launched_the_app(StepDefs.java:13)\r\n\tat ✽.Given I have launched the app(ExecuteTheOrder.feature:7)\r\n",
  "status": "pending"
});
formatter.match({
  "location": "StepDefs.the_count_of_eggs_is_positive()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Y",
      "offset": 19
    }
  ],
  "location": "StepDefs.i_pick_the_option_to_buy_eggs(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 39
    }
  ],
  "location": "StepDefs.i_provide_the_number_of_eggs_equal_to(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "L",
      "offset": 37
    }
  ],
  "location": "StepDefs.i_provide_the_size_of_eggs_equal_to(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "20190101",
      "offset": 29
    }
  ],
  "location": "StepDefs.i_pick_the_delivery_date_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefs.i_see_the_confirmation_that_my_order_has_been_executed_successfully()"
});
formatter.result({
  "status": "skipped"
});
});