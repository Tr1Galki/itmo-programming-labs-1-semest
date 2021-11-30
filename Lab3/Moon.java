public class Moon extends Globe {
    public Moon(String name, String sizeComparision){
        super(name, sizeComparision);
    }

    @Override
    public void color(){
        System.out.println("2) " + GlobeColor.SILVER.getTitle() + " " + name);
    }

    @Override
    public void size(){
        System.out.println(name + " же была " + sizeComparision);
    }
}
