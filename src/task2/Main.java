package task2;

public class Main {
    public static void main(String[] args) throws InvalidEmailException {

        User user0 = null;
        try {
            user0 = new User("Archimed", "archi777gmail");
            System.out.println(user0.toString());

        } catch (InvalidEmailException e) {
            System.out.println(e.getDetails());
        }

        System.out.println("-".repeat(40));

        User user1 = null;
        try {
            user1 = new User("Galileo di Vincenzo Bonaiuti de 'Galilei", "galiley123@gmail.com");
            System.out.println(user1.toString());

        } catch (InvalidEmailException e) {
            System.out.println(e.getDetails());
        }
    }
}
