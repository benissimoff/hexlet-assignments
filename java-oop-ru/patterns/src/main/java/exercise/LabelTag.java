package exercise;

// BEGIN
class LabelTag implements TagInterface {
    private String labelText;
    private TagInterface tag;
    LabelTag(String labelText, TagInterface tag) {
        this.labelText = labelText;
        this.tag = tag;
    }

    public String render() {
        String result = String.format("<label>%s%s</label>", this.labelText, tag.render());

        return result;
    }
}
// END
