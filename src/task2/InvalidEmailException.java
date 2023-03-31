package task2;

public class InvalidEmailException extends Exception {
    String email;
    public InvalidEmailException(String message, String email) {
        super(message);
        this.email = email;
    }

    public String getDetails() {
        return "email address " + this.email + " is not valid";
    }
}
