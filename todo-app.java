import java.util.ArrayList;
import java.util.List;

public class TodoApp {
    private static List<String> todos = new ArrayList<>();

    public static void addTodo(String task) {
        todos.add(task);
    }

    public static void viewTodos() {
        for (int i = 0; i < todos.size(); i++) {
            System.out.println(i + 1 + " " + todos.get(i));
        }
    }

    public static void main(String[] args) {
        addTodo("Buy milk");
        addTodo("Finish homework");
        viewTodos();
    }
}
