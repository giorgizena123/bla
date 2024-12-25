class Book {
    protected String title;
    protected int pages;
    protected String author;
    protected boolean hardCover;

    public Book(String title, int pages, String author, boolean hardCover) {
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.hardCover = hardCover;
    }

    public void read() {
        System.out.println("I am reading the book " + title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", author='" + author + '\'' +
                ", hardCover=" + hardCover +
                '}';
    }
}
