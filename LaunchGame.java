class TicTacToy {
    char[][] board;

    public TicTacToy() {
        board = new char[3][3];
        initBoard();
    }

    void initBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
    }

    void displayBoard() {
        System.out.println("-------------");
        for (int i = 0; i < board.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    void placeMark(int row, int col, char mark) {
        if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
            board[row][col] = mark;
        } else {
            System.out.println("Invalid position");
        }
    }

    boolean checkColWin() {
        for (int j = 0; j <= 2; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                return true;
            }
        }
        return false;
    }

    boolean checkRowWin() {
        for(int i = 0; i<=2; i++) {
            if(board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
               return true; 
            }
        }
        return false;
    }
}

public class LaunchGame {
    public static void main(String[] args) {
        TicTacToy t = new TicTacToy();
        t.displayBoard();
        t.placeMark(0, 0, 'X');
        t.placeMark(1, 1, 'O');
        t.displayBoard();
        System.out.println(t.checkColWin());
        System.out.println(t.checkRowWin());
    }
}