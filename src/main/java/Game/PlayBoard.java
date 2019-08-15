package Game;

public class PlayBoard implements IPlayBoard{

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

    @Override
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

    @Override
    public void updatePoint(int x, int y,Player player){
        for (int i = 0; i < dimensions[0].length; i++){
            for (int j = 0; j <dimensions.length;j++){
                if (i == x && j == y){
                    if(dimensions[i][j].getPlayer() != null){
                        System.out.println("This point is already taken!");
                    }else {
                        dimensions[i][j].setPlayer(player);
                    }
                }
            }
        }
    }

    @Override
    public boolean win(){
        for (int i = 0; i < dimensions[0].length-2;i++){
            for (int j = 0; j < dimensions.length-2;j++){
                if(dimensions[i][j].getPlayer() == dimensions[i][j+1].getPlayer() && dimensions[i][j+1].getPlayer() == dimensions[i][j+2].getPlayer()&&
                        dimensions[i][j].getPlayer() != null && dimensions[i][j+1].getPlayer() != null && dimensions[i][j+2].getPlayer() != null){
                    return true;
                }
                if(dimensions[i][j].getPlayer() == dimensions[i+1][j].getPlayer() && dimensions[i+1][j].getPlayer() == dimensions[i+2][j].getPlayer()&&
                        dimensions[i][j].getPlayer() != null && dimensions[i+1][j].getPlayer() != null && dimensions[i+2][j].getPlayer() != null){
                    return true;
                }
                if(dimensions[i][j].getPlayer() == dimensions[i+1][j+1].getPlayer() && dimensions[i+1][j+1].getPlayer() == dimensions[i+2][j+2].getPlayer()&&
                        dimensions[i][j].getPlayer() != null && dimensions[i+1][j+1].getPlayer() != null && dimensions[i+2][j+2].getPlayer() != null){
                    return true;
                }
            }
        }

        for (int i = 0; i < dimensions[0].length-3;i++){
            for (int j = dimensions.length-1; j > 2;j--){
                if(dimensions[i][j].getPlayer() == dimensions[i+1][j-1].getPlayer() && dimensions[i+1][j-1].getPlayer() == dimensions[i+2][j-2].getPlayer()&&
                        dimensions[i][j].getPlayer() != null && dimensions[i+1][j-1].getPlayer() != null && dimensions[i+2][j-2].getPlayer() != null){
                    return true;
                }
            }
        }

        return false;
    }

}
