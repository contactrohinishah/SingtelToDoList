Feature: ToDoList Feature


@First
Scenario: To verify that as user I can add my list
Given As user I should be able to launch the site "https://todomvc.com/examples/vue/"
Then I add the do to list "hello"

@ActivateToDo
Scenario: To verify the activate functionality
Given As user I should be able to launch the site "https://todomvc.com/examples/vue/"
Then I add the do to list "hello"
And I click on active todo list button

@CompleteZButton
Scenario: To verify the activate functionality
Given As user I should be able to launch the site "https://todomvc.com/examples/vue/"
Then I add the do to list "hello"
And I click on completed todo list button

@ClearCompletedButton
Scenario: To verify the activate functionality
Given As user I should be able to launch the site "https://todomvc.com/examples/vue/"
Then I add the do to list "hello"
Then I add the do to list "Bye"
Then I add the do to list "hie"
And I click on clearCompleted todo list button "hello"

@Verifynumber
Scenario: To verify the activate functionality
Given As user I should be able to launch the site "https://todomvc.com/examples/vue/"
Then I add the do to list "hello"
Then I add the do to list "Bye"
Then I add the do to list "hie"
And I verify the number Added to List 3
