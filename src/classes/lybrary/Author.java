package author;

import java.util.Date;

import user.User;

public class Author {
    public String name;
    public String surname;
    public Date birthday;
    public String country;

    public Author(User user, Date birthday, String country) {
        this.name = user.name;
        this.surname = user.surname;
        this.birthday = birthday;
        this.country = country;
    }
}