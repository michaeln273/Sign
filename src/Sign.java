public class Sign {
    private String message;
    private int width;
    public Sign(String message, int width) {
        this.message = message;
        this.width = width;
    }

    public int numberOfLines() {
        int len = message.length();
        if (len == 0) return 0;
        if (len < width) return 1;
        return (int)Math.ceil(len / (double)width);
    }

    public String getLines() {
        String lines = "";
        int last = 0;
        int numLines = numberOfLines();

        if (numLines == 0) return null;

        for (int i = 0; i < numLines - 1; i++) {
            lines += message.substring(last, last + width);
            last += width;
            lines += ';';
        }
        lines += message.substring(last);
        return lines;
    }
}
