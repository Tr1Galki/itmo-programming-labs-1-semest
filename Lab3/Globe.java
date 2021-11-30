import java.util.Objects;

public abstract class Globe {
    String sizeComparision;
    String name;

    public Globe(String name, String sizeComparision){
        this.name = name;
        this.sizeComparision = sizeComparision;
    }

    public abstract void size();
    public abstract void color();

    @Override
    public int hashCode() {
        return Objects.hash(name, sizeComparision);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                "sizeComparision='" + sizeComparision + '\'' +
                '}';
    }
}