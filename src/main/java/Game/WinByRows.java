package Game;

public class WinByRows implements IWinable{
    // toto je len uvaha/priprava
    @Override
    public boolean win(int x, int y,Point[][] dimensions){
        for (int i = 0; i < dimensions[0].length-2;i++) {
            for (int j = 0; j < dimensions.length - 2; j++) {
                if (dimensions[i][j].getPlayer() == dimensions[i][j + 1].getPlayer() && dimensions[i][j + 1].getPlayer() == dimensions[i][j + 2].getPlayer() &&
                        dimensions[i][j].getPlayer() != null && dimensions[i][j + 1].getPlayer() != null && dimensions[i][j + 2].getPlayer() != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
