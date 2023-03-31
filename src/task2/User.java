package task2;

import java.util.regex.*;

public class User {
    private String name;
    @ValidEmail
    private String email;

    public User(String name, String email) throws InvalidEmailException {
        this.name = name;
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            throw new InvalidEmailException("invalid email", email);
        }
    }

    private boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) throws InvalidEmailException {
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            throw new InvalidEmailException("invalid email", email);
        }
    }

    @Override
    public String toString() {
        return "name: " + this.name + "\nemail: " + this.email;
    }
}
