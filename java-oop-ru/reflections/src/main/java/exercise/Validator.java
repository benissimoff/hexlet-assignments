package exercise;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class Validator {
    public static List<String> validate(Object obj) {
        return Arrays.stream(obj.getClass().getDeclaredFields())
                .filter((field) -> field.isAnnotationPresent(NotNull.class))
                .filter((field) -> {
                    try {
                        field.setAccessible(true);
                        return field.get(obj) == null;
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                })
                .map(Field::getName)
                .collect(Collectors.toList());
    }
}
// END
