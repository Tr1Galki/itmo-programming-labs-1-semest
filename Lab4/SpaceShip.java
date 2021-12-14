import java.util.ArrayList;
import java.util.List;

public class SpaceShip implements IShip{
    private String name;
    private int speed;

    List<IPerson> cheliky = new ArrayList<>();

    public class  RocketInAction{
        private int speed;

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public void action(){
            System.out.println(SpaceShip.this.name + " двигалась со скоростью " + this.speed + " км/c");
            SpaceShip.this.speed = this.speed;
        }
    }

    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void addChelik(IPerson chelik){
        cheliky.add(chelik);
    }

    @Override
    public void startActions() throws ShipExeption {
        if (cheliky.size() != 0) {
            for (IPerson chel : cheliky) {
                chel.mainAction();
            }
        } else {
            throw new ShipExeption("Корабль пустой");
        }
    }

    @Override
    public void startActionInMiddle() throws ShipExeption{
        if (cheliky.size() != 0) {
            for (IPerson chel : cheliky){
                chel.actionInMiddle();
            }
        } else {
            throw new ShipExeption("Корабль пустой");
        }
    }

    @Override
    public void startFinall() throws ShipExeption{
        if (cheliky.size() != 0) {
            for (IPerson chel : cheliky){
                chel.actionFinal();
            }
        } else {
            throw new ShipExeption("Корабль пустой");
        }
    }
}