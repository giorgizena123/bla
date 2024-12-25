class Library {
    private String name;
    private Employee[] employees;
    private Book[] books;

    public Library(String name, Employee[] employees, Book[] books) {
        this.name = name;
        this.employees = employees;
        this.books = books;
    }

    @Override
    public String toString() {
        StringBuilder employeeInfo = new StringBuilder();
        for (Employee e : employees) {
            employeeInfo.append(e.toString()).append("\n");
        }

        StringBuilder bookInfo = new StringBuilder();
        for (Book b : books) {
            bookInfo.append(b.toString()).append("\n");
        }

        return "Library{" +
                "name='" + name + '\'' +
                ", employees=\n" + employeeInfo.toString() +
                ", books=\n" + bookInfo.toString() +
                '}';
    }
}
