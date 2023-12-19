public enum CommandWord {
    GO("go"), LOOK("look"), TAKE("take"), DROP("drop"), EAT("eat"),
    HELP("?"), QUIT("stop"), UNKNOWN("");
    private String word;

    CommandWord(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }
}
