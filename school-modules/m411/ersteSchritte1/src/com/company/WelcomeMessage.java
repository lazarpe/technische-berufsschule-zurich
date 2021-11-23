package com.company;

public class WelcomeMessage {
    static String[] persons = {"Tom", "Mirjam"};

    public void saySomething(boolean alreadySeen, String name) {
        String result = (alreadySeen) ? "Good bye" + name: "Hello" + name;
        System.out.println(result);
    }

    public static void main(String[] args) {
        WelcomeMessage msg = new WelcomeMessage();

        for (int i = 0; i < persons.length; i++) {
            msg.saySomething(true, getPersons()[i]);
        }
    }

    public static String[] getPersons() {
        return persons;
    }

    public static void setPersons(String[] persons) {
        WelcomeMessage.persons = persons;
    }
}


/*
package com.company;

public class WelcomeMessage {
    static String[] persons = {"Tom", "Mirjam"};

    public void saySomething(boolean alreadySeen, String name) {
        String result = (alreadySeen) ? "Good bye" + name: "Hello" + name;
        System.out.println(result);
    }

    public static void main(String[] args) {
        WelcomeMessage msg = new WelcomeMessage();

        for (int i = 0; i < persons.length; i++) {
            msg.saySomething(true, getPersons()[i]);
        }
    }

    public static String[] getPersons() {
        return persons;
    }

    public static void setPersons(String[] persons) {
        WelcomeMessage.persons = persons;
    }
}


 */