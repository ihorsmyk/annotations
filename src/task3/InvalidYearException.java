package task3;

public class InvalidYearException extends RuntimeException {
    int year;

    public InvalidYearException(String message, int year) {
        super(message);
        this.year = year;
    }

    public String getDetails() {
        return "entered year " + year + " is not valid";
    }
}
