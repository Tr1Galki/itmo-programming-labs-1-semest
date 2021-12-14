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

    public static class Distance implements IDistance{
        private String charact;
        final private int lenght = 400000;
        final private String name = "Луна";

        public Distance(String charact){
            this.charact = charact;
        }

        @Override
        public void description(){
            System.out.println("Это объясняется тем, что расстояние от Земли до " + this.name + " " + this.charact +
                    ", около " + this.lenght + " километров");
        }
    }
}
