import java.util.HashMap;

import board.Board;
import coordinate.Coordinate;
import dice.Dice;
import game.Game;
import jumper.Jumper;
import player.Player;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<String, Jumper> map = new HashMap<>();
        map.put("6", new Jumper(new Coordinate(9, 5), new Coordinate(6, 6)));
        map.put("97", new Jumper(new Coordinate(0, 1), new Coordinate(9, 9)));
        map.put("21", new Jumper(new Coordinate(7, 0), new Coordinate(0, 9)));
        map.put("64", new Jumper(new Coordinate(3, 3), new Coordinate(7, 4)));

        Player p[] = new Player[2];
        p[0] = new Player();
        p[0].userinput();
        p[0].getplayerdetails();
        p[1] = new Player();
        p[1].userinput();
        p[1].getplayerdetails();
        Dice d = new Dice();
        System.out.println(d.diceRoll());
        Coordinate c = new Coordinate(10, 3);
        Coordinate c1 = new Coordinate(90, 2);
        System.out.println(c.printcoordinate());
        Jumper j = new Jumper(c, c1);
        System.out.println(j.getJumperName());

        Board b = new Board(10, map);
        b.printboard();
        Game game = new Game(b, new Player[] { p[0], p[1] }, new Dice());
        game.play();

    }

}
