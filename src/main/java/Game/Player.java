package Game;

public class Player {
    private String name;
    private String flag;
    private boolean isWinner;

    public Player(String name, String flag) {
        this.name = name;
        this.flag = flag + " ";
        this.isWinner = false;
    }

    public void setWinner(boolean winner) {
        isWinner = winner;
    }

    public boolean isWinner() {
        return isWinner;
    }

    public String getName() {
        return name;
    }

    public String getFlag() {
        return flag;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
