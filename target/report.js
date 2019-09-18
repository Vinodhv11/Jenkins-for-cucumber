$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/AddTariff.feature");
formatter.feature({
  "name": "AddTariff flow",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on add tariff plan button",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariffPlan.user_clicks_on_add_tariff_plan_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters all the required fields with valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "AddTariffPlan.user_enters_all_the_required_fields_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the submit button at the bottom of the page",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariffPlan.user_clicks_on_the_submit_button_at_the_bottom_of_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Tariff plan is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTariffPlan.tariff_plan_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/Features/customer.feature");
formatter.feature({
  "name": "AddCustomer Flow",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User click on add customer button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.user_click_on_add_customer_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters all the fields with valid data",
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerSteps.user_enters_all_the_fields_with_valid_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.user_clicks_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be displayed and customer id is generated",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerSteps.user_should_be_displayed_and_customer_id_is_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});