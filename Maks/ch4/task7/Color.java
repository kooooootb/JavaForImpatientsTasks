package ch4.task7;

public enum Color {
    BLACK, RED, BLUE, GREEN, CYAN, MAGENTA, YELLOW, WHITE;

    public static Color getRed(){
        return Color.RED;
    }
    public static Color getGreen(){
        return Color.GREEN;
    }
    public static Color getBlue(){
        return Color.BLUE;
    }
    public static void main(String[] args) {
        Color red = Color.getRed();
        Color green = Color.getGreen();
        Color blue = Color.getBlue();
    }
}
