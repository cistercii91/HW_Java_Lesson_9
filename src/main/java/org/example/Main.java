package org.example;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday.setDay(23);
        post.birthday.setMonth(4);
        post.birthday.setYear(1991);
        post.name = "Андрей";
        post.passport = "1111 № 111111";
        post.phone = "+7 (999)-999-99-99";
        post.patronymic = "Иванович";
        post.subscription = true;
        post.surname = "Иванов";

        Post post2 = new Post();
        post2.birthday.setDay(10);
        post2.birthday.setMonth(5);
        post2.birthday.setYear(2001);
        post2.name = "Дима";
        post2.passport = "2222 № 222222";
        post2.phone = "+7 (999)-999-99-99";
        post2.patronymic = "Владимирович";
        post2.subscription = true;
        post2.surname = "Водянов";

        System.out.println(post.birthday.getDay() + "  " + post.birthday.getYear() + "   " + post.birthday.getMonth());
        System.out.println(post2.birthday.getDay() + "  " + post2.birthday.getYear() + "   " + post2.birthday.getMonth());
    }
}