import java.util.Scanner;

public class UI {
    static Scanner in;
    static Grid g;

    /**
     * initializes the grid and opens the menu
     */
    public static void InitializeGame() {
        g = new Grid();
        in = new Scanner(System.in);
        menu();

    }

    /**
     * Gives the players the option to play or quit
     */
    public static void menu() {
        System.out.println("welcome to tic tac toe");
        boolean run = true;
        while (run) {
            System.out.println("please select an option:\n1. Play\n2. quit");
            int answer = in.nextInt();
            switch (answer) {
                case 1:
                    rungame();
                    break;

                case 2:
                    // quit
                    System.out.println("Thanks for playing");
                    run = false;
                    break;
            }
        }
    }

    /**
     * edits the grid and breaks when there is a tie or someone wins
     */
    public static void rungame() {
        int input;
        String turn;
        String playerOne = "X";
        String playerTwo = "O";
        for (int i = 0; true; i++) {
            if (i % 2 == 0) {
                turn = playerOne;
            } else {
                turn = playerTwo;
            }

            do {
                System.out.println("please enter a number 1-9");
                input = in.nextInt();
            } while (input < 1 || input > 9);
            switch (input) {
                case 1:
                    g.editGrid(turn, 0, 0);
                    break;
                case 2:
                    g.editGrid(turn, 0, 1);

                    break;
                case 3:
                    g.editGrid(turn, 0, 2);

                    break;
                case 4:
                    g.editGrid(turn, 1, 0);

                    break;
                case 5:
                    g.editGrid(turn, 1, 1);

                    break;
                case 6:
                    g.editGrid(turn, 1, 2);

                    break;
                case 7:
                    g.editGrid(turn, 2, 0);

                    break;
                case 8:
                    g.editGrid(turn, 2, 1);

                    break;
                case 9:
                    g.editGrid(turn, 2, 2);

                    break;
            }
            if (g.winCheck())
                break;
            g.printGrid();
            if (g.checkFull()) {
                System.out.println("No Winner");
                break;
            }
        }
        g.InitializeGrid();
    }
}
