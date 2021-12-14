public class Sun extends Globe {
    public Sun(String name, String sizeComparision){
        super(name, sizeComparision);
    }

    @Override
    public void color(){
        System.out.println("1) " + GlobeColor.BRIGHT.getTitle() + " " + name);
    }

    @Override
    public void size(){
        System.out.println(name + " было " + sizeComparision + ", каким оно видно с земли");
    }
}
