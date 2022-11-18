public class Grid {
    String[][] game = new String[3][3];

    public Grid() {

    }

    public void InitializeGrid() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                game[i][j] = "*";
            }
        }
    }

    public boolean winCheck() {
        String playerOne = "x";
        String playerTwo = "O";
        int playerOneCount = 0, playerTwoCount = 0;
        return true;
        //write nested for loop hell here
    }

    public void printGrid() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" | " + game[i][j]);
            }
            System.out.println(" | ");
        }
    }

    public void editGrid(String player, int i, int j) {
        if (game[i][j].equals("*"))
            game[i][j] = player;
        else {
            System.out.println("already taken please enter a valid input");
        }
    }

    public boolean checkFull() {
        boolean isFull = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(game[i][j].equals("*")){
                    isFull = false;
                }
            }
        }
        return isFull;
    }
}