package ch4.task9;

public class Player {
    private int x, y;
    private String name;
    private int[] targets;
    Player(String name, int x, int y){
        this.name = name;
        this.x = x;
        this.y = y;
        this.targets = new int[] {1, 2, 3};
    }
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
    void move(int x, int y){
        this.x += x;
        this.y += y;
    }
}
