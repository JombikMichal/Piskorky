package Game;

public class Player {
    private String name;
    private String flag;

    public Player(String name, String flag) {
        this.name = name;
        this.flag = flag + " ";
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
