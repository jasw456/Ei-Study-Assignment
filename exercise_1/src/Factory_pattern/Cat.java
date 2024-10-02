package Factory_pattern;

// Cat.java (Concrete Product)
class Cat implements Animal {
    @Override
    public void speak() {
        System.out.println("Meow");
    }
}
