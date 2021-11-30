import java.util.ArrayList;

public class Neznaika extends Person implements IShattleActions {
    public Neznaika(String name){
        super(name);
        System.out.println(name + " так же находится на корабле");
    }

    private boolean isMateSleep;
    private String mateName;

    @Override
    public void getMateSleep(boolean isMateSleep) {
        this.isMateSleep = isMateSleep;
    }

    @Override
    public void getMateName(String mateName){
        this.mateName = mateName;
    }

    ArrayList<Globe> sphers = new ArrayList<Globe>();

    @Override
    public void addSphere(Globe sphere){
        sphers.add(sphere);
    }

    @Override
    public void mainAction(){
        if(isMateSleep){
            System.out.println("Зная что " + mateName + " спит, " + name + " решил прогуляться и посмотреть на небо. Среди звёзд он увидел на небе 2 тела:");
            for (Globe sphere: sphers){
                sphere.color();
            }
            System.out.println("Что касается размеров, " + name + " заметил, что:");
            for (Globe sphere: sphers){
                sphere.size();
            }
            for (Globe sphere: sphers){
                String tmp = sphere.name;
                if (tmp.equals("Луна")){
                    System.out.println(name + "  подумал, что он замечает на поверхности Луны такие подробности, которых не замечал раньше");
                    if (Math.random() > 0.5){
                        System.out.println("Он считал, что это из-за близкого расстояния до луны");
                    }
                    else{
                        System.out.println("Так скорее всего от того, что он стал смотреть на Луну внимательнее");
                    }
                }
            }
        }
        else{
            System.out.println("ALARMED! ALARMED! " + mateName + " НЕ СПИТ! ПОВТОРЯЮ! НЕ СПИТ! ПОБОЧНОГО ПЛАНА НЕТ, НАЧИНАЮ БЕЗДЕЙСТВИЕ!");
        }
    }
}
