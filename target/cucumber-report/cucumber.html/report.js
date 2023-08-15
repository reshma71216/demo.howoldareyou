$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("homepage.feature");
formatter.feature({
  "line": 1,
  "name": "Age Calculation",
  "description": "",
  "id": "age-calculation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4846575600,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Valid name and invalid birthday entered",
  "description": "",
  "id": "age-calculation;valid-name-and-invalid-birthday-entered",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on homepage of given url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter name in username textbox",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter invalid birthdate in birthday textbox",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user click on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user verify \"you are too old to use it\" error message",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStep.userIsOnHomepageOfGivenUrl()"
});
formatter.result({
  "duration": 188797600,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.userEnterNameInUsernameTextbox()"
});
formatter.result({
  "duration": 161997900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.userEnterInvalidBirthdateInBirthdayTextbox()"
});
formatter.result({
  "duration": 71815300,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.userClickOnSubmitButton()"
});
formatter.result({
  "duration": 69632700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "you are too old to use it",
      "offset": 13
    }
  ],
  "location": "HomePageStep.userVerifyErrorMessage(String)"
});
formatter.result({
  "duration": 374351400,
  "status": "passed"
});
formatter.after({
  "duration": 824335000,
  "status": "passed"
});
});