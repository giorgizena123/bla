class AdventureBook extends Book {
    public AdventureBook(String title, int pages, String author, boolean hardCover) {
        super(title, pages, author, hardCover);
    }

    @Override
    public String toString() {
        return "AdventureBook{" + super.toString() + "}";
    }
}

class ScienceBook extends Book {
    private String scienceField;

    public ScienceBook(String title, int pages, String author, boolean hardCover, String scienceField) {
        super(title, pages, author, hardCover);
        this.scienceField = scienceField;
    }

    @Override
    public String toString() {
        return "ScienceBook{" +
                super.toString() +
                ", scienceField='" + scienceField + '\'' +
                '}';
    }
}

class FantasyBook extends Book {
    private String country;

    public FantasyBook(String title, int pages, String author, boolean hardCover, String country) {
        super(title, pages, author, hardCover);
        this.country = country;
    }

    @Override
    public String toString() {
        return "FantasyBook{" +
                super.toString() +
                ", country='" + country + '\'' +
                '}';
    }
}
