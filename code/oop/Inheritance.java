public class Inheritance {

    static class Animal {
        protected String name;

        Animal(String name) {
            this.name = name;
        }

        String makeSound() {
            return "...";
        }

        @Override
        public String toString() {
            return name + " says " + makeSound();
        }
    }

    static class Dog extends Animal {
        Dog(String name) {
            super(name);
        }

        @Override
        String makeSound() {
            return "Woof";
        }
    }

    static class Cat extends Animal {
        Cat(String name) {
            super(name);
        }

        @Override
        String makeSound() {
            return "Meow";
        }
    }

    public static void main(String[] args) {
        Animal[] animals = { new Dog("Rex"), new Cat("Luna") };

        for (Animal animal : animals) {
            System.out.println(animal); // toString() picks the overridden makeSound() at runtime
        }
    }
}
