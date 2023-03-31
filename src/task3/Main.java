package task3;

public class Main {
    public static void main(String[] args) {
        try {
            Movie movie = new Movie("mr. Bean", 1994);
            System.out.println(movie.toString());

        } catch (InvalidYearException e) {
            System.out.println(e.getDetails());
        }

        System.out.println("-".repeat(40));

        try {
            Movie movie = new Movie("Drunken Master", 2024);
            System.out.println(movie.toString());

        } catch (InvalidYearException e) {
            System.out.println(e.getDetails());
        }

    }
}
