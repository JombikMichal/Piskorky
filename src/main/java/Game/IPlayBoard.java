package Game;

public interface IPlayBoard {
    void displayMatrix();
    void updatePoint(int x, int y,Player player);
    boolean win();
}
