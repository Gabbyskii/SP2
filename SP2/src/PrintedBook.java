public class PrintedBook extends Title{
    protected int pages;
    protected int copies;

    public PrintedBook(String title, String literatureType, int copies, int pages){
        super(title, literatureType);
        this.copies = copies;
        this.pages = pages;
    }

    @Override
    public double calculatePoints() {
        // Implementation baseret på copies og pages
    }

    @Override
    public double convertLiteratureType() {
        // Implementation baseret på literatureType
    }
}
