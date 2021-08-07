package classes.users_counter;

public class User {
    public static int totalOnline = 0;
    public String email;
    public String name;
    public String surname;

    public User(String name, String surname, String email) {
        this.email = email;
        this.name = name;
        this.surname = surname;
    }
}