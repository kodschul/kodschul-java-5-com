public class Classes {

    String name;
    int age;

    public Classes(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }

    public static void main(String[] args) {
        Classes person1 = new Classes("Anna", 28);
        Classes person2 = new Classes("Ben", 34);

        person1.introduce();
        person2.introduce();

        System.out.println(person1.name + " and " + person2.name + " are different objects.");
    }
}
