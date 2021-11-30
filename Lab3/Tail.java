public class Tail {
    public static void main(String[] args){
        Ponchik ponchik = new Ponchik("Пончик");
        Neznaika neznaika = new Neznaika("Незнайка");
        Sun sun = new Sun("Солнце", "такое же");
        Moon moon = new Moon("Луна", "в 2 раза больше");
        neznaika.addSphere(sun);
        neznaika.addSphere(moon);

        SpaceShip ship = new SpaceShip();
        ship.addChelik(ponchik);
        ship.addChelik(neznaika);

        ponchik.setTask("задание №322");
        ponchik.setSleeping(true);
        ponchik.setEating(true);
        neznaika.getMateSleep(ponchik.getSleeping());
        neznaika.getMateName(ponchik.getName());

        ship.startActions();
    }
}

