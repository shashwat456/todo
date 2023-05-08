public class Test {
    public static void main(String[] args) {
        // create a new TodoList
        TodoList todoList = new TodoList();

        // add some tasks to the list
        todoList.addTask("Buy groceries");
        todoList.addTask("Do laundry");

        // print out the tasks in the list
        System.out.println("Tasks in todo list:");
        todoList.printTasks();

        // mark the first task as complete
        todoList.completeTask(0);

        // print out the updated tasks in the list
        System.out.println("\nTasks in todo list after completing first task:");
        todoList.printTasks();
    }
}
