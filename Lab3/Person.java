import java.util.Objects;

public abstract class Person {
    String name;

    public Person(String name){
        this.name = name;
    }

    public abstract void mainAction();

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
}
