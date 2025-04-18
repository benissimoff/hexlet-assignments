package exercise;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class PairedTag extends Tag {
    private String text;
    private List<Tag> subTags;

    PairedTag(
            String name,
            Map<String, String> attributes,
            String text,
            List<Tag> subTags
    ) {
        super(name, attributes);
        this.text = text;
        this.subTags = subTags;
    }

    public String toString() {
        List<String> arrAttributes = new ArrayList<>();
        super.attributes.forEach((key, value) -> {
            arrAttributes.add(String.format("%s=\"%s\"", key, value));
        });
        String stringAttributes = String.join(" ", arrAttributes);

        List<String> arrSubTags = new ArrayList<>();
        for (Tag subTag : subTags) {
            arrSubTags.add(subTag.toString());
        }
        String strSubTags = arrSubTags.stream().
                map(Object::toString).
                collect(Collectors.joining(""));
                //.reduce("", (a, b) -> a.concat(" "));

//        String strSubTags = String.join("", arrSubTags);
        List<String> arrResult = List.of("<" + name, stringAttributes);
        String result = String.format(
                "<%s>%s%s</%s>",
                String.join(" ", List.of(name, stringAttributes)).trim(),
                text,
                strSubTags,
                name
        );

        return result;
    }
}
// END
