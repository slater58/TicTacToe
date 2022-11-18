public class Grid {
    String[][] game = new String[3][3];

    public Grid() {
        InitializeGrid();
    }
    /**
     * sets every value in the grid to be "*"
     */
    public void InitializeGrid() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                game[i][j] = "*";
            }
        }
    }

    /**
     * checks every possible win condition and returns true if either player wins
     * @return
     */
    public boolean winCheck() {
        String winner = null;
        for (int i = 1; i < 9; i++) {
            switch (i) {
                case 1:
                    winner = game[0][0] + game[0][1] + game[0][2];
                    break;
                case 2:
                    winner = game[1][0] + game[1][1] + game[1][2];
                    break;
                case 3:
                    winner = game[2][0] + game[2][1] + game[2][2];
                    break;
                case 4:
                    winner = game[0][0] + game[1][0] + game[2][0];
                    break;
                case 5:
                    winner = game[0][1] + game[1][1] + game[2][1];
                    break;
                case 6:
                    winner = game[0][2] + game[1][2] + game[2][2];
                    break;
                case 7:
                    winner = game[0][0] + game[1][1] + game[2][2];
                    break;
                case 8:
                    winner = game[0][2] + game[1][1] + game[2][0];
                    break;

            }
            if (winner.equals("XXX")) {
                System.out.println("X won the game");
                return true;
            } else if (winner.equals("OOO")) {
                System.out.println("O won the game");
                return true;
            }
        }
        return false;

    }
    /**
     * displays the Game array as a grid
     */
    public void printGrid() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" | " + game[i][j]);
            }
            System.out.println(" | ");
        }
    }

    /**
     * places a value in the game unless its already taken
     * @param player the value of X or O 
     * @param i row
     * @param j column
     */
    public void editGrid(String player, int i, int j) {
        if (game[i][j].equals("*"))
            game[i][j] = player;
        else {
            System.out.println("already taken please enter a valid input");
        }
    }
    /**
     * checks to see if the game is completely filled
     * @return
     */
    public boolean checkFull() {
        boolean isFull = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (game[i][j].equals("*")) {
                    isFull = false;
                }
            }
        }
        return isFull;
    }
}