public class PrintedBook extends Title {
    protected int copies;
    protected int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType);
        this.copies = copies;
        this.pages = pages;
    }

    @Override
    public double calculatePoints() {
        //formel fra eks: Sider × litteraturtype × eksemplarer
        //dvs. 166 × 1.7 × 140 = 39508 point
        double litType = convertLiteratureType();
        return pages * litType * copies;
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
