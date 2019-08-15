package Game;

public class PlayBoard {

    private Point [][] dimensions;

    public PlayBoard(int countRows, int countCol) {
        //mxn matrix
        this.dimensions = new Point[countRows][countCol];
        createPointsList();
    }

    private void createPointsList(){
        for (int i = 0; i < dimensions[0].length; i++){
            for (int j = 0; j <dimensions.length;j++){
                dimensions[i][j] = new Point(i,j,null);
            }
        }
    }

    public void displayMatrix(){
        for (int i = 0; i < dimensions[0].length; i++){
            for (int j = 0; j <dimensions.length;j++){
                if(dimensions[i][j].getPlayer() != null){
                    System.out.print(dimensions[i][j].getPlayer().getFlag());
                }else {System.out.print("\u25A1 ");}

            }
            System.out.println("");
        }
    }

    public void updatePoint(int x, int y,Player player){
        for (int i = 0; i < dimensions[0].length; i++){
            for (int j = 0; j <dimensions.length;j++){
                if (i == x && j == y){
                    dimensions[i][j].setPlayer(player);
                }
            }
        }
    }

    public Point[][] getDimensions() {
        return dimensions;
    }

}
