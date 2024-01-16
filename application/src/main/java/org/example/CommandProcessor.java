package org.example;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CommandProcessor {
    private final Map<String, Method> commands = new HashMap<>();

    public CommandProcessor(Object... commandObjects) {
        for (Object obj : commandObjects) {
            Class<?> cls = obj.getClass();
            for (Method method : cls.getMethods()) {
                if (method.isAnnotationPresent(Command.class)) {
                    Command commandAnnotation = method.getAnnotation(Command.class);
                    String commandName = method.getName();
                    commands.put(commandName, method);
                }
            }
        }
    }

    public void executeCommand(String commandName) {
        Method method = commands.get(commandName);
        if (method != null) {
            try {
                method.invoke(null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Commande inconnue : " + commandName);
        }
    }
}