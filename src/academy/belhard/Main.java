package academy.belhard;

import academy.belhard.entity.Person;
import academy.belhard.entity.User;

public class Main {

    public static void main(String[] args) {
        Person test1 = new Person("Tom", "Hardy");
        System.out.println(test1.getFullName());
        System.out.println();
        User user1 = new User("Yan","Makhnis","makhnis@gmail.com","19362");
        System.out.println(user1.getFullInfo());
        System.out.println("Соответствие паролю пользователя: "+ user1.isPasswordCorrect("19363"));
        System.out.println();
        User user2 = new User("Ivan","Ivanov","ivanov@mail.ru","ivanov1912");
        System.out.println(user2.getFullInfo());
        System.out.println("Соответствие паролю пользователя: "+ user2.isPasswordCorrect("ivanov1912"));
    }
}
