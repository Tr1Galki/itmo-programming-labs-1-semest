import java.util.ArrayList;
import java.util.List;

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

    List<IGlobe> sphers = new ArrayList<>();

    @Override
    public void addSphere(Globe sphere){
        sphers.add(sphere);
    }

    @Override
    public void mainAction() throws NeznaikaExeption {
        if(isMateSleep){
            System.out.println("Зная что " + mateName + " спит, " + name + " решил прогуляться и посмотреть на небо. Среди звёзд он увидел на небе 2 тела:");
            if (sphers.size() != 0) {
                for (IGlobe sphere : sphers) {
                    try {
                        sphere.color();
                    } catch (NeznaikaExeption e){
                        e.printStackTrace();
                    }
                }
            } else {
                throw new NeznaikaExeption("Нету сфер, " + name + " летит в никуда");
            }

            System.out.println("Что касается размеров, " + name + " заметил, что:");
            for (IGlobe sphere : sphers) {
                try {
                    sphere.size();
                } catch (NeznaikaExeption e){
                    e.printStackTrace();
                }
            }

            for (IGlobe sphere: sphers){
                try {
                    String tmp = sphere.getName();
                    if (tmp.equals("Луна")) {
                        System.out.println(name + "  подумал, что он замечает на поверхности Луны такие подробности, которых не замечал раньше");
                        if (Math.random() > 0.5) {
                            System.out.println("Он считал, что это из-за близкого расстояния до луны");
                        } else {
                            System.out.println("Так скорее всего от того, что он стал смотреть на Луну внимательнее");
                        }
                    }
                } catch (NeznaikaExeption e){
                    e.printStackTrace();
                }
            }
        }
        else{
            throw new NeznaikaExeption("ALARMED! ALARMED! " + mateName + " НЕ СПИТ! ПОВТОРЯЮ! НЕ СПИТ! ПОБОЧНОГО ПЛАНА НЕТ, НАЧИНАЮ БЕЗДЕЙСТВИЕ!");
        }
    }

    @Override
    public void actionInMiddle(){
        System.out.println(this.name + " считал, что ракета застыла на месте и не приближается к Луне");
    }

    @Override
    public void actionFinal(){
        class NezMoon{
            private int hours;

            public void setHours(){
                if (Math.random() > 0.5){
                    this.hours = 4;
                }
                else{
                    this.hours = 3;
                }
            }

            public void actionSeen(){
                setHours();
                System.out.println("Прошло " + this.hours + " часа, a " + Neznaika.this.name + " смотрел на Луну и не" +
                        " мог оторваться\nЛуна притягивала его взгляды");
            }

            public void actionLast(){
                System.out.println("Незнайка захотел есть и, спустившись в пищевой отсек, увидел там своего друга");
            }
        }

        NezMoon nezMoon = new NezMoon();
        nezMoon.actionSeen();
        nezMoon.actionLast();
    }
}
