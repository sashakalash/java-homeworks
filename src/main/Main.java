package main;

import classes.users_counter.User;

class Main {
    public static void main(String[] args) {
        createUser("Ivan", "Ivanov", "s_utra_khodit@bez.shtanov");
        createUser("Ivan", "Ivanych", "odevaet_shtany@na.noch");
        createUser("Abraham", "Lincoln", "a.lincoln@gmail.com");

        System.out.println("Сейчас онлайн " + User.totalOnline + " пользователя(ей)");
    }

    public static void createUser(String name, String surname, String email) {
        new User("Ivan", "Ivanov", "s_utra_khodit@bez.shtanov");
        User.totalOnline++;
    }
}