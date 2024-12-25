class BookArranger extends Employee {
    public BookArranger(String firstName, String lastName, int id) {
        super(firstName, lastName, id);
    }

    @Override
    public String toString() {
        return "BookArranger{" + super.toString() + "}";
    }
}

class BookIssuer extends Employee {
    private String startTime;
    private String endTime;

    public BookIssuer(String firstName, String lastName, int id, String startTime, String endTime) {
        super(firstName, lastName, id);
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "BookIssuer{" +
                super.toString() +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }
}

class BookAdvisor extends Employee {
    private double rating;
    private String libraryType;

    public BookAdvisor(String firstName, String lastName, int id, double rating, String libraryType) {
        super(firstName, lastName, id);
        this.rating = rating;
        this.libraryType = libraryType;
    }

    public String recommendBook(String[] books) {
        int randomIndex = (int) (Math.random() * books.length);
        return books[randomIndex];
    }

    @Override
    public String toString() {
        return "BookAdvisor{" +
                super.toString() +
                ", rating=" + rating +
                ", libraryType='" + libraryType + '\'' +
                '}';
    }
}

class SilenceController extends Employee {
    private double strictness;

    public SilenceController(String firstName, String lastName, int id, double strictness) {
        super(firstName, lastName, id);
        this.strictness = strictness;
    }

    @Override
    public String toString() {
        return "SilenceController{" +
                super.toString() +
                ", strictness=" + strictness +
                '}';
    }
}
