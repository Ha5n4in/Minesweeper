import java.util.Random;

public class Board {
    private Tile[][] gameBoard;
    private int rows;
    private int cols;

    private int NumOfMines;

    private int TotalShown;

//    private final int[][] gameBoard;
//
//    private final int[][]  backBoard;

    Random random = new Random();

    public Board(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        gameBoard = new Tile[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int n = 0; n <cols; n++) {
                gameBoard[i][n] = new Tile();
            }
        }
        NumOfMines = 0;
        TotalShown = 0;
    }

    public void displayBoard() {
        for(int i = 0; i < rows; i++) {
            for(int n = 0; n < cols; n++) {
                System.out.print(gameBoard[i][n]+ " ");
            }
            System.out.println(" |"+ (i+1));
        }
        for(int n = 0; n < cols; n++) {
            System.out.print("_ ");
        }
        System.out.println();
        for( int n = 0; n < cols; n++) {
            System.out.print((n + 1) + " ");
            if (n + 1 < 10) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }


}
