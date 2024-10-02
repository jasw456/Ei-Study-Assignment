package Observer_pattern;

import java.util.ArrayList;
import java.util.List;

class TaskManager implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String message;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void addTask(String task) {
        this.message = "Task added: " + task;
        notifyObservers();
    }
}

