package Factory_pattern;

// Main.java
public class Main {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.createAnimal("dog");
        dog.speak();  // Output: Bark

        Animal cat = AnimalFactory.createAnimal("cat");
        cat.speak();  // Output: Meow
    }
}

