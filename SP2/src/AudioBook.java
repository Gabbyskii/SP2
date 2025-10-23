public class AudioBook extends Title {
    protected int copies;
    protected int durationInMinutes;

    public AudioBook(String title, String literatureType, int durationInMinutes, int copies) {
        super(title, literatureType);
        this.copies = copies;
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    public double calculatePoints() {
        //formel fra eks: (varighed i minutter × 0.5) × litteraturtype × eksemplarer
        //(192 × 0.5) × 1.7 × 140 = 22848 point
        double typeValue = convertLiteratureType();
        return (durationInMinutes * 0.5) * typeValue * copies;
    }

    @Override
    public double convertLiteratureType() {
        switch (literatureType) {
            case "BI":
            case "TE":
                return 3;
            case "LYRIK":
                return 6;
            case "SKØN":
                return 1.7;
            case "FAG":
            default:
                return 1;
        }
    }

}
