package org.example;

public class HelloCommand {
    @Command(description = "Affiche un message de salutation")
    @a()
    public void hello() {
        System.out.println("Bonjour, monde !");
    }

}