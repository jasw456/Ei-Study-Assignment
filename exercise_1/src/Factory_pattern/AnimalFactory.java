package Factory_pattern;

// AnimalFactory.java (Factory)
class AnimalFactory {
    public static Animal createAnimal(String type) {
        if (type.equals("dog")) {
            return new Dog();
        } else if (type.equals("cat")) {
            return new Cat();
        }
        return null;
    }
}
