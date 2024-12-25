public class Main {
    public static void main(String[] args) {
        Book book1 = new AdventureBook("Vefxistyaosani", 300, "Shota Rustaveli", true);
        Book book2 = new ScienceBook("Quantum Mechanics", 200, "Jane Smith", false, "Physics");
        Book book3 = new FantasyBook("The Dragon's Tale", 450, "Mark Brown", true, "Greece");

        Employee employee1 = new BookArranger("Alice", "Johnson", 1);
        Employee employee2 = new BookIssuer("Bob", "Williams", 2, "09:00", "17:00");
        Employee employee3 = new BookAdvisor("Charlie", "Davis", 3, 4.5, "Public Library");
        Employee employee4 = new SilenceController("David", "Miller", 4, 8.0);


        Employee[] employees = {employee1, employee2, employee3, employee4};
        Book[] books = {book1, book2, book3};
        Library library = new Library("City Library", employees, books);


        System.out.println(library);

        BookAdvisor advisor = (BookAdvisor) employee3;
        String[] bookTitles = {"The Lost City", "Quantum Mechanics", "The Dragon's Tale"};
        System.out.println("Recommended Book: " + advisor.recommendBook(bookTitles));
    }
}
