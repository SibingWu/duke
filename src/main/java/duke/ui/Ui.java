package duke.ui;

import duke.tasklist.TaskList;
import duke.tasks.Task;

import java.util.Scanner;

public class Ui {
    private Scanner in;
    
    public Ui() {
        in = new Scanner(System.in);
    }
    
    public void displayWelcomeMessage() {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);

        System.out.println("Hello! I'm Duke");
        System.out.println("What can I do for you?\n");
    }
    
    
    // command related
    public String readCommand() {
        String input = in.nextLine();
        return input;
    }

    public void listTasks(TaskList tasks) {
//        System.out.println("Here are the tasks in your list:");
        if (tasks.getListSize() == 0) {
            System.out.println("Empty List.");
            return;
        }
        
        for (int i = 1; i <= tasks.getListSize(); i++) {
            Task task = tasks.getTask(i);
            System.out.print(String.format("%d.", i));
            System.out.println(task);
        }
    }

    public void displayDoneCommandMessage(Task task) {
        System.out.println("Nice! I've marked this task as done:");
        System.out.print("  ");
        System.out.println(task);
    }

    public void displayAddTaskMessage(Task task, int taskQuantity) {
        System.out.println("Got it. I've added this task:");
        System.out.print("  ");
        System.out.println(task);
        System.out.println(String.format("Now you have %d tasks in the list.", taskQuantity));
    }

    public void displayDeleteTaskMessage(TaskList tasks, int taskNumber) {
        System.out.println("Noted. I've removed this task: ");
        System.out.print("  ");
        System.out.println(tasks.getTask(taskNumber));

        // display the message first, then delete the task
        System.out.println(String.format("Now you have %d tasks in the list.", tasks.getListSize() - 1)); 
    }
    
    public void displayClearAllMessage() {
        System.out.println("All tasks cleared.");
    }

    public void displayExitMessage() {
        System.out.println("Bye. Hope to see you again soon!");
    }
    
    
    // exception related
    public void displayLoadingError() {
        System.out.println("Something goes wrong when loading files...");
    }
    
    public void displayEmptyListMessage() {
        System.out.println("Empty List.");
    }
    
    public void displayInvalidTaskNumberMessage() {
        System.out.println("Please enter a valid task number~");
    }

    public void displayCommandNotFoundMessage() {
        System.out.println("OOPS!!! I'm sorry, but I don't know what that means :-(");
    }

    public void displayEmptyDescriptionMessage(String command) {
        System.out.println(String.format("OOPS!!! The description of a %s cannot be empty.", command));
    }

    public void displayTimeMissingMessage() {
        System.out.println("Oops! Time is missing!");
    }
    
    public void displayTimeFormatErrorMessage() {
        System.out.println("The time format is wrong. Please follow: yyyy-mm-dd, thank you!");
    }

    public void displayErrorMessage(Exception e) {
        System.out.println("Something went wrong: " + e.getMessage());
    }
}