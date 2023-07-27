package Figure;
import java.awt.*;
import java.util.Set;
import java.util.Stack;

public class Figure {
    protected enum Color{
        BLACK,
        WHITE
    }
    private final Color color;
    private enum Type{
        BISHOP,
        QUEEN,
        KING,
        PAWN,
        ROOK,
        KNIGHT
    }
    private final Type type;

    protected Stack<Point> history;

    protected Set<Point> pattern_move;
    private Point cord;

    public Figure(String color, String type, Point cord){
        this.type = Type.valueOf(type);
        this.color = Color.valueOf(color);
        this.cord = cord;
    }

    public Set<Point> Enabled_move(String[][] deck){
        return null;
    }
    public Color getColor() {
        return color;
    }

    public Type getType() {
        return type;
    }

    public Point getCord() {
        return cord;
    }

    public void setCord(Point cord) {
        this.cord = cord;
    }
}
