package exercise;

import java.util.Map;

// BEGIN
import java.util.ArrayList;
import java.util.List;

class SingleTag extends Tag {
    SingleTag(String name, Map<String, String> attributes) {
        super(name, attributes);
    }

    public String toString() {
        List<String> arrAttributes = new ArrayList<>();
        super.attributes.forEach((key, value) -> {
            arrAttributes.add(String.format("%s=\"%s\"", key, value));
        });
        String stringAttributes = String.join(" ", arrAttributes);
        String result = String.format("<%s>", String.join(" ", List.of(name, stringAttributes)).trim());

        return result;
    }
}
// END
