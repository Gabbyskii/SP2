public abstract class Title {
    protected String title;
    protected String literatureType;
    protected static final double RATE = 0.067574;

    public Title(String title, String literatureType) {
        this.title = title;
        this.literatureType = literatureType;
    }

    public double calculateRoyalty() {
        return calculatePoints() * RATE;
    }

    public abstract double calculatePoints();
    public abstract double convertLiteratureType();

}
