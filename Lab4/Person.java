import java.util.Objects;

public abstract class Person implements IPerson{
    String name;

    public Person(String name){
        this.name = name;
    }

    @Override
    public abstract void mainAction() throws NeznaikaExeption;

    @Override
    public abstract void actionInMiddle();

    @Override
    public abstract void actionFinal();

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name);
    }
}
