package game;

import board.Board;
import coordinate.Coordinate;
import dice.Dice;
import jumper.Jumper;
import player.Player;

public class Game {
    Board board;
    Player players[];
    Dice dice;
    int turn;
    Coordinate places[];
    boolean isAllowed[];

    public Game(Board board, Player players[], Dice dice) {
        this.board = board;
        this.players = players;
        this.dice = dice;
        turn = 0;
        isAllowed = new boolean[players.length];
        places = new Coordinate[players.length];
        for (int i = 0; i < players.length; i++)
            places[i] = new Coordinate(board.getboardsize() - 1, 0);
    }

    public void play() {
        while (true) {
            int num = dice.diceRoll();
            System.out.println("Player name: " + players[turn].getName() + "rolled->" + num + ". "
                    + places[turn].printcoordinate());
            if (!isAllowed[turn]) {
                if (num != 1) {
                    turn = 1 - turn;
                    continue;
                } else {
                    isAllowed[turn] = true;
                }
            }
            Coordinate newCoordinate = getNewCoordinate(places[turn], num);
            if (newCoordinate.getRow() < 0) {
                System.out.println(players[turn].getName() + "has won");
                return;
            }
            places[turn] = newCoordinate;
            turn = 1 - turn;
        }
    }

    private Coordinate getNewCoordinate(Coordinate oldCoordinate, int num) {
        int row = oldCoordinate.getRow();
        int col = oldCoordinate.getCol();
        while (num > 0) {
            if (row % 2 != 0) {
                if (col == board.getboardsize() - 1)
                    row--;
                else
                    col++;
            } else {
                if (col == 0)
                    row--;
                else
                    col--;
            }
            num--;
        }
        if (row < 0)
            return new Coordinate(row, col);
        if (checkifJumperExists(row, col)) {
            Jumper jumpers = board.jumpers.get(board.board[row][col]);
            return jumpers.end;
        }
        return new Coordinate(row, col);
    }

    private boolean checkifJumperExists(int row, int col) {
        return board.jumpers.containsKey(board.board[row][col]);
    }
}
