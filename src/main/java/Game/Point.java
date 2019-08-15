package Game;

import java.util.List;

public class Point {
    private int x;
    private int y;
    private Player player;


    public Point(int x, int y,Player player) {
        this.x = x;
        this.y = y;
        this.player = player;
    }


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Player getPlayer() {
        return player;
    }
}
