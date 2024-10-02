package Factory_pattern;

// Dog.java (Concrete Product)
class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("Bark");
    }
}