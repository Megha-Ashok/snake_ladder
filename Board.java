package board;

import java.util.HashMap;

import jumper.Jumper;

public class Board {
    int size;
    public String board[][];
    public HashMap<String, Jumper> jumpers;

    public Board(int size, HashMap<String, Jumper> jumpers) {
        this.jumpers = jumpers;
        this.size = size;
        board = new String[size][size];
        int count = 1;
        for (int i = 9; i >= 0; i--) {
            if (i % 2 == 0) {
                for (int j = 9; j >= 0; j--) {
                    board[i][j] = "" + count;
                    count++;
                }
            } else {
                for (int j = 0; j < 10; j++) {
                    board[i][j] = "" + count;
                    count++;
                }
            }
        }
    }

    public void setboard() {
        int count = 1;
        for (int i = 9; i >= 0; i--) {
            if (i % 2 == 0) {
                for (int j = 9; j >= 0; j--) {
                    board[i][j] = "" + count;
                    count++;
                }
            } else {
                for (int j = 0; j < 10; j++) {
                    board[i][j] = "" + count;
                    count++;
                }
            }
        }
    }

    public int getboardsize() {
        return this.size;
    }

    public void printboard() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 9) {
                    System.out.print(board[i][j] + "  ");
                } else {
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

}
