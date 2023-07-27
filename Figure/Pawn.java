package Figure;

import java.awt.*;
import java.util.Set;

public class Pawn extends Figure {

    private Set<Point> enabled_move;
    private boolean is_moved;

    public Pawn(String color, String type, Point cord) {
        super(color, type, cord);
        is_moved = false;
        createPattern();
    }

    private void createPattern(){
        if (this.getColor() == Figure.Color.WHITE)
        {
            pattern_move.add(new Point(0,-1));
        }
        else if (this.getColor()==Color.BLACK)
        {
            pattern_move.add(new Point(0,1));
        }
    }

    @Override
    public Set<Point> Enabled_move(String[][] deck) {

        int x = getCord().x, y = getCord().y;

        for (Point p :pattern_move)
        {
            if (deck[x+p.x][y+p.y].equals(""))
                enabled_move.add(new Point(x,y));
        }

        //first step 2 point
        if (!is_moved) {
            if (this.getColor() == Color.WHITE && deck[x][y - 2].equals("")) {
                enabled_move.add(new Point(x, y - 2));
            }
            else if (deck[x][y + 2].equals("")){
                enabled_move.add(new Point(x, y + 2));
            }
        }

        //check eat
        if (this.getColor() == Color.WHITE) {
            enabled_move.add(new Point(x - 1, x - 1));
            enabled_move.add(new Point(x + 1, y - 1));
        }
        else {
            enabled_move.add(new Point(x - 1, y + 1));
            enabled_move.add(new Point(x + 1, y + 1));
        }

        return enabled_move;
    }

    public void Step(String[][] deck, Set<Point> enabled_move, Point step){
        if (enabled_move.contains(step)){
            history.push(getCord());
            deck[getCord().x][getCord().y] = "";
            deck[step.x][step.y] = String.valueOf(getType());
        }
    }
}
