package com.company;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    /*HashMap<Integer, String> hashmap = new HashMap<>();
	    hashmap.put(1, "Ich bin Lazar");
        hashmap.put(2, "Ich bin Janna");
        hashmap.put(3, "Ich bin Davide");

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        System.out.println(hashmap.get(input));

        testMethod(0);
*/
        User user1 = new User("Davide", "pass");
        //User user2 = new User("Anojan", "pass");
        User user2 = user1;

        System.out.println(user1.equals(user2));
    }

    public static void testMethod(int i) {
        if (i < 10) {
            System.out.println(i);
            testMethod(++i);
        }
    }
}

class User {
    String name;
    String passwd;

    public User(String name, String passwd) {
        this.name = name;
        this.passwd = passwd;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(passwd, user.passwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, passwd);
    }
}