public interface IShip {
    void addChelik(IPerson chelik);
    void startActions() throws ShipExeption;
    void startActionInMiddle() throws ShipExeption;
    void startFinall() throws ShipExeption;
    void setName(String name);
    String getName();
}
