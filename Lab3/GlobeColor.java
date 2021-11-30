public enum GlobeColor {
    BRIGHT ("Ярко сверкающее диском"),
    SILVER ("Cеребристая и светящаяся");

    private String title;

    GlobeColor(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "GlobeColor{" +
                "title = '" + title + '\'' +
                '}';
    }
}