$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ToDOListFeature.feature");
formatter.feature({
  "line": 1,
  "name": "ToDoList Feature",
  "description": "",
  "id": "todolist-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 22,
  "name": "To verify the activate functionality",
  "description": "",
  "id": "todolist-feature;to-verify-the-activate-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@ClearCompletedButton"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "As user I should be able to launch the site \"https://todomvc.com/examples/vue/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I add the do to list \"hello\"",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "I add the do to list \"Bye\"",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "I add the do to list \"hie\"",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "I click on clearCompleted todo list button \"hello\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://todomvc.com/examples/vue/",
      "offset": 45
    }
  ],
  "location": "FirstStepDefenation.as_user_I_should_be_able_to_launch_the_site(String)"
});
formatter.result({
  "duration": 9421475437,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hello",
      "offset": 22
    }
  ],
  "location": "FirstStepDefenation.i_add_the_do_to_list(String)"
});
formatter.result({
  "duration": 10606220582,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bye",
      "offset": 22
    }
  ],
  "location": "FirstStepDefenation.i_add_the_do_to_list(String)"
});
formatter.result({
  "duration": 10184883028,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hie",
      "offset": 22
    }
  ],
  "location": "FirstStepDefenation.i_add_the_do_to_list(String)"
});
formatter.result({
  "duration": 10201848335,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hello",
      "offset": 44
    }
  ],
  "location": "FirstStepDefenation.i_click_on_clear_Completed_todo_list_button(String)"
});
formatter.result({
  "duration": 231364935,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "To verify the activate functionality",
  "description": "",
  "id": "todolist-feature;to-verify-the-activate-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@Verifynumber"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "As user I should be able to launch the site \"https://todomvc.com/examples/vue/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "I add the do to list \"hello\"",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "I add the do to list \"Bye\"",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "I add the do to list \"hie\"",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "I verify the number Added to List 3",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://todomvc.com/examples/vue/",
      "offset": 45
    }
  ],
  "location": "FirstStepDefenation.as_user_I_should_be_able_to_launch_the_site(String)"
});
formatter.result({
  "duration": 357709622,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hello",
      "offset": 22
    }
  ],
  "location": "FirstStepDefenation.i_add_the_do_to_list(String)"
});
formatter.result({
  "duration": 10217118004,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bye",
      "offset": 22
    }
  ],
  "location": "FirstStepDefenation.i_add_the_do_to_list(String)"
});
