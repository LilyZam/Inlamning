package Counter;

public class Counter {
    private int rows;
    private int chars;

    public Counter() {
        this.rows = 0;
        this.chars = 0;


    }

    public void checkText(String text) {
        rows++;
        chars += text.length();

    }

    public int getRows() {
        return rows;
    }


    public int getTotalChars() {
        return chars;
    }


}
