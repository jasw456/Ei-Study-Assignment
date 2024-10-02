package Observer_pattern;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        manager.addObserver(user1);
        manager.addObserver(user2);

        manager.addTask("Complete project report");
    }
}
