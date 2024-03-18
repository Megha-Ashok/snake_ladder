package coordinate;

public class Coordinate {
    int row;
    int col;

    public Coordinate(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public String printcoordinate() {
        StringBuilder s = new StringBuilder();
        s.append('[').append(this.row).append(',').append(this.col).append(']');
        return s.toString();
    }

    public int getRow() {
        return this.row;
    }
    public int getCol(){
        return this.col;
    }
}
