public class Ponchik extends Person implements ISleepAction {
    public Ponchik(String name){
        super(name);
        System.out.println(name + " находится на корабле");
    }

    private boolean isSleeping;
    private boolean isEating;
    private int foodCount;
    private String task;

    @Override
    public boolean getSleeping(){
        return isSleeping;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void setSleeping(boolean isSleeping) {
        this.isSleeping = isSleeping;
    }

    @Override
    public void setTask(String task){
        this.task = task;
    }

    @Override
    public void setEating(boolean isEating){this.isEating = isEating;}

    @Override
    public void mainAction() {
        if (isSleeping) {
            if (isEating){
                foodCount = (int) (10+Math.random()*2);
                System.out.println("Задача " + task + " оказалась для " + name + " невыполнимой, ведь он заснул после " + foodCount + " порции с недоеденной космической сосиской во рту");
            }
            else{
                System.out.println("Задача " + task + " оказалась для " + name + " невыполнимой, ведь он заснул во время выполнения. Кстати, даже не поев:(");
            }
        }
        else{
            System.out.println(name + " выполнил задачу " + task + " и не спит :/");
        }
    }
}
