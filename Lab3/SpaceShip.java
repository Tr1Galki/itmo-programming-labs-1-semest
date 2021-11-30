import java.util.ArrayList;

public class SpaceShip implements IShip{
    ArrayList<Person> cheliky = new ArrayList<Person>();

    @Override
    public void addChelik(Person chelik){
        cheliky.add(chelik);
    }

    @Override
    public void startActions(){
        for (Person chel : cheliky){
            chel.mainAction();
        }
    }
}