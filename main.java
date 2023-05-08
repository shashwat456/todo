import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    private ArrayList<String> items;
    
    public TodoList() {
        items = new ArrayList<String>();
    }
    
    public void addItem(String item) {
        items.add(item);
    }
    
    public void removeItem(int index) {
        items.remove(index);
    }
    
    public void printList() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println(i + 1 + ". " + items.get(i));
        }
    }
    
    public static void main(String[] args) {
        TodoList list = new TodoList();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Enter a command: add, remove, print, or quit");
            String command = scanner.nextLine();
            
            if (command.equals("add")) {
                System.out.println("Enter an item to add:");
                String item = scanner.nextLine();
                list.addItem(item);
            } else if (command.equals("remove")) {
                System.out.println("Enter the index of the item to remove:");
                int index = Integer.parseInt(scanner.nextLine()) - 1;
                list.removeItem(index);
            } else if (command.equals("print")) {
                list.printList();
            } else if (command.equals("quit")) {
                break;
            } else {
                System.out.println("Invalid command.");
            }
        }
    }
}
