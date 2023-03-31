package task1;

public class ImmutablePerson {
    @ReadOnly
    private final String name;
    @ReadOnly
    private final int age;

    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "name: " + this.name + "\nage: " + this.age;
    }
}
