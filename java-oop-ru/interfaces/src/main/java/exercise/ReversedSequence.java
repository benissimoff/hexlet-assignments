package exercise;

// BEGIN
class ReversedSequence implements CharSequence {
    private String reversedText;
    ReversedSequence(String inputText) {
        this.reversedText = inputText;
    }

    @Override
    public int length() {
        return reversedText.length();
    }

    @Override
    public char charAt(int index) {
        return reversedText.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
// END
