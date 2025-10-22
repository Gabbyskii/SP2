public class AudioBook extends Title{
    protected int durationInMinutes;
    protected int copies;

    public AudioBook(String title, String literatureType, int durationInMinutes, int copies){
        super(title, literatureType);
        this.durationInMinutes = durationInMinutes;
        this.copies = copies;
    }


    @Override
    public double calculatePoints() {
        // Implementation baseret på copies og durationInMinutes
    }

    @Override
    public double convertLiteratureType() {
        // Implementation baseret på literatureType
    }

}
