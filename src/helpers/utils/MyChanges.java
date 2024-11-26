package helpers.utils;

import java.util.HashMap;
import java.util.function.Function;

public class MyChanges {
    private static final HashMap<String, Function<?, Integer>> changeHandlers = new HashMap<>();

    public static <T> void listenToChange(String changeId, Function<T, Integer> handleChange) {
        changeHandlers.put(changeId, handleChange);
    }

    @SuppressWarnings("unchecked")
    public static <T> void initiateChange(String changeId, T argument) {
        var changeHandler = changeHandlers.get(changeId);
        if (changeHandler == null) {
            throw new IllegalArgumentException("No handler registered for changeId: " + changeId);
        }

        Function<T, Integer> handler = (Function<T, Integer>) changeHandler;
        handler.apply(argument);
    }
}
